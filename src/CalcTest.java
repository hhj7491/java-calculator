import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is; 

public class CalcTest {

    private final Calc calc = new Calc();

    @Test
    public void add_twoPositives_returnsSum() {
        assertThat(calc.add(2, 3), is(5));
    }

    @Test
    public void subtract_resultNegative_returnsNegative() {
        assertThat(calc.subtract(3, 8), is(-5));
    }

    @Test
    public void multiply_withZero_returnsZero() {
        assertThat(calc.multiply(0, 7), is(0));
    }

    @Test
    public void divide_evenDivision_returnsQuotient() {
        assertThat(calc.divide(20, 5), is(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIAE() {
        calc.divide(10, 0);
    }
    
    @Test
    public void add_withZero_returnsSame() {
    assertThat(calc.add(0, 9), is(9));
    assertThat(calc.add(9, 0), is(9));
    }

    @Test
    public void subtract_withZero_behavesCorrectly() {
    assertThat(calc.subtract(0, 5), is(-5));
    assertThat(calc.subtract(5, 0), is(5));
    }

    @Test
    public void divide_withNegative_returnsSignedQuotient() {
    assertThat(calc.divide(-20, 5), is(-4));
    assertThat(calc.divide(20, -5), is(-4));
    assertThat(calc.divide(-20, -5), is(4));
    }

}
