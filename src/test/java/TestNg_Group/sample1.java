package TestNg_Group;

import org.testng.annotations.Test;

public class sample1 {
@Test
public void sample1_1()
{
	System.out.println("Hi sample1_1");
	}

@Test(groups="smoke")
public void sample1_2()
{
	System.out.println("Hi sample1_2");
	}
}
