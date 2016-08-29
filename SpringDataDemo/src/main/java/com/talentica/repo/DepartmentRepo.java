package com.talentica.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentica.domain.Department;

public interface DepartmentRepo extends JpaRepository<Department, String> {

}
