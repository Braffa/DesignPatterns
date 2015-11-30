/*
 * http://www.javacodegeeks.com/2015/09/observer-design-pattern.html
 * 
 * Use the Observer pattern in any of the following situations:
 *      1. When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects 
 *        lets you vary and reuse them independently.
 *      2. When a change to one object requires changing others, and you don’t know how many objects need to be changed.
 *      3. When an object should be able to notify other objects without making assumptions about who these objects are. 
 *         In other words, you don’t want these objects tightly coupled.
 * 
 */
package com.braffa.behavioral.observer;

import java.util.ArrayList;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void test() {
		ISubject subject = new CommentaryObject(new ArrayList<IObserver>(),
				"Soccer Match [2014AUG24]");
		IObserver observer = new SMSUsers(subject, "Adam Warner [New York]");
		observer.subscribe();

		System.out.println();

		IObserver observer2 = new SMSUsers(subject, "Tim Ronney [London]");
		observer2.subscribe();

		ICommentary cObject = ((ICommentary) subject);
		cObject.setDesc("Welcome to live Soccer match");
		cObject.setDesc("Current score 0-0");

		System.out.println();

		observer2.unSubscribe();

		System.out.println();

		cObject.setDesc("It's a goal!!");
		cObject.setDesc("Current score 1-0");

		System.out.println();

		IObserver observer3 = new SMSUsers(subject, "Marrie [Paris]");
		observer3.subscribe();

		System.out.println();

		cObject.setDesc("It's another goal!!");
		cObject.setDesc("Half-time score 2-0");
	}

}
