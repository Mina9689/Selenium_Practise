package TestNG;

import org.testng.annotations.Test;

public class P1 {
@Test(priority=5,invocationCount=2)
public void demo()
{
	System.out.println("Hi Demo");
}
@Test
public void demo1()
{
	System.out.println("Hi demo1");
}
@Test(priority=-5)
public void demo2()
{
	System.out.println("Hi demo2");
}
@Test(priority=-6,enabled=false)
public void demo3(){
	System.out.println("i am not get executing enable false is used to avoid execute testscripts");
}
}
