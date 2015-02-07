package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.GarageDoor;

public class GarageDoorStopCommand implements ICommand {

	private GarageDoor garageDoor;

	public GarageDoorStopCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.stop();
	}

}
