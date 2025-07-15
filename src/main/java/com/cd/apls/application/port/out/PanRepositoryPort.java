package com.cd.apls.application.port.out;

import com.cd.apls.domain.model.Pan;
import com.cd.apls.domain.model.Token;

import java.util.Optional;

public interface PanRepositoryPort {

    void save(Pan pan);
    Optional<Pan> findById(Long id);

}
