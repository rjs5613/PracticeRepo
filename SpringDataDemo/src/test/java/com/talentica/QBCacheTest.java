package com.talentica;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.talentica.cache.QBCache;
import com.talentica.domain.Department;
import com.talentica.domain.Location;
import com.talentica.domain.TransactionType;
import com.talentica.exception.DepartmentNotFoundException;
import com.talentica.exception.LocationNotFoundException;
import com.talentica.exception.TransactionTypeNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QBCacheTest {
	
	@Autowired
	private QBCache qbCache;
	
	@Before
	public void updateCache(){
		qbCache.update();
	}

	@Test(expected = DepartmentNotFoundException.class)
	public void testGetDepartmentException() throws DepartmentNotFoundException {
		qbCache.getDepartment("brand");
	}

	@Test(expected = TransactionTypeNotFoundException.class)
	public void testGetLocationException() throws TransactionTypeNotFoundException {
		qbCache.getTransactionType("location");
	}

	@Test(expected = TransactionTypeNotFoundException.class)
	public void testGetTransactionTypeException() throws TransactionTypeNotFoundException {
		qbCache.getTransactionType("Rajesh");
	}
	
	@Test
	public void testGetDepartment() throws DepartmentNotFoundException {
		Department department = qbCache.getDepartment("Brand-Airtel");
		Assert.assertNotNull(department);
	}

	@Test
	public void testGetLocation() throws LocationNotFoundException {
		Location location = qbCache.getLocation("India");
		Assert.assertNotNull(location);
	}

	@Test
	public void testGetTransactionType() throws TransactionTypeNotFoundException {
		TransactionType transactionType = qbCache.getTransactionType("Sales");
		Assert.assertNotNull(transactionType);
	}


}
