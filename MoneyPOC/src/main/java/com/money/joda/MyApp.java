/**
 * 
 */
package com.money.joda;

import java.util.Currency;

import org.joda.money.BigMoney;
import org.joda.money.BigMoneyProvider;
import org.joda.money.CurrencyUnit;
import org.joda.money.CurrencyUnitDataProvider;
import org.joda.money.Money;

/**
 * Class To Run JODA Money POC
 * 
 * @author rjs56
 *
 */
public class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Money m = Money.of(CurrencyUnit.USD, 55);
		BigMoneyProvider b = new BigMoneyProvider() {
			
			public BigMoney toBigMoney() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
