package com.matewell.oserp.entity;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private int gender;
    private int departmentId;
    private int status;
    private String entryTime;
    private String departureTime;
}
