package com.talentica.cache;

import com.talentica.domain.Department;
import com.talentica.domain.Location;
import com.talentica.domain.TransactionType;
import com.talentica.exception.DepartmentNotFoundException;
import com.talentica.exception.LocationNotFoundException;
import com.talentica.exception.TransactionTypeNotFoundException;

/**
 * Cache Interface for MIS
 * 
 * @author RajeshK
 *
 */
public interface MISCache {

	/**
	 * Updates the MIS Cache
	 */
	void update();

	/**
	 * Gets the department
	 * 
	 * @param name
	 *            The Department Name <b>Cannot be Null or Empty</b>
	 * @return {@link Department} object
	 * @throws DepartmentNotFoundException
	 *             If Department is Not Present in the System
	 */
	Department getDepartment(String name) throws DepartmentNotFoundException;

	/**
	 * Gets the Location
	 * 
	 * @param country
	 *            the Country Name <b>Cannot be Null or Empty</b>
	 * @return {@link Location} object
	 * @throws LocationNotFoundException
	 *             If Location is Not Present in the System
	 */
	Location getLocation(String country) throws LocationNotFoundException;

	/**
	 * Gets the transaction Type
	 * 
	 * @param name
	 *            The Transaction Type Name <b>Cannot be Null or Empty</b>
	 * @return {@link TransactionType} object
	 * @throws TransactionTypeNotFoundException
	 *             If Transaction Type is Not Present in the System
	 */
	TransactionType getTransactionType(String name) throws TransactionTypeNotFoundException;

	/**
	 * Destroys the MIS Cache
	 */
	void destroy();

}
