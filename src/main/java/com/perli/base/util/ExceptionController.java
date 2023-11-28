package com.perli.base.util;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;


@ControllerAdvice
public class ExceptionController{

	/*
    @ExceptionHandler(value = InternalError.class)
    
    public ResponseEntity<StatesDto> internalServerError(InternalError exception) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        responseEntity.getStatusCode();
        return  responseEntity;
    }

    @ExceptionHandler(value = NotFoundException.class)
    ResponseEntity<StatesDto> notFound(NotFoundException e){
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        responseEntity.getStatusCode();

        return responseEntity;
    }

    @ExceptionHandler(value = HttpClientErrorException.Unauthorized.class)
    public ResponseEntity<StatesDto>unauthorized(HttpClientErrorException.Unauthorized exception){
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.UNAUTHORIZED);
        responseEntity.getStatusCode();

        return responseEntity;
    }

    @ExceptionHandler(value = HttpClientErrorException.BadRequest.class )
    public ResponseEntity<StatesDto> badRequest(HttpClientErrorException.BadRequest exception) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        responseEntity.getStatusCode();

         return responseEntity;
    }
	*/
}

