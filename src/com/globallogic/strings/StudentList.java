//Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , sort the list and print

package com.globallogic.strings;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	public static void main(String[] args) {
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("A");
		ls.add("B");
		ls.add("D");
		ls.add("C");
		ls.add("E");
		
		
		System.out.println(ls);
		
		ls.remove(1);
		System.out.println(ls);
		
		Collections.sort(ls);
		
		System.out.println(ls);
		
	}

}
