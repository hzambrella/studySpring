package com.hz.startSpring.peopleImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hz.startSpring.Interface.Axe;
import com.hz.startSpring.Interface.People;

@Component("Japanese")
public class Japanese implements People {
	@Value("${japanese.name}")
	private String name;
	private Axe axe;
	@Value("${japanese.efficiency}")
	private int efficiency;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setAxe(Axe axe) {
		this.axe=axe;
	}

	@Override
	public String getAxeName() {
		return axe.getName();
	}

	@Override
	public int getSpeed() {
		if (axe==null){
			return 0;
		}else{
			return efficiency*axe.getSpeed();
		}
	}

	public int getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
}
