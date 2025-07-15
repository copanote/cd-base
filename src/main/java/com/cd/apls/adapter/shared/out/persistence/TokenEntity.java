package com.cd.apls.adapter.shared.out.persistence;

import com.cd.apls.domain.model.Token;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class TokenEntity {

    @Builder
    public TokenEntity(Long id, String trId, String tknNo, String expirationDate, String status, PanEntity pan) {
        this.id = id;
        this.trId = trId;
        this.tknNo = tknNo;
        this.expirationDate = expirationDate;
        this.status = status;
        this.pan = pan;
    }

    @Id
    @GeneratedValue
    @Column(name = "token_id")
    private Long id;
    private String trId;
    private String tknNo;
    private String expirationDate;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pan_id")
    private PanEntity pan;

    public Token toDomain() {
        return Token.builder()
                .id(id)
                .trId(trId)
                .tknNo(tknNo)
                .expirationDate(expirationDate)
                .status(status)
                .build();
    }


}
