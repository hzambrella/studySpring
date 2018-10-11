package com.hz.startSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hz.startSpring.Interface.Axe;
import com.hz.startSpring.Interface.People;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring/applicationContext.xml");
		Axe axe=(Axe) ctx.getBean("goldAxe");
		People people=(People) ctx.getBean("Chinese");
		people.setAxe(axe);
		System.out.println(people.getSpeed());
    }
}
