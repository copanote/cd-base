package com.cd.apls.adapter.shared.out.persistence;


import com.cd.apls.domain.model.Pan;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@ToString(exclude = {"tokens"})
public class PanEntity {

    @Builder
    public PanEntity(List<TokenEntity> tokens, String expirationDate, String panNo, Long id) {
        this.tokens = tokens;
        this.expirationDate = expirationDate;
        this.panNo = panNo;
        this.id = id;
        this.tokens = new ArrayList<>();
    }

    @Id
    @GeneratedValue
    @Column(name = "pan_id")
    private Long id;
    private String panNo;
    private String expirationDate;

    @OneToMany(mappedBy = "pan")
    private List<TokenEntity> tokens = new ArrayList<>();

    public void changePanNo(String panNo) {
        this.panNo = panNo;
    }

    public void addToken(TokenEntity token) {
        tokens.add(token);
    }

    public Pan toDomain() {
        return Pan.builder()
                .id(id)
                .panNo(panNo)
                .expirationDate(expirationDate)
                .build();
    }
}
