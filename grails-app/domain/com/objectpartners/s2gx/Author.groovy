package com.objectpartners.s2gx

class Author {
	String name
	User user


	static constraints = {
		user nullable: true
	}
}
