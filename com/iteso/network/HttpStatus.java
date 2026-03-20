package com.iteso.network;

public enum HttpStatus {
    OK(200,"OK"),
    CREATED(201,"Created"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String description;


    HttpStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public boolean isError(){
        if(code >= 400){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}
