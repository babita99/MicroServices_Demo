package com.ProductStoreService.ProductStoreService.Exception;

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
