
package TestNG_Group;

import org.testng.annotations.Test;

public class Group1 {
@Test
public void Hi()
{
	System.out.println("HI");
}
@Test(groups="smoke")
public void Hello()
{
	System.out.println("Hello");
}
}
