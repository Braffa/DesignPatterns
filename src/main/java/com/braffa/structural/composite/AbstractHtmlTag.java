package com.braffa.structural.composite;

import java.util.List;

public abstract class AbstractHtmlTag {

	public abstract String getTagName();

	public abstract void setStartTag(String tag);

	public abstract void setEndTag(String tag);

	public void setTagBody(String tagBody) {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public void addChildTag(AbstractHtmlTag htmlTag) {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public void removeChildTag(AbstractHtmlTag htmlTag) {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public List<AbstractHtmlTag> getChildren() {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public abstract void generateHtml();

}