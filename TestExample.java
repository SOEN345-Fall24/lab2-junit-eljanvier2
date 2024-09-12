import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {
    @Test
    public void testFunction_A_Positive() {
        Example example = new Example(5, 10);
        assertEquals(15, example.Function_A(10));
    }

    @Test
    public void testFunction_A_Negative() {
        Example example = new Example(5, 10);
        assertEquals(-15, example.Function_A(-10));
    }

    @Test
    public void testFunction_B_LessThanSix() {
        Example example = new Example(5, 10);
        assertEquals(15, example.Function_B(5));
    }

    @Test
    public void testFunction_B_GreaterThanSix() {
        Example example = new Example(5, 10);
        assertEquals(5, example.Function_B(15));
    }
}