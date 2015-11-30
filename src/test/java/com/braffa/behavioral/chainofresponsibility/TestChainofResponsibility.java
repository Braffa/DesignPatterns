/*
 * http://www.javacodegeeks.com/2015/09/chain-of-responsibility-design-pattern-2.html
 * 
 * Use Chain of Responsibility when
 *    1. More than one objects may handle a request, and the handler isn’t known a priori. The handler should be ascertained 
 *       automatically.
 *    2. You want to issue a request to one of several objects without specifying the receiver explicitly.
 *    3. The set of objects that can handle a request should be specified dynamically.
 */
package com.braffa.behavioral.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;


public class TestChainofResponsibility {
	
	File file;
	IHandler textHandler;
	IHandler docHandler;
	IHandler excelHandler;
	IHandler audioHandler;
	IHandler videoHandler;
	IHandler imageHandler;

	@Before
	public void setUp() throws Exception {
		file = null;
		textHandler = new TextFileHandler("Text Handler");
		docHandler = new DocFileHandler("Doc Handler");
		excelHandler = new ExcelFileHandler("Excel Handler");
		audioHandler = new AudioFileHandler("Audio Handler");
		videoHandler = new VideoFileHandler("Video Handler");
		imageHandler = new ImageFileHandler("Image Handler");

		textHandler.setHandler(docHandler);
		docHandler.setHandler(excelHandler);
		excelHandler.setHandler(audioHandler);
		audioHandler.setHandler(videoHandler);
		videoHandler.setHandler(imageHandler);
	}

	@Test
	public void test() {

		file = new File("Abc.mp3", "audio", "C:");
		textHandler.process(file);

		System.out.println("---------------------------------");

		file = new File("Abc.jpg", "video", "C:");
		textHandler.process(file);

		System.out.println("---------------------------------");

		file = new File("Abc.doc", "doc", "C:");
		textHandler.process(file);

		System.out.println("---------------------------------");

		file = new File("Abc.bat", "bat", "C:");
		textHandler.process(file);
	}

}
