package com.hz.startSpring.axeImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hz.startSpring.Interface.Axe;

@Component("ironAxe")
public class ironAxe implements Axe{
	@Value("${ironAxe.name}")
	private String name;
	@Value("${ironAxe.speed}")
	private int speed;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
