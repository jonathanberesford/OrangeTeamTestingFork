import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TaxesTest {
    //@DisplayName("TestOne")
    @Test
    public void testOne(){
        Taxes tx = new Taxes();
        assertEquals("You are in the 25% tax bracket.\n" +
                "You will be paying £5000.00 in tax. Here's the breakdown:\n" +
                "You earn the first £15000 tax free.\n" +
                "You pay 10% on your next £5000, which is £500\n" +
                "You pay 15% on your next £10000, which is £1500\n" +
                "You pay 20% on your next £15000, which is £3000\n" +
                "This leaves £0.00, of which you pay 25%, or £0.00 in tax", tx.output(45000));

    }
}
/*
public class TestFizzBuzz {
    @DisplayName("TestOne")
    @Test
    public void testOne(){
        FizzBuzz phizz = new FizzBuzz();
        assertEquals("FizzBuzz, ", FizzBuzz.output_fizz(15));

    }
}*/
