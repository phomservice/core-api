package com.phnomservice.basic.file.domain;

import com.phnomservice.persistence.domain.VersionEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class FileCategory extends VersionEntity {

    @Column(nullable = false)
    private String name;
}
