package com.restservice.RestServiceTask.repository;

import com.restservice.RestServiceTask.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<MessageEntity,Long> {
}
