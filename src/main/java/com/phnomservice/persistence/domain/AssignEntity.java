package com.phnomservice.persistence.domain;

import com.phnomservice.user.authentication.domain.AppUser;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt", "status"}, allowGetters = true)
@Filter(name = "myObjectFilter", condition = "created_by = :id")
public abstract class AssignEntity extends VersionEntity {

    @JsonIgnore
    @CreatedBy
    @ManyToOne
    @JoinColumn(name = "created_by", updatable = false)
    private AppUser createdBy;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonIgnore
    @LastModifiedBy
    @ManyToOne
    @JoinColumn(name = "updated_by")
    private AppUser updatedBy;

    @LastModifiedDate
    @Column(name = "updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @Enumerated(EnumType.STRING)
    private AssignFor assignFor;

    @Enumerated(EnumType.STRING)
    private AssignStatus status = AssignStatus.ACTIVE;
}
