package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.Stereo;

public class StereoOnCommand implements ICommand {

	private Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

}
