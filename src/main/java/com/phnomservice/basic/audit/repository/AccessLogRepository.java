package com.phnomservice.basic.audit.repository;

import com.phnomservice.basic.audit.domain.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessLogRepository extends JpaRepository<AccessLog, Long> {
    Optional<AccessLog> findByRemoteAddress(final String address);
}
