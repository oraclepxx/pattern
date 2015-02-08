package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.CeilingFan;
import com.xinpan.designpattern.command.device.CeilingFan.Speed;

public class CeilingFanOnCommand implements ICommand {

	private CeilingFan ceilingFan;
	private Speed preSpeed;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		if (ceilingFan.getSpeed() == Speed.HIGH) {
			ceilingFan.high();
		} else if (ceilingFan.getSpeed() == Speed.MEDIUM) {
			ceilingFan.medium();
		} else if (ceilingFan.getSpeed() == Speed.LOW) {
			ceilingFan.low();
		}
		preSpeed = ceilingFan.getSpeed();
	}

	@Override
	public void undo() {
		if (preSpeed == Speed.HIGH) {
			ceilingFan.high();
		} else if (preSpeed == Speed.MEDIUM) {
			ceilingFan.medium();
		} else if (preSpeed == Speed.LOW) {
			ceilingFan.low();
		} else {
			ceilingFan.off();
		}

	}

}
