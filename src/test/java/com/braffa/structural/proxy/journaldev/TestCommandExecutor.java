/*
 * 	Proxy Pattern
 * 		The definition itself is very clear and proxy pattern is used when we want to
 * 		provide controlled access of a functionality. Let’s say we have a class that
 *		can run some command on the system. Now if we are using it, its fine but if
 * 		we want to give this program to a client application, it can have severe issues
 * 		because client program can issue command to delete some system files or
 * 		change some settings that you don’t want. Here a proxy class can be created
 * 		to provide controlled access of the program.
 * 
 * 		Proxy pattern common uses are to control access or to provide a wrapper
 *		implementation for better performance.
 * 
 */


package com.braffa.structural.proxy.journaldev;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCommandExecutor {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

		ICommandExecutor executor = new CommandExecutorProxy("Pankaj",
				"wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}

}
