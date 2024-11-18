package com.exemple.backend_spring.repository;

import com.exemple.backend_spring.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}