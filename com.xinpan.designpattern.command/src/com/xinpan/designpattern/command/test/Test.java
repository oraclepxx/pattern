package com.xinpan.designpattern.command.test;

import com.xinpan.designpattern.command.LightOffCommand;
import com.xinpan.designpattern.command.LightOnCommand;
import com.xinpan.designpattern.command.device.Light;

public class Test {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		rc.setCommand(new LightOnCommand(light));
		rc.buttonPressed();
		rc.setCommand(new LightOffCommand(light));
		rc.buttonPressed();
	}

}
