package com.bridgeit.behavioralpattern;
//all the fuctions declared in the interface
public interface Subject {
	
	public void register(Observer O);
	public void unRegister(Observer O);
	public void notifyObserver();
	public Object getUpdate(Observer O);
	
}
