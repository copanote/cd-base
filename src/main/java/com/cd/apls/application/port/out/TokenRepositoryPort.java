package com.cd.apls.application.port.out;

import com.cd.apls.domain.model.Token;

public interface TokenRepositoryPort {

    void save(Token token);
    void findById(Long id);

}
