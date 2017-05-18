package com.cyy.observer.impl;

import java.util.ArrayList;

import com.cyy.observer.Observer;
import com.cyy.observer.Subject;
/**
 * 
*      
* ��Ŀ���ƣ�ObserverPattern   
* �����ƣ�WeatherData   
* ��������   �������ݷ�����
* �����ˣ�cyy   
* ����ʱ�䣺2017��4��22�� ����11:44:27   
* �޸��ˣ�cyy   
* �޸�ʱ�䣺2017��4��22�� ����11:44:27   
* �޸ı�ע��   
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
