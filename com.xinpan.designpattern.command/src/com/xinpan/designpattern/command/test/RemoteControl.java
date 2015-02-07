package com.xinpan.designpattern.command.test;

import com.xinpan.designpattern.command.BlankCommand;
import com.xinpan.designpattern.command.ICommand;

public class RemoteControl {

	private ICommand[] onCommands;
	private ICommand[] offCommands;
	private int slots;

	public RemoteControl(int slots) {
		this.slots = slots;
		onCommands = new ICommand[slots];
		offCommands = new ICommand[slots];

		for (int i = 0; i < slots; i++) {
			onCommands[i] = new BlankCommand();
			offCommands[i] = new BlankCommand();
		}
	}

	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonPressed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonPressed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < slots; i++) {
			String tmp = onCommands[i].getClass().getName() + "/" + offCommands[i].getClass().getName() + "\t\n";
			sb.append(tmp);
		}

		return sb.toString();

	}

}
