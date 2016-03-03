import org.testng.annotations.*;

/**
 * Created by Igor K on 03.03.2016.
 */
public class testRunner {
    @BeforeTest
    public void ThisIsBeforeTest(){
        System.out.println("This Is OUR TEST CASE (Before Test)");
    }

    @AfterTest
    public void ThisIsAftertest(){
        System.out.println("This Is After test (After)");
    }

    @BeforeMethod
    public void ThisBeforeTestMethod(){
        System.out.println("This Before Test Method");
    }

    @AfterMethod
    public void ThisAfterTestMethod(){
        System.out.println("This After Test Method");
    }

    @Test
    public void ThisIsMethod_1(){
        System.out.println("This Is Method 1");
    }

    @Test
    public void ThisIsMethod_2(){
        System.out.println("This Is Method 2");
    }

    @Test
    public void ThisIsMethod_3(){
        System.out.println("This Is Method 3");
    }
}
