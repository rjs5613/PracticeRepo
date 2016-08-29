/**
 * 
 */
package com.talentica.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.talentica.domain.Department;
import com.talentica.domain.Location;
import com.talentica.domain.TransactionType;
import com.talentica.exception.DepartmentNotFoundException;
import com.talentica.exception.LocationNotFoundException;
import com.talentica.exception.TransactionTypeNotFoundException;
import com.talentica.repo.DepartmentRepo;
import com.talentica.repo.LocationRepo;
import com.talentica.repo.TransactionTypeRepo;

/**
 * MIS Cache Implementation For Quickbooks
 * 
 * @author RajeshK
 *
 */
@Component
public class QBCache implements MISCache {
	
	@Autowired
	private TransactionTypeRepo transactionTypeRepo;
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Autowired
	private LocationRepo locationRepo;

	Map<String, Department> departmentMap = Collections.emptyMap();
	Map<String, Location> locationMap = Collections.emptyMap();
	Map<String, TransactionType> transactionTypeMap = Collections.emptyMap();

	@Override
	public void update() {
		
		updateDepartment();
		updateLocation();
		updateTransactionType();

	}

	private void updateTransactionType() {
		List<TransactionType> transactionTypes = transactionTypeRepo.findAll();
		transactionTypeMap = new HashMap<>();
		transactionTypes.forEach(transactionType->{
			transactionTypeMap.put(transactionType.getName(), transactionType);
		});
	}

	private void updateLocation() {
		List<Location> locations = locationRepo.findAll();
		locationMap = new HashMap<>();
		locations.forEach(location->{
			locationMap.put(location.getCountry(), location);
		});
	}

	private void updateDepartment() {
		List<Department> departments = departmentRepo.findAll();
		departmentMap = new HashMap<>();
		departments.forEach(department->{
			departmentMap.put(department.getName(), department);
		});
	}
	

	@Override
	public Department getDepartment(String name) throws DepartmentNotFoundException {
		if (StringUtils.isEmpty(name)) {
			throw new IllegalArgumentException("Department Name Can't be Empty to Fetch Department");
		}
		Department department = departmentMap.get(name);
		if (Objects.isNull(department)) {
			throw new DepartmentNotFoundException("Department : " + name + " is Not Present in System");
		}
		return department;
	}

	@Override
	public Location getLocation(String country) throws LocationNotFoundException {
		if (StringUtils.isEmpty(country)) {
			throw new IllegalArgumentException("Country Name Can't be Empty to Fetch Location");
		}

		Location location = locationMap.get(country);
		if (Objects.isNull(location)) {
			throw new LocationNotFoundException("Location : " + country + " is Not Present in System");
		}
		return location;
	}

	@Override
	public TransactionType getTransactionType(String name) throws TransactionTypeNotFoundException {
		if (StringUtils.isEmpty(name)) {
			throw new IllegalArgumentException("Transaction Type Name Can't be Empty to Fetch Transaction Type");
		}
		TransactionType transactionType = transactionTypeMap.get(name);
		if (Objects.isNull(transactionType)) {
			throw new TransactionTypeNotFoundException("Transaction Type : " + name + " is Not Present in System");
		}
		return transactionType;
	}

	@Override
	public void destroy() {
		departmentMap = Collections.emptyMap();
		locationMap = Collections.emptyMap();
		transactionTypeMap = Collections.emptyMap();
	}

}
