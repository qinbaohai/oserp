package com.matewell.oserp.jpa;

import com.matewell.oserp.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentJPA extends JpaRepository<Department, Long> {
}
