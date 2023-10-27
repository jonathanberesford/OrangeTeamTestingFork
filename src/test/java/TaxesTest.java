import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TaxesTest {
    //@DisplayName("TestOne")
    @Test
    public void test25(){
        Taxes tx = new Taxes();
        assertEquals("You are in the 25% tax bracket.\n" +
                "You will be paying £5000.00 in tax. Here's the breakdown:\n" +
                "You earn the first £15000 tax free.\n" +
                "You pay 10% on your next £5000, which is £500\n" +
                "You pay 15% on your next £10000, which is £1500\n" +
                "You pay 20% on your next £15000, which is £3000\n" +
                "This leaves £0.00, of which you pay 25%, or £0.00 in tax", tx.output(45000));
    }
    @Test
    public void test20(){
        Taxes tx = new Taxes();
        assertEquals("You are in the 20% tax bracket.\n" +
                "You will be paying £2000.00 in tax. Here's the breakdown:\n" +
                "You earn the first £15000 tax free.\n" +
                "You pay 10% on your next £5000, which is £500\n" +
                "You pay 15% on your next £10000, which is £1500\n" +
                "This leaves £0.00, of which you pay 20%, or £0.00 in tax", tx.output(30000));
    }
    @Test
    public void test15(){
        Taxes tx = new Taxes();
        assertEquals("You are in the 15% tax bracket.\n" +
                "You will be paying £500.00 in tax. Here's the breakdown:\n" +
                "You earn the first £15000 tax free.\n" +
                "You pay 10% on your next £5000, which is £500\n" +
                "This leaves £0.00, of which you pay 15%, or £0.00 in tax", tx.output(20000));
    }
    @Test
    public void test10(){
        Taxes tx = new Taxes();
        assertEquals("You are in the 10% tax bracket.\n" +
                "You will be paying £0.00 in tax. Here's the breakdown:\n" +
                "You earn the first £15000 tax free.\n" +
                "This leaves £0.00, of which you pay 10%, or £0.00 in tax", tx.output(15000));
    }
    @Test
    public void testFree(){
        Taxes tx = new Taxes();
        assertEquals("You are in the 0% tax bracket.\nYou earn all your money tax free!", tx.output(10000));
    }
}
