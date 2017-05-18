package com.cyy.weather;

import com.cyy.observer.DisplayElement;
import com.cyy.observer.impl.CurrentConditionDisplay;
import com.cyy.observer.impl.WeatherData;
/**
 * 
*    
* ��Ŀ���ƣ�ObserverPattern   
* �����ƣ�WeatherStation   
* ��������   ����Ԥ��վ
* �����ˣ�cyy   
* ����ʱ�䣺2017��4��22�� ����11:44:34   
* �޸��ˣ�cyy   
* �޸�ʱ�䣺2017��4��22�� ����11:44:34   
* �޸ı�ע��   
* @version    
*
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(30, 65, 30.1f);
		weatherData.setMeasurements(50, 85, 45.1f);
		weatherData.setMeasurements(20, 35, 100.1f);
		System.out.println("centos hello");
		System.out.println("hello world!");
		System.out.println("merge");
	}
	
	public void test(){
		
	}
}
