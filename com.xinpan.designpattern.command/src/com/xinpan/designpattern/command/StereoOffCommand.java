package com.xinpan.designpattern.command;

import com.xinpan.designpattern.command.device.Stereo;

public class StereoOffCommand implements ICommand {

	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}

}
