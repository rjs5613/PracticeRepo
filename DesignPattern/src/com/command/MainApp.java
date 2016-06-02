/**
 * 
 */
package com.command;

/**
 * @author rjs56
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TelevisionReciever televisionReciever = new TelevisionReciever();

		Command tvOnCommand = new TVOnCommand(televisionReciever);

		Command tvOffCommand = new TVOffCommand(televisionReciever);

		CommandInvoker.invokeCommand(tvOnCommand);
		CommandInvoker.invokeCommand(tvOffCommand);

	}

}
