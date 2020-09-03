package com.phnomservice.basic.keyvalue.dao;

import com.phnomservice.basic.keyvalue.domain.KeyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyValueRepository extends JpaRepository<KeyValue, Long> {
}