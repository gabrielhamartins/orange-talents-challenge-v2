package br.com.zup.orangetalentschallengev2.handler;

import br.com.zup.orangetalentschallengev2.exception.BadRequestException;
import br.com.zup.orangetalentschallengev2.exception.BadRequestExceptionDetails;
import br.com.zup.orangetalentschallengev2.exception.ValidationExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(BadRequestException bre){
        return new ResponseEntity<>(new BadRequestExceptionDetails(LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Bad request exception, check documentation.",
                bre.getMessage(),
                bre.getClass().getName()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationExceptionDetails> handlerValidationException(MethodArgumentNotValidException validationException){
        List<FieldError> fieldErrors = validationException.getBindingResult().getFieldErrors();
        String fields = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining(", "));
        String defaultMessages = fieldErrors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(", "));

        return new ResponseEntity<>(new ValidationExceptionDetails(LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Bad request exception, invalid fields.",
                "Check fields message",
                validationException.getClass().getName(),
                fields,
                defaultMessages),  HttpStatus.BAD_REQUEST);
    }
}
