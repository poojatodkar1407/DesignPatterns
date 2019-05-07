package com.bridgeit.behavioralpattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Behaiviour Design pattern.
 * Description : Useful when you are interested in state of object and you want to got notified 
 * whenever ther is any change
 */

public interface Observer {
	
	public void update();
	public void setSubject(Subject subject);
}
