package com.braffa.behavioral.observer.java.built.in;

import java.util.Observable;

import com.braffa.behavioral.observer.ICommentary;

public class CommentaryObjectObservable extends Observable implements
		ICommentary {
	private String desc;
	private final String subjectDetails;

	public CommentaryObjectObservable(String subjectDetails) {
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		setChanged();
		notifyObservers(desc);
	}

	public String subjectDetails() {
		return subjectDetails;
	}
}
