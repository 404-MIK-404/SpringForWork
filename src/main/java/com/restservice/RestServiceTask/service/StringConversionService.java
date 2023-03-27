package com.restservice.RestServiceTask.service;

import com.restservice.RestServiceTask.dto.StringConversionDTO;
import com.restservice.RestServiceTask.entity.StringConversionEntity;
import com.restservice.RestServiceTask.mapper.StringConversionMapper;
import com.restservice.RestServiceTask.repository.StringConversionRepo;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

@Service
@AllArgsConstructor
public class StringConversionService {

    private final StringConversionRepo stringConversionRepo;

    private final StringConversionMapper stringConversionMapper;

    private final String CONSONANTS_STRING = "бвгджзйклмнпрстфхцчшщ";


    public Long getCountRecord() throws Exception {
        return stringConversionRepo.count();
    }

    public StringConversionDTO TransformStrings(ArrayList<Character> text) throws Exception{
        StringBuilder res = new StringBuilder();
        String originalText = text.stream().map(e->e.toString()).reduce((acc,e) -> acc + e).get();
        StringConversionEntity resQuery = stringConversionRepo.findByOriginalString(originalText);

        if (resQuery != null ){
            return stringConversionMapper.toDTO(resQuery);
        } else {

            for (int i = 0; i < text.size();i++){
                String textChar = (text.get(i) + "").toLowerCase(Locale.ROOT);
                if (CONSONANTS_STRING.indexOf(textChar) != -1){
                    res.append(text.get(i));
                }
            }

            resQuery = StringConversionEntity.builder()
                    .dateSave(new Date())
                    .originalString(originalText)
                    .convertedString(res.toString())
                    .build();

            stringConversionRepo.save(resQuery);
            return stringConversionMapper.toDTO(resQuery);
        }
    }




}
