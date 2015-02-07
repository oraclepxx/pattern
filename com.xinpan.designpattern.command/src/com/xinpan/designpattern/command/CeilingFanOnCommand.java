package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.CeilingFan;

public class CeilingFanOnCommand implements ICommand {

	private CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();
	}

}
