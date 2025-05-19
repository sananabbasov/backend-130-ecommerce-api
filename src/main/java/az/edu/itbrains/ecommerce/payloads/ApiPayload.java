package az.edu.itbrains.ecommerce.payloads;


import org.springframework.http.HttpStatus;


public class ApiPayload<T> {
    private boolean success;
    private T data;
    private HttpStatus httpStatus;
}