package br.com.zup.orangetalentschallengev2.exception;


import java.time.LocalDateTime;

public class BadRequestExceptionDetails extends ExceptionDetails {

    public BadRequestExceptionDetails(LocalDateTime timestamp, Integer status, String title, String details, String developerMessage) {
        super(timestamp, status, title, details, developerMessage);
    }
}
