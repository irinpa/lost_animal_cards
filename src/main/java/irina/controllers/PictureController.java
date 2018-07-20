package irina.controllers;

import irina.domain.Picture;
import irina.repositories.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PictureController {
    @Autowired
    private PictureRepository pictureRepository;

    @RequestMapping(value = "/picture", method = RequestMethod.POST)
    public Long submit(@RequestParam("file") MultipartFile file, ModelMap modelMap) {

        Picture newPicture = new Picture();
        try {
            newPicture.setPictureData(file.getBytes());
            newPicture.setPictureName(file.getOriginalFilename());
            pictureRepository.save(newPicture);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newPicture.getId();
    }


  @GetMapping(value = "/picture/{pictureId}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImage(@PathVariable Long pictureId) {

        Picture pic = pictureRepository.getOne(pictureId);

        return pic.getPictureData();
    }
}
