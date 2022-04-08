package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_test2 {
  @Test
  public void f() {
	  System.out.println("welcome to testNG1");
  }
  
  @Test
  public void f1() {
	  System.out.println("welcome to testNG2");
	  Reporter.log("welcome to testNG2");
  }
}
