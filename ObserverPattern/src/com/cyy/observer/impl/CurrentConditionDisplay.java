package com.cyy.observer.impl;

import com.cyy.observer.DisplayElement;
import com.cyy.observer.Observer;
import com.cyy.observer.Subject;
/**
 * 
*    
* 项目名称：ObserverPattern   
* 类名称：CurrentConditionDisplay   
* 类描述：   天气预报接收者
* 创建人：cyy   
* 创建时间：2017年4月22日 下午11:44:41   
* 修改人：cyy   
* 修改时间：2017年4月22日 下午11:44:41   
* 修改备注：   
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
