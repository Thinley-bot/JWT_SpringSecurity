package com.stockmanagement.stockmanagement.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class ImageService {
    @Value("${upload.path}")
    private String uploadPath;

    public void saveImage(MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            System.out.println("I m here again!!");
            String fileName = generateFileName(file.getOriginalFilename());
            Path path = Paths.get(uploadPath + File.separator + fileName);
            Files.write(path, file.getBytes());
        }
    }
    private String generateFileName(String originalFileName) {
        return UUID.randomUUID().toString() + "_" + originalFileName;
    }
}