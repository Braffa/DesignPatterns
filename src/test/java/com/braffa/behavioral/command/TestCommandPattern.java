/*
 * http://www.javacodegeeks.com/2015/09/command-design-pattern.html
 * 
 *	Use the Command pattern when you want to:
 *		1.	Parameterize objects by an action to perform.
 *		2.	Specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original 
 *			request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a 
 *			command object for the request to a different process and fulfill the request there.
 *		3.	Support undo. The Command’s Execute operation can store state for reversing its effects in the command itself. 
 *			The Command interface must have an added Un-execute operation that reverses the effects of a previous call to Execute. 
 *			Executed commands are stored in a history list. Unlimited-level undo and redo is achieved by traversing this list backwards 
 *			and forwards calling Un-execute and Execute, respectively.
 *		4.  Support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface with 
 *			load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged 
 *			commands from disk and re-executing them with the Execute operation.
 *		5.  Structure a system around high-level operations built on primitives operations. Such a structure is common in information 
 *			systems that support transactions. A transaction encapsulates a set of changes to data. The Command pattern offers a way to 
 *			model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also 
 *			makes it easy to extend the system with new transactions.
 */

package com.braffa.behavioral.command;

import org.junit.Before;
import org.junit.Test;

public class TestCommandPattern {
	ThreadPool pool;

	Email email;
	EmailJob emailJob;

	Sms sms;
	SmsJob smsJob;

	FileIO fileIO;
	FileIOJob fileIOJob;

	Logging logging;
	LoggingJob logJob;

	@Before
	public void setUp() throws Exception {
		pool = new ThreadPool(10);

		email = null;
		emailJob = new EmailJob();

		sms = null;
		smsJob = new SmsJob();

		fileIO = null;
		fileIOJob = new FileIOJob();

		logging = null;
		logJob = new LoggingJob();
	}

	@Test
	public void test() {

		for (int i = 0; i < 5; i++) {
			System.out.println("round " + i);
			email = new Email();
			emailJob.setEmail(email);

			sms = new Sms();
			smsJob.setSms(sms);

			fileIO = new FileIO();
			fileIOJob.setFileIO(fileIO);

			logging = new Logging();
			logJob.setLogging(logging);

			pool.addJob(emailJob);
			pool.addJob(smsJob);
			pool.addJob(fileIOJob);
			pool.addJob(logJob);
		}
		pool.shutdownPool();
	}

}
