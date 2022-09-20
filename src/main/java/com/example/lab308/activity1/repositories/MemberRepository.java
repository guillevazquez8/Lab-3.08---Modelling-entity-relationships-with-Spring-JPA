package com.example.lab308.activity1.repositories;

import com.example.lab308.activity1.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
