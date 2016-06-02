/**
 * 
 */
package com.rajesh.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author rjs56
 *
 */
public class ExpressinValidator {

	private static final List<Character> OPENING_BRACKETS = Arrays.asList('(', '{', '[');

	private static final List<Character> CLOSING_BRACKETS = Arrays.asList(')', '}', ']');

	private static final int ZERO = 0;

	public static boolean validateExpression(String expression) {
		if (Objects.isNull(expression) || expression.isEmpty()) {
			return false;
		}

		if (!OPENING_BRACKETS.contains(expression.charAt(ZERO))) {
			return false;
		}

		MyStack<Character> characterStack = new MyStack<>();
		int length = expression.length();

		for (int i = 0; i < length; i++) {
			char character = expression.charAt(i);
			if (OPENING_BRACKETS.contains(character)) {
				characterStack.push(character);
			} else if (CLOSING_BRACKETS.contains(character)) {
				if (characterStack.isEmpty()) {
					return false;
				}
				char topChar = characterStack.peek();
				switch (character) {
				case ')':
					if (topChar == '(') {
						characterStack.pop();
					} else {
						return false;
					}
					break;

				case '}':
					if (topChar == '{') {
						characterStack.pop();
					} else {
						return false;
					}

					break;
				case ']':
					if (topChar == '[') {
						characterStack.pop();
					} else {
						return false;
					}

					break;

				default:
					break;
				}
			}
		}
		if (characterStack.isEmpty()) {
			return true;
		}

		return false;
	}

	public static boolean validateExpression1(String expression) {

		if (Objects.isNull(expression) || expression.isEmpty()) {
			return false;
		}

		Map<Character, Character> characterMap = new HashMap<>();
		characterMap.put('(', ')');
		characterMap.put('{', '}');
		characterMap.put('[', ']');

		if (!characterMap.keySet().contains(expression.charAt(ZERO))) {
			return false;
		}

		MyStack<Character> characterStack = new MyStack<>();
		int length = expression.length();

		for (int i = 0; i < length; i++) {
			char character = expression.charAt(i);
			if (characterMap.keySet().contains(character)) {
				characterStack.push(character);
			} else if (characterMap.values().contains(character)) {
				char topChar = characterStack.peek();
				if (characterStack.isEmpty()) {
					return false;
				}
				if (character == characterMap.get(topChar)) {
					characterStack.pop();
				} else {
					return false;
				}

			}
		}

		return characterStack.isEmpty();

	}

}
