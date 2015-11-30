package com.braffa.behavioral.observer;

public interface ISubject {

	public void subscribeObserver(IObserver observer);

	public void unSubscribeObserver(IObserver observer);

	public void notifyObservers();

	public String subjectDetails();
}
