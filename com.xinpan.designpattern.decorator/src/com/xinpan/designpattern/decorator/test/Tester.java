package com.xinpan.designpattern.decorator.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Tester {
	
	public static void main(String[] args) throws Exception {
		int c;
		FileInputStream fileInputStream = new FileInputStream("/Users/xinpan/Work/temp/temp.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		InputStream inputStream = new LowerCaseInputStream(bufferedInputStream);
		
		while((c = inputStream.read()) >= 0){
			System.out.print((char) c);
		}
		
		inputStream.close();
	}

}
