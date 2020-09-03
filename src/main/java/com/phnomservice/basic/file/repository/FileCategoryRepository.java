package com.phnomservice.basic.file.repository;

import com.phnomservice.basic.file.domain.FileCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileCategoryRepository extends JpaRepository<FileCategory, Long> {
}
