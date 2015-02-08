package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.CeilingFan;
import com.xinpan.designpattern.command.device.CeilingFan.Speed;

public class CeilingFanOffCommand implements ICommand {

	private CeilingFan ceilingFan;
	private Speed preSpeed;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		if (preSpeed == Speed.HIGH) {
			ceilingFan.high();
		} else if (preSpeed == Speed.MEDIUM) {
			ceilingFan.medium();
		} else if (preSpeed == Speed.LOW) {
			ceilingFan.low();
		}
	}

}
