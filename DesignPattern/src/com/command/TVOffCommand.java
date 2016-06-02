package com.command;

import java.util.Objects;

/**
 * Command Class to Off the Television
 * 
 * @author rjs56
 *
 */
public class TVOffCommand implements Command {

	private TelevisionReciever televisionReciever;

	/**
	 * Constructor
	 * 
	 * @param televisionReciever
	 */
	public TVOffCommand(TelevisionReciever televisionReciever) {
		this.televisionReciever = televisionReciever;
	}

	@Override
	public void execute() {

		if (Objects.nonNull(televisionReciever)) {
			televisionReciever.off();
		} else {
			System.out.println("No Reciever Set");
		}

	}

}
