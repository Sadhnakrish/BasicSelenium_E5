package TestNg_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_general {
@BeforeSuite
public void bsuite()
{
	System.out.println("Hi Before Suite");
	}
@AfterSuite
public void asuite()
{
	System.out.println("Bye After suite");
}
@BeforeTest
public void btest()
{
	System.out.println("Hi Before test");
	}
@AfterTest
public void atest()
{
	System.out.println("Bye After test");
}
@BeforeClass
public void bClass()
{
	System.out.println("Hi Before Class");
	}
@AfterClass
public void aClass()
{
	System.out.println("Bye After Class");
}
@BeforeMethod
public void bMethod()
{
	System.out.println("Hi Before Method");
	}
@AfterMethod
public void aMethod()
{
	System.out.println("Bye After Method");
}
@Test
public void mainMethod1()
{
	System.out.println("Hi main method");
}
@Test
public void mainMethod2()
{
	System.out.println("Hi main method2");}
}
