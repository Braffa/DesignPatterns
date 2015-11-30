/*
 * http://www.javacodegeeks.com/2015/09/visitor-design-pattern.html
 * 
 *	Use the Visitor pattern when:
 *		1.  An object structure contains many classes of objects with differing interfaces, and you want to perform operations on 
 *			these objects that depend on their concrete classes.
 *		2.	Many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid 
 *			“polluting” their classes with these operations. Visitor lets you keep related operations together by defining them in 
 *			one class. When the object structure is shared by many applications, use Visitor to put operations in just those 
 *			applications that need them.
 *		3.	The classes defining the object structure rarely change, but you often want to define new operations over the structure. 
 *			Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly. 
 *			If the object structure classes change often, then it’s probably better to define the operations in those classes.
 */

package com.braffa.behavioral.visitor;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestVisitorPattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBeforeVisitor() {
	
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
		
		List<AbstractHtmlTag> lOftags = parentTag.getChildren();
		for (AbstractHtmlTag htmlTag : lOftags) {
			assertEquals("Incorrect parent tag name should be ", "<body>", htmlTag.getTagName());
			List<AbstractHtmlTag> lOfchildtags = htmlTag.getChildren();
			for (AbstractHtmlTag childTag : lOfchildtags) {
				assertEquals("Incorrect child tag name should be ", "<p>", childTag.getTagName());
			}
		}
		
	}

	@Test
	public void testAfterVisitor() {
		
		IVisitor cssClass = new CssClassVisitor();
		IVisitor style = new StyleVisitor();
		
		AbstractHtmlTag parentTag = new HtmlParentElement("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");
		parentTag.accept(style);
		parentTag.accept(cssClass);
		
		AbstractHtmlTag p1 = new HtmlParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		p1.accept(style);
		p1.accept(cssClass);
		
		parentTag.addChildTag(p1);
		

		AbstractHtmlTag child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Testing html tag library");
		child1.accept(style);
		child1.accept(cssClass);
		
		p1.addChildTag(child1);
		
		child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Paragraph 2");
		child1.accept(style);
		child1.accept(cssClass);
		
		p1.addChildTag(child1);
		
		parentTag.generateHtml();
		
		List<AbstractHtmlTag> lOftags = parentTag.getChildren();
		for (AbstractHtmlTag htmlTag : lOftags) {
			assertEquals("Incorrect parent tag name should be ", "<body>", htmlTag.getTagName());
			assertEquals("Incorrect parent starttag should be ", "<body style='width:58px;' class='visitor'>", htmlTag.getStartTag());
			assertEquals("Incorrect parent endtag should be ", "</body>", htmlTag.getEndTag());
			
			List<AbstractHtmlTag> lOfchildtags = htmlTag.getChildren();
			for (AbstractHtmlTag childTag : lOfchildtags) {
				assertEquals("Incorrect child tag name should be ", "<p>", childTag.getTagName());
				assertEquals("Incorrect parent starttag should be ", "<p style='width:46px;' class='visitor'>", childTag.getStartTag());
				assertEquals("Incorrect parent endtag should be ", "</p>", childTag.getEndTag());
				
			}
		}
	}
}
