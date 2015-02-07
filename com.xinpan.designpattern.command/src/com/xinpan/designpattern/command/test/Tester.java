package com.xinpan.designpattern.command.test;

import com.xinpan.designpattern.command.CeilingFanOffCommand;
import com.xinpan.designpattern.command.CeilingFanOnCommand;
import com.xinpan.designpattern.command.GarageDoorDownCommand;
import com.xinpan.designpattern.command.GarageDoorUpCommand;
import com.xinpan.designpattern.command.LightOffCommand;
import com.xinpan.designpattern.command.LightOnCommand;
import com.xinpan.designpattern.command.StereoOffCommand;
import com.xinpan.designpattern.command.StereoOnCommand;
import com.xinpan.designpattern.command.device.CeilingFan;
import com.xinpan.designpattern.command.device.CeilingFan.Speed;
import com.xinpan.designpattern.command.device.GarageDoor;
import com.xinpan.designpattern.command.device.KitchenLight;
import com.xinpan.designpattern.command.device.Light;
import com.xinpan.designpattern.command.device.LivingRoomFan;
import com.xinpan.designpattern.command.device.LivingRoomLight;
import com.xinpan.designpattern.command.device.Stereo;
import com.xinpan.designpattern.command.device.Stereo.StereoType;

public class Tester {

	public static void main(String[] args) {
		int slots = 7;
		RemoteControl control = new RemoteControl(slots);

		// create Devices
		Light livingRoomLigth = new LivingRoomLight();
		Light kitchenLight = new KitchenLight();
		CeilingFan livingRoomFan = new LivingRoomFan(Speed.MEDIUM);
		Stereo stereo = new Stereo(StereoType.CD);
		GarageDoor garageDoor = new GarageDoor();

		// create Devices commands
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLigth);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLigth);

		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

		CeilingFanOnCommand livingRoonFanOnCommand = new CeilingFanOnCommand(livingRoomFan);
		CeilingFanOffCommand livingRoonFanOffCommand = new CeilingFanOffCommand(livingRoomFan);

		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

		// setCommand
		control.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		control.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		control.setCommand(2, livingRoonFanOnCommand, livingRoonFanOffCommand);
		control.setCommand(3, stereoOnCommand, stereoOffCommand);
		control.setCommand(4, garageDoorUpCommand, garageDoorDownCommand);

//		System.out.println(control);

		for (int i = 0; i < slots; i++) {
			control.onButtonPressed(i);
			control.offButtonPressed(i);
		}

	}

}
