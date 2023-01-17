package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    

    @Test
    public void count7_Test1(){

        assertEquals(2, Recursion.count7(717));
    }

    @Test
    public void count7_Test2(){
      assertEquals(0, Recursion.count7(0));
    }

    @Test
    public void count7_Test3(){
      assertEquals(1, Recursion.count7(7)); 
    }
    
    @Test 
    public void count7_Test4(){
      assertEquals(0, Recursion.count7(1234));
    }

    @Test
    public void count7_Test5(){
      assertEquals(0, Recursion.count7(-1));
    }


    @Test
    public void changePi_Test1(){
      assertEquals("", Recursion.changePi(""));
    }
    
    @Test
    public void changePi_Test2(){
      assertEquals("3.14", Recursion.changePi("pi"));
    }
    @Test
    public void changePi_Test3(){
      assertEquals("xx3.14xx", Recursion.changePi("xxpixx"));
    }

    @Test
    public void changePi_Test4(){
      assertEquals("nothing", Recursion.changePi("nothing"));
    }

    @Test
    public void pairStar_Test1(){
        assertEquals("hel*lo", Recursion.pairStar("hello"));
    }
    @Test
    public void pairStar_Test2(){
        assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
    }
    @Test
    public void pairStar_Test3(){
        assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));
    }
    @Test
    public void pairStar_Test4(){
        assertEquals("", Recursion.pairStar(""));
    }

    @Test
    public void stringClean_Test1(){
      assertEquals("", Recursion.stringClean(""));
    }

    @Test
    public void stringClean_Test2(){
      assertEquals("y", Recursion.stringClean("yy"));

    }
    @Test
    public void stringClean_Test3(){
      assertEquals("yzy", Recursion.stringClean("yyzzyy"));
    }

    @Test
    public void stringClean_Test4(){
      assertEquals("Helo", Recursion.stringClean("Hellloo"));
    }

    @Test
    public void stringClean_Test5(){
      assertEquals(" ", Recursion.stringClean("   "));
    }

    @Test
    public void stringClean_Test6(){
      assertEquals("i can't spel ", Recursion.stringClean("ii can'''t spppell   "));
    }

    @Test
    public void strCopy_Test1(){
      assertEquals(true, Recursion.strCopy("catcowcat", "cat", 2));
    }

    @Test
    public void strCopy_Test2(){
      assertEquals(false, Recursion.strCopy("catcowcat", "cow", 2));
    }


    @Test
    public void strCopy_Test3(){
      assertEquals(true, Recursion.strCopy("catcowcat", "cow", 1));
    }

     


    

    
    
}
