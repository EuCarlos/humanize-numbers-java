package br.com.carlos.hn.errors;

public class LangFieldEmptyException extends RuntimeException {
    private String langField = "lang";

    public LangFieldEmptyException() {}

    public LangFieldEmptyException(String field) {
        this.langField = field;
    }

    public String getMessage() {
        return String.format("The %s field is empty.", this.langField);
    }
}
