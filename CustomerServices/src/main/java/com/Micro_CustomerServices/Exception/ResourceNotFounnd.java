package com.Micro_CustomerServices.Exception;

public class ResourceNotFounnd extends RuntimeException {

    public ResourceNotFounnd()
    {
        super("Resource not Found Exception !");
    }

    public ResourceNotFounnd(String Message)
    {
        super(Message);
    }


}
