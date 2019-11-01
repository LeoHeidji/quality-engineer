

import org.testng.annotations.Test;
import Selenium.HandleMultiWindow;
import Selenium.PolymorphismSample;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  HandleMultiWindow multi = new HandleMultiWindow();
	  multi.execute();
	  
  }
  
  @Test
  public void f1() throws InterruptedException {
	  PolymorphismSample poli = new PolymorphismSample();
	  poli.execute();
	  
  }
}
