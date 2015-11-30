package com.braffa.structural.flyweight;

import java.util.HashMap;
import java.util.Map;


public final class PlatformFactory {
	
	private static Map<String, IPlatform>map = new HashMap<>();
	private PlatformFactory(){
		throw new AssertionError("Cannot instantiate the class");
	}
	
	public static synchronized IPlatform getPlatformInstance(String platformType){
		IPlatform platform = map.get(platformType);
		if(platform==null){
			switch(platformType){
				case "C" : platform = new CPlatform(); 
						   break;
				case "CPP" : platform = new CPPPlatform(); 
				   		   break;
				case "JAVA" : platform = new JavaPlatform(); 
				   		   break;
				case "RUBY" : platform = new RubyPlatform(); 
				   		   break;   		   
			}
			map.put(platformType, platform);
		}
		return platform;
	}

}
