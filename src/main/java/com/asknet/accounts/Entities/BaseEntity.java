package com.asknet.accounts.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String updatedAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(updatable = false)
    private LocalDateTime updatedBy;
}
