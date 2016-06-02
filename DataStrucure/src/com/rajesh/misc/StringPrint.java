package com.rajesh.misc;

public class StringPrint {




	/**

	 * @param args

	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub

   String s1=new String("Amrita");

   String s2=new String("College");

   StringCopy strCopy=new StringCopy();

   strCopy.displayRev(s1);

   strCopy.duplicateElement(s2);

   String s3=new String("Army");

   String s4=new String("Mary");	

   Boolean anagram=strCopy.checkAnagram(s3, s4);

   System.out.println("Both are anagram "+anagram);

   String s5=new String("AABC");

   strCopy.nonrepeted(s5);

   strCopy.revString(s5);

	}




}
