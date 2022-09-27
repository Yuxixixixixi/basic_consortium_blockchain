package com.mindata.blockchain.core.repository;

import com.mindata.blockchain.core.model.SyncEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyncRepository extends JpaRepository<SyncEntity, Long> {
    SyncEntity findTopByOrderByIdDesc();
}
