package com.objectpartners.s2gx

class AuthorController {

	def index() {
		render(view: 'json{author:list}', model: [foo: 'bar'])
	}

	def list() {
		render(view: 'json{author:list}', model: [foo: 'authorList'])
	}
}
