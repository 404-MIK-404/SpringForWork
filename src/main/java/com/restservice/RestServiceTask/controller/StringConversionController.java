package com.restservice.RestServiceTask.controller;

import com.restservice.RestServiceTask.exception.RecordCountNotFoundException;
import com.restservice.RestServiceTask.exception.TransformStringNotCompleted;
import com.restservice.RestServiceTask.service.StringConversionService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
public class StringConversionController {

    private final StringConversionService stringConversionService;


    @PostMapping("/transform")
    public Map<String, String> transformString(@RequestBody Map<String, ArrayList<Character>> text){
        return Optional.of(Collections.singletonMap("Result Transform", stringConversionService.TransformStrings(text.get("text"))
                .getConvertedString())).orElseThrow( () -> new TransformStringNotCompleted("Transform error !")
            );
    }

    @GetMapping("/count")
    public Map<String, Long> countRecord(){
        Optional<Long> res = Optional.ofNullable(stringConversionService.getCountRecord());
        return Optional.of(Collections.singletonMap("Count Record", stringConversionService.getCountRecord())).orElseThrow(
                () -> new RecordCountNotFoundException("Record count not found"));
    }



}
