package com.talentica;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.talentica.cache.QBCache;
import com.talentica.constant.Currency;
import com.talentica.constant.TransactionEnum;
import com.talentica.domain.DateTime;
import com.talentica.domain.Department;
import com.talentica.domain.Location;
import com.talentica.domain.TransactionType;
import com.talentica.domain.Transactions;
import com.talentica.exception.DepartmentNotFoundException;
import com.talentica.exception.LocationNotFoundException;
import com.talentica.exception.TransactionTypeNotFoundException;
import com.talentica.repo.TransactionRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataDemoApplicationTests {

	@Autowired
	private TransactionRepo transactionRepo;

	@Autowired
	private QBCache qbCache;

	@Test
	@Ignore
	public void contextLoads() {
	}

	@Test
	@Ignore
	public void testDataPersistence() {

		Department department = new Department("Brand-Airtel", "Brands");

		DateTime dateTime = new DateTime();
		dateTime.setDate(new Date());

		Location location = new Location("Mumbai", "India");

		TransactionType transactionType = new TransactionType("Sales", "Software", TransactionEnum.REVENUE);

		Transactions transaction = Transactions.from(department, location, transactionType);
		transaction.setValue(BigDecimal.valueOf(500L));
		transaction.setCurrency(Currency.INR);
		transaction.setDateTime(dateTime);

		transactionRepo.save(transaction);

	}

	@Test
	public void testDataPersistenceUsingCache() {

		DateTime dateTime = new DateTime();
		Calendar instance = Calendar.getInstance();
		instance.setTime(new Date());
		instance.add(Calendar.DATE, -2);
		dateTime.setDate(instance.getTime());

		qbCache.update();
		try {
			Department department = qbCache.getDepartment("Brand-Airtel");
			Location location = qbCache.getLocation("India");
			TransactionType transactionType = qbCache.getTransactionType("Sales");

			Transactions transactions = Transactions.from(department, location, transactionType);
			transactions.setCurrency(Currency.INR);
			transactions.setValue(BigDecimal.valueOf(600L));
			transactions.setDateTime(dateTime);
			transactionRepo.save(transactions);

		} catch (DepartmentNotFoundException e) {
			e.printStackTrace();
		} catch (LocationNotFoundException e) {
			e.printStackTrace();
		} catch (TransactionTypeNotFoundException e) {
			e.printStackTrace();
		}

	}

}
