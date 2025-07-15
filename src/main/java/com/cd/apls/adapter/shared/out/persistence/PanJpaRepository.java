package com.cd.apls.adapter.shared.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PanJpaRepository extends JpaRepository<PanEntity, Long> {
}
