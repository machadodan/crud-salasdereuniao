package com.digital.crud.saladereuniao.saladereuniao.exception;
import java.util.Date;

public class ErrorDatails {

    private Date timeStamp;
    private String message;
    private String datails;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDatails() {
        return datails;
    }

    public void setDatails(String datails) {
        this.datails = datails;
    }


    public ErrorDatails(Date timeStamp, String message, String datails) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        this.datails = datails;
    }

}
