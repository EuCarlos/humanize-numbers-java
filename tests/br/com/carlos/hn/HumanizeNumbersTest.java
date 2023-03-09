import br.com.carlos.hn.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class HumanizeNumbersTest {
    private HumanizeNumbers hn = new HumanizeNumbers();

    public HumanizeNumbersTest() {}

    @Test
    public void shouldRoundUpCorrectly() {
        assertEquals(hn.execute(1560.00, 1), "1,6 Mil");
        assertEquals(hn.execute(1450.00, 1), "1,5 Mil");
        assertEquals(hn.execute(14550.00, 1), "14,6 Mil");
    }

    @Test
    public void shouldCorrectlyRoundDown() {
        assertEquals(hn.execute(1449.00, 1), "1,4 Mil");
    }

    @Test
    public void shouldRoundCorrectlyAmountOfDecimalDigits() {
        assertEquals(hn.execute(1449.00, 1), "1,4 Mil");
        assertEquals(hn.execute(1449.00, 2), "1,45 Mil");
        assertEquals(hn.execute(1449.00, 3), "1,449 Mil");
        assertEquals(hn.execute(1449.00, 4), "1,449 Mil");
        assertEquals(hn.execute(1449.00, 5), "1,449 Mil");
    }

    @Test
    public void shouldPresentCorrectlyInSingular() {
        assertEquals(hn.execute(1111111.00, 1), "1,1 Milhão");
        assertEquals(hn.execute(1111111111.00, 1), "1,1 Bilhão");
        assertEquals(hn.execute(1111111111111.00, 1), "1,1 Trilhão");
    }

    @Test
    public void shouldPresentCorrectlyNoPlural() {
        assertEquals(hn.execute(2111111.00, 1), "2,1 Milhões");
        assertEquals(hn.execute(2111111111.00, 1), "2,1 Bilhões");
        assertEquals(hn.execute(2111111111111.00, 1), "2,1 Trilhões");
    }

    @Test
    public void shouldCorrectlyDisplayTheThousands() {
        assertEquals(hn.execute(1234.00, 1), "1,2 Mil");
    }

    @Test
    public void shouldDisplayCorrectlyTheMillions() {
        assertEquals(hn.execute(1234567.00, 1), "1,2 Milhão");
    }

    @Test
    public void shouldPresentBillionsCorrectly() {
        assertEquals(hn.execute(1234567890.00, 1), "1,2 Bilhão");
    }

    @Test
    public void shouldProperlyDisplayTheRails() {
        assertEquals(hn.execute(1234111111111.00, 1), "1,2 Trilhão");
    }
    
}
