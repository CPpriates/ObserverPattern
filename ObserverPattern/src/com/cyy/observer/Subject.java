package com.cyy.observer;
/**
*    
* 项目名称：ObserverPattern   
* 类名称：Subject   
* 类描述：   信息发布者
* 创建人：cyy   
* 创建时间：2017年4月22日 下午11:36:40   
* 修改人：cyy   
* 修改时间：2017年4月22日 下午11:36:40   
* 修改备注：   
* @version    
*
 */
public interface Subject { //信息发布者
	public void registerObserver(Observer o);//注册监听器
	public void removeObserver(Observer o);//移除监听器
	public void notifyObservers();//发送消息
}
