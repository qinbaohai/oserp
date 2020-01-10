package com.matewell.oserp.controller;

import com.matewell.oserp.entity.Department;
import com.matewell.oserp.jpa.DepartmentJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentJPA departmentJPA;
    @PutMapping("")
    public void save(@RequestBody Department department) {
        departmentJPA.save(department);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        departmentJPA.deleteById(id);
    }
    @GetMapping("")
    public List<Department> findAll() {
        return departmentJPA.findAll();
    }
    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long id) {
        return departmentJPA.findById(id).get();
    }
}
