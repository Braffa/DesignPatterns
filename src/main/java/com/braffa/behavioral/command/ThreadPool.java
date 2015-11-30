package com.braffa.behavioral.command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	
	private final BlockingQueue<IJob> jobQueue;
	private final Thread[] jobThreads;
	private volatile boolean shutdown;

	public ThreadPool(int n)
	{
		jobQueue = new LinkedBlockingQueue<>();
		jobThreads = new Thread[n];

		for (int i = 0; i < n; i++) {
			jobThreads[i] = new Worker("Pool Thread " + i);
			jobThreads[i].start();
		}
	}

	public void addJob(IJob r)
	{
		try {
			System.out.println("**** putting job " + r);
			jobQueue.put(r);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void shutdownPool()
	{
		while (!jobQueue.isEmpty()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		shutdown = true;
		for (Thread workerThread : jobThreads) {
			workerThread.interrupt();
		}
	}

	private class Worker extends Thread
	{
		public Worker(String name)
		{
			super(name);
		}

		public void run()
		{
			while (!shutdown) {
				try {
					IJob r = jobQueue.take();
					r.run();
				} catch (InterruptedException e) {
				}
			}
		}
	}

}
