package com.stockmanagement.stockmanagement.controller;

import com.stockmanagement.stockmanagement.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/images")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @PostMapping("/upload")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            System.out.println("I m here");
            imageService.saveImage(file);
            return ResponseEntity.ok().build();
        } catch (IOException e) {
            System.out.println("okay");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
