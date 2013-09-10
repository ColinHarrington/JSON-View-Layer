package com.objectpartners.s2gx

import org.springframework.web.servlet.View
import org.springframework.web.servlet.ViewResolver

class JsonViewResolver implements ViewResolver {

	View resolveViewName(String viewName, Locale locale) {
		log.trace "resolving View for view named '${viewName}'"

		if (viewName?.matches(/.*json\{(.*)\}/)){
			return new AuthorView();
		}
		return null
	}
}
