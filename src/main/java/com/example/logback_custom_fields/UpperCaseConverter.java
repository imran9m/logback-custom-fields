package com.example.logback_custom_fields;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class UpperCaseConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        String arg = getFirstOption();
        if (arg == null) {
            return "NOT_SET";
        }
        // Use the argument in your conversion logic
        return arg.toUpperCase();
    }
}
