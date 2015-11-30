package com.braffa.behavioral.observer;

public interface IObserver {

	public void update(String desc);

	public void subscribe();

	public void unSubscribe();
}
