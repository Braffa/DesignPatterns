package com.braffa.behavioral.chainofresponsibility;


public class TextFileHandler implements IHandler {

	private IHandler handler;
	private String handlerName;

	public TextFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(IHandler handler) {
		this.handler = handler;
	}

	@Override
	public void process(File file) {

		if (file.getFileType().equals("text")) {
			System.out.println("Process and saving text file... by "
					+ handlerName);
		} else if (handler != null) {
			System.out.println(handlerName + " fowards request to "
					+ handler.getHandlerName());
			handler.process(file);
		} else {
			System.out.println("File not supported");
		}

	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}
}
