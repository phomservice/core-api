package com.phnomservice.user.authorization.service;

import com.phnomservice.persistence.exception.ResourceNotFoundException;
import com.phnomservice.user.authorization.domain.Permission;
import com.phnomservice.user.authorization.repository.PermissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PermissionService {

    private final PermissionRepository repository;

    public List<Permission> getAll() {
        return repository.findAll();
    }

    public Permission getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(Permission.class, id));
    }

    public List<Permission> getAllByIds(List<Long> ids){
        return repository.findAllById(ids);
    }
}
