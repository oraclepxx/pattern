package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.GarageDoor;

public class GarageDoorUpCommand implements ICommand {

	private GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
	}

}
