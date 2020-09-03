package com.phnomservice.user.authorization.domain;

import com.phnomservice.persistence.domain.VersionEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class UserRole extends VersionEntity {

    @Column(nullable = false)
    private String name;
}
