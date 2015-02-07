package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.Light;

public class LightOnCommand implements ICommand {

	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
