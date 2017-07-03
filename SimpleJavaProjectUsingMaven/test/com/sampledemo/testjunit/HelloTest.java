import org.junit.Test;

import junit.framework.Assert;

public class HelloTest {

	@Test
	public void testForMessage(){
		HelloService helloservice=new HelloService();
		String msg=helloservice.sayHello();
		Assert.assertEquals(msg, "Hello");
	}
}
