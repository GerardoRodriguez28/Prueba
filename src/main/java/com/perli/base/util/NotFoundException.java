package com.perli.base.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;


    public NotFoundException(String message){ super(message);}


    public NotFoundException(String message, Throwable cause){ super(message, cause);}

    public static <T> List<T> requireNotEmpty(List<T> items, String message) throws NotFoundException{
        if (items.isEmpty()){
            throw new NotFoundException(message);
        }
        return items;
    }



}
