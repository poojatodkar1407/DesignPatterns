package com.bridgeit.behavioralpattern;

public class Mytopicsubscriber implements Observer {

	private String name;
	private Subject topic;
	
	
	
	public Mytopicsubscriber(String nm) {
		this.name = nm;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	
		
	}

	@Override
	public void setSubject(Subject subject) {
		
		this.topic = subject;
	}

}
