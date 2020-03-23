package org.serc.helloworld.impl;

import org.serc.helloworld.Hello;

public class HelloImpl implements Hello {
	final String helloString;

	public HelloImpl(String helloString) {
		this.helloString = helloString;
	}

	public void sayHello() {
		System.out.println(this.helloString);
	}
}
