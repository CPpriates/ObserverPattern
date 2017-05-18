package com.cyy.observer.impl;

import java.util.ArrayList;

import com.cyy.observer.Observer;
import com.cyy.observer.Subject;
/**
 * 
*      
* 项目名称：ObserverPattern   
* 类名称：WeatherData   
* 类描述：   天气数据发布者
* 创建人：cyy   
* 创建时间：2017年4月22日 下午11:44:27   
* 修改人：cyy   
* 修改时间：2017年4月22日 下午11:44:27   
* 修改备注：   
* @version    
*
 */
public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;
	
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub  
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
}
