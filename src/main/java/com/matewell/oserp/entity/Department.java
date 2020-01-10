package com.matewell.oserp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Department{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
