package com.cd.apls.domain.model;


import lombok.Builder;
import lombok.Getter;

@Getter
public class Token {

    @Builder
    public Token(Long id, String trId, String tknNo, String expirationDate, String status) {
        this.id = id;
        this.trId = trId;
        this.tknNo = tknNo;
        this.expirationDate = expirationDate;
        this.status = status;
    }

    private Long id;
    private String trId;
    private String tknNo;
    private String expirationDate;
    private String status;


}


