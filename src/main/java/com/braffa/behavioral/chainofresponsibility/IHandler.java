package com.braffa.behavioral.chainofresponsibility;


public interface IHandler {

	public void setHandler(IHandler handler);

	public void process(File file);

	public String getHandlerName();
}
