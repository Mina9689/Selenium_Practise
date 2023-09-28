package TestNG_Group;

import org.testng.annotations.Test;

public class Group2 {
@Test(groups="smoke")
public void java()
{
	System.out.println("Java");
}
@Test
public void c()
{
	System.out.println("C");
}
}
