package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.CeilingFan;

public class CeilingFanOffCommand implements ICommand {

	private CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}

	@Override
	public void undo() {
		ceilingFan.on();
	}

}
