package com.talentica.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import com.talentica.constant.TransactionEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class to Contain Transaction Type Dimension (e.g: Revenue or Expense)
 * 
 * @author RajeshK
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "name", "parent" }) })
public class TransactionType extends BaseEntity {

	@NotNull
	private String name;

	@NotNull
	private String parent;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TransactionEnum type;

	public TransactionType(String name, String parent, TransactionEnum transactionEnum) {
		this.name = name;
		this.parent = parent;
		type = transactionEnum;
	}
	
	public TransactionType() {
	}

}
