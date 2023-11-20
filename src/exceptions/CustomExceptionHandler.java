package exceptions;

import java.io.FileNotFoundException;

/**
 * CustomExceptionHandler handles exceptions related to log file and message
 * formats.
 * 
 * @author Girum T.
 * @version 1.0.0
 * @since 2023-11-08
 */

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