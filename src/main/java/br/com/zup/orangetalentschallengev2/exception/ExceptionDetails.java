package br.com.zup.orangetalentschallengev2.exception;


import java.time.LocalDateTime;

public class ExceptionDetails {

    private LocalDateTime timestamp;
    private Integer status;
    private String title;
    private String details;
    private String developerMessage;

    public ExceptionDetails(LocalDateTime timestamp, Integer status, String title, String details, String developerMessage) {
        this.timestamp = timestamp;
        this.status = status;
        this.title = title;
        this.details = details;
        this.developerMessage = developerMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }
}
