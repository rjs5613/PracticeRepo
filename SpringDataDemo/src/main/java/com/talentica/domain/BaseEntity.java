/**
 * 
 */
package com.talentica.domain;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import com.talentica.listener.BaseEntityChangeListener;

import lombok.Getter;
import lombok.Setter;

/**
 * Base Class for All Entity With ID as UUID and Created, Last Modified Date For
 * Audit
 * 
 * @author RajeshK
 *
 */

@Getter
@Setter
@MappedSuperclass
@EntityListeners(value = BaseEntityChangeListener.class)
public class BaseEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private Date lastModified;

	private Date Created;

}
