package com.example.lab308.activity1.repos;

import com.example.lab308.activity1.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    List<Chapter> findByPresident_Name(String president);

    List<Chapter> findByDistrictContaining(String district);

}
