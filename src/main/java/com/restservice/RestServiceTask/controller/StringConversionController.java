package com.restservice.RestServiceTask.controller;

import com.restservice.RestServiceTask.service.StringConversionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
public class StringConversionController {

    private final StringConversionService stringConversionService;


    @PostMapping("/transform")
    public ResponseEntity transformString(@RequestBody Map<String, ArrayList<Character>> text){
        try {
            String res = stringConversionService.TransformStrings(text.get("text")).toString();
            return new ResponseEntity<>(Collections.singletonMap("Result Transform", res), HttpStatus.OK);
        } catch (Exception ex){
            return ResponseEntity.badRequest().body("Server is not alive !");
        }
    }

    @GetMapping("/count")
    public ResponseEntity countRecord(){
        try {
            return new ResponseEntity(
                    Collections.singletonMap("Count Record", stringConversionService.getCountRecord()),
                    HttpStatus.OK
            );
        } catch (Exception ex){
            return ResponseEntity.badRequest().body("Error !");
        }
    }



}
