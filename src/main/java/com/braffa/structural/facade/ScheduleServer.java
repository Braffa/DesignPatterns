package com.braffa.structural.facade;

public class ScheduleServer {
	
	private String header;
	
	public ScheduleServer (String header) {
		this.header = header;
	}
	
	public void startBooting() {
		System.out.println(header + "Starts booting...");
	}

	public void readSystemConfigFile() {
		System.out.println(header + "Reading system config files...");
	}

	public void init() {
		System.out.println(header + "Initializing...");
	}

	public void initializeContext() {
		System.out.println(header + "Initializing context...");
	}

	public void initializeListeners() {
		System.out.println(header + "Initializing listeners...");
	}

	public void createSystemObjects() {
		System.out.println(header + "Creating system objects...");
	}

	public void releaseProcesses() {
		System.out.println(header + "Releasing processes...");
	}

	public void destory() {
		System.out.println(header + "Destorying...");
	}

	public void destroySystemObjects() {
		System.out.println(header + "Destroying system objects...");
	}

	public void destoryListeners() {
		System.out.println(header + "Destroying listeners...");
	}

	public void destoryContext() {
		System.out.println(header + "Destroying context...");
	}

	public void shutdown() {
		System.out.println(header + "Shutting down...");
	}
}
