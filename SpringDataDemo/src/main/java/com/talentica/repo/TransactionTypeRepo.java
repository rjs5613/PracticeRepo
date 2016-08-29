package com.talentica.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentica.domain.TransactionType;

public interface TransactionTypeRepo extends JpaRepository<TransactionType, String> {


}
