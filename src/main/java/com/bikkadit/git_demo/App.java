package com.bikkadit.git_demo;

public class App

{
	public void addData(String data) {

		if (data.equals(Constatnt.DATA_TYPE)) {
			System.out.println("welcome");
		}
	}
	public void addedMethod()

	{ 
		System.out.println("new method added after clone");
	}
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
