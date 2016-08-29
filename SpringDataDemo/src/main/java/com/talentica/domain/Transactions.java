package com.talentica.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import com.talentica.constant.Currency;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class to Contain Fact for All transaction
 * 
 * @author RajeshK
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = { "department_id", "location_id", "date_time_id", "transaction_type_id" }) })
public class Transactions extends BaseEntity {

	@NotNull
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Department department;

	@NotNull
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Location location;

	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	private DateTime dateTime;

	@NotNull
	private BigDecimal value;

	@NotNull
	@Enumerated(value = EnumType.STRING)
	private Currency currency;

	@NotNull
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private TransactionType transactionType;

	public static Transactions from(Department department, Location location, TransactionType transactionType) {
		Transactions transactions = new Transactions();
		transactions.setDepartment(department);
		transactions.setLocation(location);
		transactions.setTransactionType(transactionType);
		return transactions;
	}

}
