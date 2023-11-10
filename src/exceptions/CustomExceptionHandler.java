package exceptions;

import java.io.FileNotFoundException;

public class CustomExceptionHandler {
    public void handleException(Throwable e) {
        if (e instanceof NumberFormatException) {
            System.out.println("Error: Invalid number format");
        } else if (e instanceof FileNotFoundException) {
            System.out.println("Error: File not found");
        } else if (e instanceof IllegalArgumentException || e instanceof IllegalStateException) {
            System.out.println("Error: " + e.getMessage());
        } else {
            new SystemExceptionHandler().handleException(e);
        }
    }
}