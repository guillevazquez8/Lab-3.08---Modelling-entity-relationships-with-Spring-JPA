package com.example.lab308.activity1.repos;

import com.example.lab308.activity1.Chapter;
import com.example.lab308.activity1.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    List<Chapter> findByPresident_Name(String president);

    List<Chapter> findByDistrictContaining(String district);

}
