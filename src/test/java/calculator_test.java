import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calculator_test {
   @Test
    public void plustest(){
        calculator calc = new calculator();
        int c = calc.plus(5,5 );
        assertEquals(10, c );
    }
    @Test
    public void minustest(){
       calculator calc = new calculator();
       int c = calc.minus(10, 5);
       assertEquals(5,c );
    }
    @Test
    public void ymntest(){
       calculator calc = new calculator();
       int c = calc.ymn(5,5);
       assertEquals(25, c);
    }
    @Test
    public void delenietest(){
       calculator calc = new calculator();
       int c = calc.delenie(25 ,5);
       assertEquals(5,c);

    }
       @Test
    public void perimetr(){
       calculator calc = new calculator();
       int p = calc.perimetr(5, 10);
       assertEquals(30, p);
           System.out.println("Калькулятор работает исправно!");
       }
}
