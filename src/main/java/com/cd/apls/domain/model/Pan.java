package com.cd.apls.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Pan {

    @Builder
    public Pan(Long id, String panNo, String expirationDate) {
        this.id = id;
        this.panNo = panNo;
        this.expirationDate = expirationDate;
    }

    private Long id;
    private String panNo;
    private String expirationDate;

    public boolean validExpirataionDate() {
        return true;
    }

}
