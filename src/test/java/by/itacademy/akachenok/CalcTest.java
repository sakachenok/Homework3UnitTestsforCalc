package by.itacademy.akachenok;

import by.itacademy.akachenok.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void testSum1() {
        Calc calc = new Calc();
        int actual = calc.sum(10000, 20000);
        Assertions.assertEquals(30000,actual);
    }

    @Test
    public void testSum2(){
        Calc calc = new Calc();
        int actual = calc.sum(-2147483648,2147483647);
        Assertions.assertEquals(-1,actual);
    }

    @Test
    public void testSum3(){
        Calc calc = new Calc();
        int actual = calc.sum(-5689, -1);
        Assertions.assertEquals(-5690, actual);
    }

    @Test
    public void testSum4(){
        Calc calc = new Calc();
        int actual = calc.sum(0,0);
        Assertions.assertEquals(0,actual);
    }

    @Test
    public void testSubtract1(){
        Calc calc = new Calc();
        int actual = calc.subtract(30000,10000);
        Assertions.assertEquals(20000,actual);
    }

    @Test
    public void testSubtract2(){
        Calc calc = new Calc();
        int actual = calc.subtract(900,-100);
        Assertions.assertEquals(1000,actual);
    }

    @Test
    public void testSubtract3(){
        Calc calc = new Calc();
        int actual = calc.subtract(-45,-100);
        Assertions.assertEquals(55, actual);
    }

    @Test
    public void testSubtract4(){
        Calc calc = new Calc();
        int actual = calc.subtract(-1000,-200);
        Assertions.assertEquals(-800, actual);
    }

    @Test
    public void testSubtract5(){
        Calc calc = new Calc();
        int actual = calc.subtract(0,0);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testMultiply1(){
        Calc calc = new Calc();
        int actual = calc.multiply(10,10);
        Assertions.assertEquals(100, actual);
    }

    @Test
    public void testMultiply2(){
        Calc calc = new Calc();
        int actual = calc.multiply(-20,-20);
        Assertions.assertEquals(400, actual);
    }

    @Test
    public void testMultiply3(){
        Calc calc = new Calc();
        int actual = calc.multiply(-100,100);
        Assertions.assertEquals(-10000, actual);
    }

    @Test
    public void testMultiply4(){
        Calc calc = new Calc();
        int actual = calc.multiply(0,56897899);
        Assertions.assertEquals(0,actual);
    }

    @Test
    public void testMultiply5(){
        Calc calc = new Calc();
        int actual = calc.multiply(0,0);
        Assertions.assertEquals(0,actual);
    }

    @Test
    public void testDivide1(){
        Calc calc = new Calc();
        int actual = calc.divide(40000,4);
        Assertions.assertEquals(10000, actual);
    }

    @Test
    public void testDivide2(){
        Calc calc = new Calc();
        int actual = calc.divide(-100,2);
        Assertions.assertEquals(-50,actual);
    }

    @Test
    public void testDivide3(){
        Calc calc = new Calc();
        int actual = calc.divide(-500,-5);
        Assertions.assertEquals(100,actual);
   }

   @Test
    public void testDivide4(){
        Calc calc = new Calc();
        int actual = calc.divide(0,5689);
        Assertions.assertEquals(0,actual);
   }

}

