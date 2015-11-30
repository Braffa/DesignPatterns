package com.braffa.creational.prototype;

public interface IPrototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
