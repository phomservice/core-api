package com.phnomservice.basic.audit.service;

import com.phnomservice.appconfiguration.utils.ApplicationSecurityContext;
import com.phnomservice.basic.audit.domain.ActionType;
import com.phnomservice.basic.audit.domain.AuditLog;
import com.phnomservice.basic.audit.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
public class AuditLogService {

    @Autowired
    private AuditLogRepository repository;

    @Autowired
    private ApplicationSecurityContext context;

    @Async
    @Transactional
    public void insertAuditLog(final String entityType, final ActionType actionType, final String input) {
        final var log = new AuditLog()
                .setUserName(context.authenticatedUser().getUserName())
                .setTime(LocalDateTime.now())
                .setEntityType(entityType)
                .setActionType(actionType)
                .setInput(input)
                .setAction(actionType + " " + entityType + " with input: " + input);
        repository.save(log);
    }
}
