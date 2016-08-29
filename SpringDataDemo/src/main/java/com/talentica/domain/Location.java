package com.talentica.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class to contain the Location Dimension
 * 
 * @author RajeshK
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "city", "country" }) })
public class Location extends BaseEntity {

	@NotNull
	private String city;

	@NotNull
	private String country;

	public Location() {
	}

	public Location(String city, String country) {
		this.city = city;
		this.country = country;
	}

}
