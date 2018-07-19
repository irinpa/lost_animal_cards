package irina.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//@Service
public class ImageService {
//    private final Path rootLocation;
//
//    public Resource loadAsResource(String filename) {
//        try {
//            Path file = load(filename);
//            Resource resource = new UrlResource(file.toUri());
//            if(resource.exists() || resource.isReadable()) {
//                return resource;
//            }
//            else {
////                throw new StorageFileNotFoundException("Could not read file: " + filename);
//
//            }
//        } catch (MalformedURLException e) {
////            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
//        }
//    }
//
//    public Path load(String filename) {
//        return rootLocation.resolve(filename);
    }
//}
