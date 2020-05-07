public class HelloWorldTest {

  public void testHello() {
    System.out.println("TEST - Hello...");
  }

  public void testWorld() {
    System.out.println("TEST - World...");

  }

  public void xtestWorld() {
    System.out.println("XTEST - World...");
//  wont run
  }
}
//the resources plugin creates a test directory under target
// anything that ends or begins with "test will be picked up"
