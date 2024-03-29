package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * SystemExceptionHandler catches all types of exceptions and writes them to a
 * system.log file.
 * 
 * @author Girum T.
 * @version 1.0.0
 * @since 2023-11-08
 */

public class SystemExceptionHandler {
    public void handleException(Throwable e) {
        try (FileWriter writer = new FileWriter("system.log", true)) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = now.format(formatter);
            writer.write(timestamp + " - " + e.toString() + "\n");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}