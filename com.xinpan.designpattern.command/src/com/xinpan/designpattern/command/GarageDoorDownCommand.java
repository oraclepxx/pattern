package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.GarageDoor;

public class GarageDoorDownCommand implements ICommand {

	private GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}

	@Override
	public void undo() {
		garageDoor.up();
	}

}
