package com.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = rnd.nextInt(10);
		//Will generate any random number in the range of 0 to 9
		System.out.println(n);
		
		List<String>friends = new ArrayList<>();
		friends.add("Kajal");
		friends.add("Sharwari");
		friends.add("Sheetal");
		friends.add("Kajal");
		
		System.out.println(friends);
		
		Collections.sort(friends);
		System.out.println(friends);
	}

}
