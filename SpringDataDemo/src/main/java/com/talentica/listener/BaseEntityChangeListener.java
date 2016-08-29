package com.talentica.listener;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.talentica.domain.BaseEntity;

public class BaseEntityChangeListener {

	@PrePersist
	public void beforeSave(BaseEntity abstractEntity) {

		abstractEntity.setCreated(getCurrentDate());
		abstractEntity.setLastModified(getCurrentDate());
	}

	@PreUpdate
	public void beforeUpdate(BaseEntity abstractEntity) {
		abstractEntity.setLastModified(getCurrentDate());
	}

	public Date getCurrentDate() {
		return new Date();
	}

}
