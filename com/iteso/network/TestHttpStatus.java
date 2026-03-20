package com.iteso.network;

public class TestHttpStatus {
    public static void main(String[] args) {
        HttpStatus status1 = HttpStatus.NOT_FOUND;
        HttpStatus status2 = HttpStatus.OK;

        System.out.println(status1);

        if (status1.isError()){
            System.out.println("status1 representa un error");
        }

        if (!status2.isError()){
            System.out.println("status2 representa un exito");
        }

        for (HttpStatus status : HttpStatus.values()) {
            System.out.println("Código: " + status.getCode() +
                    ", Descripción: " + status.getDescription() +
                    ", ¿Es error?: " + status.isError());
        }
    }
}
