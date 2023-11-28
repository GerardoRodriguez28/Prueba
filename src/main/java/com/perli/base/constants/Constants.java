package com.perli.base.constants;

public class Constants {

    public static final String ERROR_MESSAGE = "Something went wrong.";
    public static final int OK = 200;
    public static final int BAD_REQUEST = 400;
    public static final int NOT_FOUND = 404;
    
    public static final String OK_PUT = "202";
    public static final String OK_POST = "201";
    public static final String OK_DELETE = "202";
    public static final String OK_PUT_MESSAGE = "Reguistro editado correctamente.";
    public static final String OK_POST_MESSAGE = "Reguistro insertado correctamente.";
    public static final String OK_DELETE_MESSAGE = "Reguistro eliminado correctamente.";
   
    public static final String URL_VERCION_TRAILER = "/v1/trailers";
    public static final String TRAILER_CONTROLLER_GETPOST = "/get";
    public static final String TRAILER_CONTROLLER_GET = "/get/{idTrailer}";
    public static final String TRAILER_CONTROLLER_DELETE = "/delete";
    public static final String TRAILER_CONTROLLER_UPSERT = "/upsert";
    
    public static final String TRAILER_UNITNUMBER = "unitNumber";
    public static final String TRAILER_TRAILERNUMBER = "trailerNumber";
    public static final String TRAILER_LICENSEPLATE = "licensePlate";
    public static final String TRAILER_ID = "idTrailer";
}
