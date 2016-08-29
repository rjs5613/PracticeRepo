package com.talentica.domain;

import java.time.Month;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import com.talentica.constant.Quarter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class To Contain the Date Time Dimension <br>
 * Need to Set only the Date. Month, Quarter and Year will be set based on the
 * Date</br>
 * 
 * @author RajeshK
 *
 */
@Getter
@Setter
@ToString
@Entity
public class DateTime extends BaseEntity {

	@NotNull
	@Type(type = "date")
	private Date date;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Month month;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Quarter quarter;

	@NotNull
	private Long year;

	/**
	 * Sets the date, Month, Quarter, year
	 * 
	 * @param date
	 */
	@SuppressWarnings("deprecation")
	public void setDate(Date date) {
		this.date = date;
		int quarter = (date.getMonth() / 3);
		this.quarter = Quarter.values()[quarter];
		this.month = Month.values()[date.getMonth()];
		this.year = (long) date.getYear() + 1900;
		System.out.println(month);
	}
}
