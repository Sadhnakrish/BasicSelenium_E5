package TestNg_Group;

import org.testng.annotations.Test;

public class sample2 {
	@Test(groups="smoke")
	public void sample2_1()
	{
		System.out.println("Hi sample2_1");
		}

	@Test
	public void sample2_2()
	{
		System.out.println("Hi sample2_2");
		}
}
