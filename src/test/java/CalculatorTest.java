import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll is executed");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach is executed");
        calculator = new Calculator();
    }

    @Test
    public void checkSum (){
        Calculator calculator = new Calculator();
        double result = calculator.sum(4.5,2.3);
        Assertions.assertEquals(6.8,result,"rezultat incorect");
    }

    @Test
    public void checkMultiply(){
        Calculator calculator = new Calculator();
        double result = calculator.multiply(4.0, 3.0);
        Assertions.assertEquals(12,result);

    }

    @Test
    public void checkSubtraction(){
        Calculator calculator= new Calculator();
        double result = calculator.subtract(49.7,16.6);
        Assertions.assertEquals(6.5, result,"Mai incearca");
    }

    @Test
    public void checkDivide(){
        Calculator calculator = new Calculator();
        double result = calculator.divide(12.5,3.2);
        Assertions.assertEquals(3.9, result,"Total gresit");
        }

        @Test
    public void checkModulo(){
        Calculator calculator = new Calculator();
        double result = calculator.modulo(26.8,85.6);
        Assertions.assertEquals(856, result,"Sa nu te astepti sa fie bine");
        }
    }

