package com.example.lab308.activity1.repos;

import com.example.lab308.activity1.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
