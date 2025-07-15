package com.cd.apls.adapter.shared.out.persistence;

import com.cd.apls.application.port.out.PanRepositoryPort;
import com.cd.apls.domain.model.Pan;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class PanPersistenceAdapter implements PanRepositoryPort {

    private PanJpaRepository panJpaRepository;
    private PanDomainEntityMapper panDomainEntityMapper;

    public PanPersistenceAdapter(PanJpaRepository panJpaRepository, PanDomainEntityMapper panDomainEntityMapper) {
        this.panJpaRepository = panJpaRepository;
        this.panDomainEntityMapper = panDomainEntityMapper;
    }

    @Override
    public void save(Pan pan) {
        panJpaRepository.save(panDomainEntityMapper.domainToEntity(pan));
    }

    @Override
    public Optional<Pan> findById(Long id) {
        Optional<PanEntity> result = panJpaRepository.findById(id);
        return result.stream().map(p -> panDomainEntityMapper.entityToDomain(p)).findAny();
    }
}
