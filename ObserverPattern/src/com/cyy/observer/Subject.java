package com.cyy.observer;
/**
*    
* ��Ŀ���ƣ�ObserverPattern   
* �����ƣ�Subject   
* ��������   ��Ϣ������
* �����ˣ�cyy   
* ����ʱ�䣺2017��4��22�� ����11:36:40   
* �޸��ˣ�cyy   
* �޸�ʱ�䣺2017��4��22�� ����11:36:40   
* �޸ı�ע��   
* @version    
*
 */
public interface Subject { //��Ϣ������
	public void registerObserver(Observer o);//ע�������
	public void removeObserver(Observer o);//�Ƴ�������
	public void notifyObservers();//������Ϣ
}
