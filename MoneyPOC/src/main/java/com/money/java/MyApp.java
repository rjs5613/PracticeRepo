/**
 * 
 */
package com.money.java;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

/**
 * @author rjs56
 *
 */
public class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CurrencyUnit c = MonetaryCurrencies.getCurrency(Locale.CANADA);
		
	}

}
