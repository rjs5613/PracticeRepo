package com.rajesh.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StringCopy {
	void displayRev(String S1)
	{
		System.out.println("String is " + S1);
		StringBuffer strBfr = new StringBuffer(S1);
		strBfr.reverse();
		Boolean b = strBfr.equals(S1);
		System.out.println(b);
		System.out.println("Reverse string is " + strBfr);
		System.out.println("Length is " + S1.length());
	}
	void duplicateElement(String S1)
	{
		char[] charArr = S1.toCharArray();
		Map<Character, Integer> carMap = new HashMap<Character, Integer>();
		System.out.println("Repeated elements are");
		for (char ch : charArr)
		{
			if (carMap.containsKey(ch))
			{
				carMap.put(ch, carMap.get(ch) + 1);
			}
			else {
				carMap.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : carMap.entrySet())
		{
			if (entry.getValue() > 1)
			{
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}
	boolean checkAnagram(String s3, String s4)
	{
		if (s3.length() != s4.length())
			return false;
		else
		{
			char[] chararr1 = s3.toLowerCase().toCharArray();
			char[] chararr2 = s4.toLowerCase().toCharArray();
			Arrays.sort(chararr1);
			Arrays.sort(chararr2);
			String s5 = String.valueOf(chararr1);
			String s6 = String.valueOf(chararr2);
			if (s5.equals(s6))
				return true;
			else
				return false;
		}
	}
	void nonrepeted(String s5)
	{
		char[] chararr1 = s5.toCharArray();
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (Character ch : chararr1)
		{
			if (map1.containsKey(ch))
				map1.put(ch, map1.get(ch) + 1);
			else
				map1.put(ch, 1);
		}
		for (Map.Entry<Character, Integer> entry : map1.entrySet())
		{
			if (entry.getValue() == 1)
			{
				System.out.println("1 nonRepeated Charater is +" + entry.getKey());
				break;
			}
		}
	}
	void revString(String s5)
	{
		char[] chararr1 = s5.toCharArray();
		int s1lenght = s5.length();
		char[] chararr2 = new char[s1lenght];
		int i = 0;
		for (Character ch : chararr1)
		{
			chararr2[s1lenght - i - 1] = ch;
			i++;
		}
		String reverse = String.valueOf(chararr2);
		System.out.println("Reverse String is " + reverse);
	}
	void onlyDigits(String s1)
	{
		Pattern pattern = Pattern.compile(".*[^0-9]*.");
	}

}
