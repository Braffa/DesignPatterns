/*
   When to use Composite Pattern
     1. When you want to represent part-whole hierarchies of objects.
     2. When you want clients to be able to ignore the difference between compositions of objects and individual objects. 
        Clients will treat all objects in the composite structure uniformly.
 */

package com.braffa.structural.composite;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void test() {
		AbstractHtmlTag parentTag = new HtmlParentElement("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");
		
		AbstractHtmlTag p1 = new HtmlParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		
		parentTag.addChildTag(p1);
		
		AbstractHtmlTag child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Testing html tag library");
		p1.addChildTag(child1);
		
		child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Paragraph 2");
		p1.addChildTag(child1);
		
		parentTag.generateHtml();
		
		parentTag.getTagName();
		
		assertEquals("Incorrect parent tag name should be ", "<html>", parentTag.getTagName());
		
		List<AbstractHtmlTag> lOftags = parentTag.getChildren();
		
		for (AbstractHtmlTag htmlTag : lOftags) {
			assertEquals("Incorrect parent tag name should be ", "<body>", htmlTag.getTagName());
			List<AbstractHtmlTag> lOfchildtags = htmlTag.getChildren();
			for (AbstractHtmlTag childTag : lOfchildtags) {
				System.out.println(childTag.getTagName());
				assertEquals("Incorrect child tag name should be ", "<p>", childTag.getTagName());
			}
		}
	}

}
