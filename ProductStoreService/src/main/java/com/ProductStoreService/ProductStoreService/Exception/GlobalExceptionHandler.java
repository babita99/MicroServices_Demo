package com.ProductStoreService.ProductStoreService.Exception;


import com.ProductStoreService.ProductStoreService.Payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFounnd.class)
    public ResponseEntity<ApiResponse> handlerRequestNotFoundExceptions(ResourceNotFounnd ex)
    {
        String message = ex.getMessage();
       ApiResponse response = ApiResponse.builder().mesage(message).success(true).status(HttpStatus.NOT_FOUND).build();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
