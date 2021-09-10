package br.com.zup.orangetalentschallengev2.exception;

import java.time.LocalDateTime;

public class ValidationExceptionDetails extends ExceptionDetails{

    private final String fields;
    private final String fieldsMessage;

    public ValidationExceptionDetails(LocalDateTime timestamp, Integer status, String title, String details, String developerMessage, String fields, String fieldsMessage) {
        super(timestamp, status, title, details, developerMessage);
        this.fields = fields;
        this.fieldsMessage = fieldsMessage;
    }

    public String getFields() {
        return fields;
    }

    public String getFieldsMessage() {
        return fieldsMessage;
    }
}
