package com.cyy.observer;
/**
 * 
*    
* 项目名称：ObserverPattern   
* 类名称：Observer   
* 类描述：   信息订阅者
* 创建人：cyy   
* 创建时间：2017年4月22日 下午11:44:06   
* 修改人：cyy   
* 修改时间：2017年4月22日 下午11:44:06   
* 修改备注：   
* @version    
*
 */
public interface Observer {
	public void update(float temperature,float humidity,float pressure);//状态改变的时候接收通知
}
