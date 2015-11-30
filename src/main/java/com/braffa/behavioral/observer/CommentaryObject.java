package com.braffa.behavioral.observer;

import java.util.List;

public class CommentaryObject implements ISubject, ICommentary {

	private final List<IObserver> observers;
	private String desc;
	private final String subjectDetails;

	public CommentaryObject(List<IObserver> observers, String subjectDetails) {
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void subscribeObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(IObserver observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);

	}

	@Override
	public void notifyObservers() {
		System.out.println();
		for (IObserver observer : observers) {
			observer.update(desc);
		}

	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}

	@Override
	public String subjectDetails() {
		return subjectDetails;
	}

}
