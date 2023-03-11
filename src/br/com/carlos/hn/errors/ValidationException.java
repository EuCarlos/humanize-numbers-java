package br.com.carlos.hn.errors;

public class ValidationException extends RuntimeException {
    public ValidationException() {}

    public String getMessage() {
        return "A validation error occurred.";
    }
}
