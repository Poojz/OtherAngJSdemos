package com.mavendemo1.testjunit;

import junit.framework.Assert;

import org.junit.Test;

import com.mavendemo1.service.HelloService;

public class HelloTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testForMessage(){
		HelloService helloservice=new HelloService();
		String msg=helloservice.sayHello();
		Assert.assertEquals(msg, "Hello");
	}
}
