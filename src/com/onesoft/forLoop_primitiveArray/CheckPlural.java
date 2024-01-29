package com.onesoft.forLoop_primitiveArray;

import java.util.Arrays;

public class CheckPlural {
	public static void main(String[] args) {
		String[] words= {"nums","name","birds","things","mat","letter"};
		Arrays.sort(words);
		int count=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].endsWith("s")) {
				//System.out.println(words[i]);
				count++;
				System.out.println(words[i]);
			}
		}
		System.out.println(count);
		
	}

}
