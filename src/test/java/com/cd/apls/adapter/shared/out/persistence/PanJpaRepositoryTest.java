package com.cd.apls.adapter.shared.out.persistence;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;


import static org.junit.jupiter.api.Assertions.*;


@Transactional
@Slf4j
@ActiveProfiles("test")
@SpringBootTest
class PanJpaRepositoryTest {

    @Autowired
    PanJpaRepository panJpaRepository;


    @Test
    @Rollback(value = false)
    public void testCrudPan() {
        //Given

        TokenEntity token = TokenEntity.builder()
                .tknNo("9999111122223333")
                .trId("APPLE")
                .expirationDate("9999")
                .status("02")
                .build();



        PanEntity pan = PanEntity.builder()
                .panNo("1111222233334444")
                .expirationDate("2912")
                .build();

        pan.addToken(token);


        PanEntity pan2 = PanEntity.builder()
                .panNo("2222333333334444")
                .expirationDate("2912")
                .build();
        //When
        PanEntity saved = panJpaRepository.save(pan);
        PanEntity saved2 = panJpaRepository.save(pan2);


        PanEntity findPan = panJpaRepository.findById(saved.getId()).get();
        saved2.changePanNo("2222-3333-4444-5555");
        PanEntity findPan2 = panJpaRepository.findById(saved2.getId()).get();

        //Then
        assertEquals("1111222233334444", findPan.getPanNo());
        assertEquals("2222-3333-4444-5555", findPan2.getPanNo());
    }





}