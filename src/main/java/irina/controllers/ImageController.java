package irina.controllers;

import irina.domain.Picture;
import irina.repositories.ImageRepository;
import irina.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.File;
import java.io.IOException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ImageController {
//    @Autowired
//    private HttpServletRequest request;
    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping(value = "/image", method = RequestMethod.POST)
    public Long submit(@RequestParam("file") MultipartFile file, ModelMap modelMap) {

        Picture newPicture = new Picture();
        try {
            newPicture.setPictureData(file.getBytes());
            newPicture.setFileName(file.getOriginalFilename());
            imageRepository.save(newPicture);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newPicture.getId();
    }


  @GetMapping(value = "/image/{imageId}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImage(@PathVariable Long imageId) {

        Picture pic = imageRepository.getOne(imageId);

        return pic.getPictureData();
    }
}
