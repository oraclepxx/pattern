package com.xinpan.designpattern.command.test;

import com.xinpan.designpattern.command.ICommand;

public class RemoteControl {

	private ICommand command;

	public RemoteControl() {

	}

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}

}
