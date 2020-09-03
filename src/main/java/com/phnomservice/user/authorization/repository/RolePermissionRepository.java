package com.phnomservice.user.authorization.repository;

import com.phnomservice.user.authorization.domain.RolePermission;
import com.phnomservice.user.authorization.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
    List<RolePermission> findAllByRole(final UserRole role);
    List<RolePermission> findAllByRoleId(final Long id);
}
