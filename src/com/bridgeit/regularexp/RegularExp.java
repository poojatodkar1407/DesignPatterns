package com.bridgeit.regularexp;

/**
 * Created By:Pooja Todkar.
 * Date :06/05/2019.
 * Purpose :Regular Expression.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
			//creating the pattern for search
		
			Pattern pattern = Pattern.compile("PoojaTodkarShrirangPooja");
			
			//search the pooja from above pattern
			
			Matcher match = pattern.matcher("Pooja");
			
			//find out the position from where to where string is found
			
			while(match.find())
			{
				System.out.println("Find position from"+match.start()+" To "+(match.end()-1));
			}
	}
}
