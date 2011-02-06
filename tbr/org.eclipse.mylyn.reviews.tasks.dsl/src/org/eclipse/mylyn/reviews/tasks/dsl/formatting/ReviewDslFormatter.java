/*
 * generated by Xtext
 */
package org.eclipse.mylyn.reviews.tasks.dsl.formatting;

import org.eclipse.mylyn.reviews.tasks.dsl.services.ReviewDslGrammarAccess;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class ReviewDslFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		ReviewDslGrammarAccess grammar = (ReviewDslGrammarAccess) getGrammarAccess();
		c.setLinewrap().after(grammar.getModelRule());
		c.setIndentationIncrement().before(grammar.getReviewScopeItemRule());
		c.setIndentationDecrement().after(grammar.getReviewScopeItemRule());
		c.setLinewrap().after(grammar.getReviewScopeItemRule());
		c.setLinewrap().before(
				grammar.getReviewResultAccess().getCommentKeyword_2_0());
		c.setLinewrap().after(
				grammar.getReviewResultAccess().getCommentAssignment_2_1());
	}
}
