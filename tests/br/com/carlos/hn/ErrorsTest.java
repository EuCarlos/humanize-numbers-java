import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import br.com.carlos.hn.errors.LangFieldEmptyException;
import br.com.carlos.hn.errors.ValidationException;
import br.com.carlos.hn.validations.Validations;

public class ErrorsTest {
    private Validations v = new Validations();

    @Test
    public void shouldThrowAnExceptionWhenStringIsEmpty() {
        Throwable exception = assertThrows(LangFieldEmptyException.class, () -> v.checkIfTheFieldIsEmpty(""));
        assertEquals("The lang field is empty.", exception.getMessage());
    }

    @Test
    public void shouldThrowAnExceptionWhenTheMethodReceivesAnInvalidValue() {
        Throwable exception = assertThrows(ValidationException.class, () -> v.checkIfLanguageExistsInArray("br"));
        assertEquals("A validation error occurred.", exception.getMessage());
    }
}
