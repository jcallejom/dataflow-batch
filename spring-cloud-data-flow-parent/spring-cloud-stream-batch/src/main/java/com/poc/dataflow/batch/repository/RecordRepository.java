package com.poc.dataflow.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.dataflow.batch.entity.RecordEntity;

public interface RecordRepository extends JpaRepository<RecordEntity, Long> {
}
