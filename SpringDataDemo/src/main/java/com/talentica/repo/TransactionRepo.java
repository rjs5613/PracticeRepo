package com.talentica.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentica.domain.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, String> {

}
