package com.cyy.weather;

import com.cyy.observer.DisplayElement;
import com.cyy.observer.impl.CurrentConditionDisplay;
import com.cyy.observer.impl.WeatherData;
/**
 * 
*    
* 项目名称：ObserverPattern   
* 类名称：WeatherStation   
* 类描述：   天气预报站
* 创建人：cyy   
* 创建时间：2017年4月22日 下午11:44:34   
* 修改人：cyy   
* 修改时间：2017年4月22日 下午11:44:34   
* 修改备注：   
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
