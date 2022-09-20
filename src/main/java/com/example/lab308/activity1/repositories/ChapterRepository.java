package com.example.lab308.activity1.repositories;

import com.example.lab308.activity1.models.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
