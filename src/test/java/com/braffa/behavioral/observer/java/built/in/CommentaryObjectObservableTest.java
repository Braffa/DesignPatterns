package com.braffa.behavioral.observer.java.built.in;

import org.junit.Test;

public class CommentaryObjectObservableTest {

	@Test
	public void test() {
		CommentaryObjectObservable obj = new CommentaryObjectObservable(
				"Soccer Match [2014AUG24]");
		SMSUsersObserver observer = new SMSUsersObserver(obj,
				"Adam Warner [New York]");
		SMSUsersObserver observer2 = new SMSUsersObserver(obj,
				"Tim Ronney [London]");
		observer.subscribe();
		observer2.subscribe();
		System.out
				.println("------------------------------------------------------");
		obj.setDesc("Welcome to live Soccer match");
		obj.setDesc("Current score 0-0");

		observer.unSubscribe();

		obj.setDesc("It's a goal!!");
		obj.setDesc("Current score 1-0");
	}

}
