package com.baotoan.example;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();
	
	public MyTopic() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		if(observer == null) throw new NullPointerException("Null pointer exception");
		synchronized (MUTEX) {
			if(!observers.contains(observer)) observers.add(observer);
		}
	}

	@Override
	public void unregistry(Observer observer) {
		synchronized (MUTEX) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observerLocals = null;
		if(!changed) {
			return;
		} else {
			observerLocals = new ArrayList<>(this.observers);
			this.changed = false;
		}
		
		for(Observer obs : observerLocals) {
			obs.update();
		}
		
	}

	@Override
	public Object getUpdate() {
		return this.message;
	}
	
	public void postMessage(String message) {
		System.out.println("Prepare send message");
		this.message = message;
		this.changed = true;
		notifyObservers();
	}
	
}
