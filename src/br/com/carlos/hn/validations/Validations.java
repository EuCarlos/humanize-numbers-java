package br.com.carlos.hn.validations;

import java.util.Arrays;
import br.com.carlos.hn.errors.LangFieldEmptyException;
import br.com.carlos.hn.errors.ValidationException;
import br.com.carlos.hn.interfaces.IValidations;

public class Validations implements IValidations {
    final private static String[] LANGS = { "pt", "en" };
    
    public boolean checkIfTheFieldIsEmpty(String value) {
        boolean isEmpty = value.length() < 1 || value == null;

        if (isEmpty) throw new LangFieldEmptyException();
        return isEmpty;
    }

    public boolean checkIfLanguageExistsInArray(String value) {
        boolean hasLang = Arrays.stream(LANGS).anyMatch(value.toLowerCase()::equals);

        if (!hasLang) throw new ValidationException();
        return hasLang;
    }
}
