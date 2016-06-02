/**
 * 
 */
package com.command;

import java.util.Objects;

/**
 * Sample Invoker Class for Commands
 * 
 * @author rjs56
 *
 */
public class CommandInvoker {

	/**
	 * Constructor Private to
	 */
	private CommandInvoker() {
	}

	/**
	 * Invokes the command
	 */
	public static void invokeCommand(Command command) {
		if (Objects.nonNull(command)) {
			command.execute();
		} else {
			System.out.println("No Command Set");
		}
	}

}
