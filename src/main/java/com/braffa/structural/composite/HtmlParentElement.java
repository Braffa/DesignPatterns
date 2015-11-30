
package com.braffa.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends AbstractHtmlTag {

	private String tagName;
	private String startTag;
	private String endTag;
	private List<AbstractHtmlTag> childrenTag;

	public HtmlParentElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	@Override
	public void addChildTag(AbstractHtmlTag htmlTag) {
		childrenTag.add(htmlTag);
	}

	@Override
	public void removeChildTag(AbstractHtmlTag htmlTag) {
		childrenTag.remove(htmlTag);
	}

	@Override
	public List<AbstractHtmlTag> getChildren() {
		return childrenTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (AbstractHtmlTag tag : childrenTag) {
			tag.generateHtml();
		}
		System.out.println(endTag);

	}

}
