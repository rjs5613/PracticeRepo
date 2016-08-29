package com.talentica.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class to Contain the Department Dimension
 * 
 * @author RajeshK
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "name", "parent" }) })
public class Department extends BaseEntity {

	@NotNull
	private String name;

	@NotNull
	private String parent;

	public Department() {
	}

	public Department(String name, String parent) {
		super();
		this.name = name;
		this.parent = parent;
	}

}
