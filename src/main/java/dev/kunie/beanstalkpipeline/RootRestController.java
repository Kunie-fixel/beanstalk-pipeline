package dev.kunie.beanstalkpipeline;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class RootRestController {
    public static final String yyyy_MM_dd_HH_mm_ss_PATTERN = "yyyy-MM-dd HH:mm:ss";

    @GetMapping
    public ResponseEntity<String> root() {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern(yyyy_MM_dd_HH_mm_ss_PATTERN));

        return ResponseEntity.ok(String.format("System Time is '%s'", format));
    }

}
