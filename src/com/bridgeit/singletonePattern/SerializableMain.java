package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Serializable Singletone.
 * Description: it can destroy the single tone pattern.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableMain {
		public static void main(String[] args) {
			SerializableSingleton instance1 = SerializableSingleton.instance;
			
			
			try // for making object serializable
			{
				FileOutputStream fileout = new FileOutputStream("textFile.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileout);
				
				out.writeObject(instance1);
				out.close();
				fileout.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println(instance1.hashCode());
			
			/****************************Deserialzing****************/
			SerializableSingleton instance2 = null;
			
			try
			{
				FileInputStream filein = new FileInputStream("textFile.txt");
				ObjectInputStream in = new ObjectInputStream(filein);
				
				instance2 = (SerializableSingleton) in.readObject();
				in.close();
				filein.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println(instance2.hashCode());
		}
		
		
		
		
}
