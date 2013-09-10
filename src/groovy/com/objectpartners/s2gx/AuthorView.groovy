package com.objectpartners.s2gx

import org.springframework.web.servlet.View

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class AuthorView  implements View {

	@Override
	String getContentType() {
		return "application/json"
	}

	@Override
	void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		//Use JSONBuilder or ...
		response.writer.write(model.foo)
	}
}
