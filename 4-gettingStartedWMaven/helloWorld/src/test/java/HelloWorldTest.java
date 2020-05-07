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
//the surefire plugin runs test out of "test directory
// Creates a test directory under target
// Anything that ends or begins with "test will be picked up"
