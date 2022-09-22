package com.example.lab308;

import com.example.lab308.activity1.Chapter;
import com.example.lab308.activity1.Member;
import com.example.lab308.activity1.Status;
import com.example.lab308.activity1.repos.ChapterRepository;
import com.example.lab308.activity1.repos.MemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
class Lab308ApplicationTests {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void setUp() {
        Chapter chapter1 = new Chapter();
        chapterRepository.save(chapter1);

        Chapter chapter2 = new Chapter();
        chapterRepository.save(chapter2);

        Member member1 = new Member();
        member1.setName("Chema");
        member1.setStatus(Status.ACTIVE);
        member1.setRenewalDate(LocalDate.of(2015, 9, 15));
        member1.setChapter(chapter1);
        memberRepository.save(member1);

        Member member2 = new Member();
        member2.setName("Maikol");
        member2.setStatus(Status.LAPSED);
        member2.setRenewalDate(LocalDate.of(2008, 7, 26));
        member2.setChapter(chapter1);
        memberRepository.save(member2);

        Member member3 = new Member();
        member3.setName("Migue");
        member3.setStatus(Status.ACTIVE);
        member3.setRenewalDate(LocalDate.of(2012, 7, 12));
        member3.setChapter(chapter2);
        memberRepository.save(member3);

        Member member4 = new Member();
        member4.setName("Breixo");
        member4.setStatus(Status.ACTIVE);
        member4.setRenewalDate(LocalDate.of(2018, 10, 28));
        member4.setChapter(chapter2);
        memberRepository.save(member4);

        chapter1.setName("Chapter 1");
        chapter1.setDistrict("Teis");
        chapter1.setPresident(member1);
        chapter1.getMembers().add(member1);
        chapter1.getMembers().add(member2);

        chapter2.setName("Chapter 2");
        chapter2.setDistrict("Coruxo");
        chapter2.setPresident(member3);
        chapter2.getMembers().add(member3);
        chapter2.getMembers().add(member4);
    }

    @AfterEach
    void tearDown() {
        memberRepository.deleteAll();
        chapterRepository.deleteAll();
    }

    @Test
    void test_application() {
        assertNotNull(chapterRepository.findAll());
    }

    @Test
    void test_findByPresident() {
        assertNotNull(chapterRepository.findByPresident_Name("Chema"));
        assertEquals(1, chapterRepository.findByPresident_Name("Chema").size());
    }

    @Test
    void test_findByDistrictContaining() {
        assertEquals(1, chapterRepository.findByDistrictContaining("eis").size());
    }

}
