import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void setUp() {
        printer = new Printer(100, 100);
    }

    @Test
    public void canPrint() {
        printer.print(5, 2);
        assertEquals(90, printer.getPaper());
    }

    @Test
    public void shouldNotExceedPrintingSize() {
        printer.print(100, 5);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void shouldReduceTonerVolume() {
        printer.print(5, 2);
        assertEquals(90, printer.getToner());
    }
}