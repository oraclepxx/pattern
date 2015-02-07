package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.Light;

public class LightOffCommand implements ICommand {

	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}