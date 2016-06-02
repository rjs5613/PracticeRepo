/**
 * 
 */
package com.rajesh.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rjs56
 *
 */
public class ExpressionEaluator {

	private static final char STOP_POP_CHAR = '(';
	private static final char START_POP_CHAR = ')';

	/**
	 * Evaluates the value of pre order expression
	 * 
	 * @param expression
	 * @return
	 */
	public static double evaluateExpression(String expression) {

		if (expression == null || expression.length() == 0) {
			throw new IllegalArgumentException("Expression can't be empty");
		}
		int length = expression.length();

		Stack stack = new Stack(length);

		for (int index = 0; index < length; index++) {
			char c = expression.charAt(index);
			if (c == START_POP_CHAR) {
				stack = updateStack(stack);
			} else {
				stack.push(c);
			}
		}
		if (stack.getHead() > 1) {
			throw new IllegalArgumentException("Expression Can't be evaluatetd");
		}
		return Double.parseDouble((String) stack.pop().toString());

	}

	private static Stack updateStack(Stack stack) {
		List<Object> charList = new ArrayList<>();
		while (true) {
			Object c = stack.pop();
			if (c.equals(STOP_POP_CHAR)) {
				break;
			}
			charList.add(c);
		}
		if (!charList.isEmpty()) {
			char c = (char) charList.get(charList.size() - 1);
			double result = 0;
			switch (c) {
			case '+':
				for (int i = charList.size() - 2; i >= 0; i--) {
					double element = Double.parseDouble(charList.get(i).toString());
					if (i < charList.size() - 2) {
						result = result + element;
					} else {
						result = element;
					}
				}
				break;

			case '-':
				for (int i = charList.size() - 2; i >= 0; i--) {
					double element = Double.parseDouble(charList.get(i).toString());
					if (i < charList.size() - 2) {
						result = result - element;
					} else {
						result = element;
					}
				}

				break;

			case '*':
				for (int i = charList.size() - 2; i >= 0; i--) {
					double element = Double.parseDouble(charList.get(i).toString());
					if (i < charList.size() - 2) {
						result = result * element;
					} else {
						result = element;
					}
				}

				break;

			case '/':
				for (int i = charList.size() - 2; i >= 0; i--) {
					double element = Double.parseDouble(charList.get(i).toString());
					if (i < charList.size() - 2) {
						if (element != 0) {
							result = result / element;
						} else {
							throw new IllegalArgumentException("Expression Can't be evaluated due to division by zero");
						}
					} else {
						result = (double) charList.get(i);
					}
				}

				break;

			default:
				throw new IllegalArgumentException("Expression Can't be evaluated");
			}
			stack.push(result);
		}

		return stack;
	}

}
