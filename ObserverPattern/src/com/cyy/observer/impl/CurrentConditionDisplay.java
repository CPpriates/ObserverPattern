package com.cyy.observer.impl;

import com.cyy.observer.DisplayElement;
import com.cyy.observer.Observer;
import com.cyy.observer.Subject;
/**
 * 
*    
* ��Ŀ���ƣ�ObserverPattern   
* �����ƣ�CurrentConditionDisplay   
* ��������   ����Ԥ��������
* �����ˣ�cyy   
* ����ʱ�䣺2017��4��22�� ����11:44:41   
* �޸��ˣ�cyy   
* �޸�ʱ�䣺2017��4��22�� ����11:44:41   
* �޸ı�ע��   
* @version    
*
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject subject;
	
	public CurrentConditionDisplay(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions:" + temperature + ":" + humidity +"" + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
