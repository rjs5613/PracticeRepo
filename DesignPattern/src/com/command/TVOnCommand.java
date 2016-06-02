package com.command;

import java.util.Objects;

/**
 * Command Class to On the Television
 * 
 * @author rjs56
 *
 */
public class TVOnCommand implements Command {

	private TelevisionReciever televisionReciever;

	/**
	 * Constructor
	 * 
	 * @param televisionReciever
	 */
	public TVOnCommand(TelevisionReciever televisionReciever) {
		this.televisionReciever = televisionReciever;
	}

	@Override
	public void execute() {

		if (Objects.nonNull(televisionReciever)) {
			televisionReciever.on();
		} else {
			System.out.println("No Reciever Set");
		}

	}

}
