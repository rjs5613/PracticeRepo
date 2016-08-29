package com.talentica.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentica.domain.DateTime;

public interface DateTimeRepo extends JpaRepository<DateTime, String> {

}
