package com.atqgh.common.exception;

/**
 * @author Mubai
 * @description
 * @date 2022/6/18 5:52 下午
 **/
public class MicroAuthException  extends Exception{

    private static final long serialVersionUID = -6916154462432027437L;

    public MicroAuthException(String message){
        super(message);
    }
}
