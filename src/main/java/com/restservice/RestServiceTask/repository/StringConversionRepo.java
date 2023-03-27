package com.restservice.RestServiceTask.repository;

import com.restservice.RestServiceTask.entity.StringConversionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StringConversionRepo extends JpaRepository<StringConversionEntity,Long> {

    StringConversionEntity findByOriginalString(String originalString);

}

