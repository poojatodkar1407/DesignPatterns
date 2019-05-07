package com.bridgeit.behavioralpattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Behaiviour Design pattern.
 * Description : Useful when you are interested in state of object and you want to got notified 
 * whenever ther is any change
 */

// program describes that there are  

public class patternMain {
	public static void main(String[] args) {
			MyTopic topic = new MyTopic();
			Observer obj1 = new Mytopicsubscriber("obj1");
			Observer obj2 = new Mytopicsubscriber("obj2");
			Observer obj3 = new Mytopicsubscriber("obj3");
			
			topic.register(obj1);
			topic.register(obj2);
			topic.register(obj3);
			
			obj1.setSubject(topic);
			obj2.setSubject(topic);
			obj3.setSubject(topic);
			
			obj1.update();
			
			topic.postMessage("new msg");
	}
}
