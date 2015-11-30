package com.braffa.behavioral.command;

public class FileIOJob implements IJob{

	private FileIO fileIO;
	
	public void setFileIO(FileIO fileIO){
		this.fileIO = fileIO;
	}
	
	@Override
	public void run() {
		System.out.println("Job ID: "+Thread.currentThread().getId()+" executing fileIO jobs.");
		if(fileIO!=null){
			fileIO.execute();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}
}
