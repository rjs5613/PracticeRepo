package com.talentica.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentica.domain.Location;

public interface LocationRepo extends JpaRepository<Location, String> {

}
