package org.ifCondition;

import java.util.ArrayList;
import java.util.List;

public class callClass extends encap {
	
	public static void main(String[] args) {
		
		callClass c=new callClass();
		
		c.setID(123);
		c.setUser("Verabagu");
		c.isResult();
		
		callClass c1=new callClass();
		
		c1.setID(456);
		c1.setUser("superstar");
		
		List<callClass> li=new ArrayList<callClass>();
		
		li.add(c);
		li.add(c1);
		
		for (callClass callClass : li) {
			
			System.out.println(li.get(0));
			
		}
		
		
	}

}
