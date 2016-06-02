/**
 * 
 */
package com.rajesh.stack;

/**
 * @author rjs56
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String expression = "(+3(*52)(-63))";

		double d = ExpressionEaluator.evaluateExpression(expression);
		System.out.println(d);

		boolean result = ExpressinValidator.validateExpression1("[({()}())]");
		System.out.println(result);
		
		
	}

}
