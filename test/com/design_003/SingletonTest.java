package com.design_003;

import java.util.Vector;

public class SingletonTest {

	private static SingletonTest instance = null;
	private Vector<Object> properties = null;

	public Vector<Object> getProperties() {
		return properties;
	}

	private SingletonTest() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonTest();
		}
	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

	public void updateProperties() {
		SingletonTest shadow = new SingletonTest();
		properties = shadow.getProperties();
	}
	
	public static void main(String[] args) {
		SingletonTest.getInstance();
	}
}
