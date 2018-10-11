package com.hz.startSpring.peopleImpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hz.startSpring.Interface.Axe;
import com.hz.startSpring.Interface.People;

@Component("Chinese")
public class Chinese implements People{	
	@Value("${chinese.name}")
	private String name;
	@Resource(name="goldAxe")
	private Axe axe;
	@Value("${chinese.efficiency}")
	private int efficiency;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setAxe(Axe axe) {
		System.out.println("setAxe");
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