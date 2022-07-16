package com.atqgh.common.exception;

/**
 * 自定义异常.
 *
 * @author Mark sunlightcs@gmail.com
 */
public class MicroException extends RuntimeException {

    private static final long serialVersionUID = 1L;
	
    private String msg;

    private int code = 500;
    
    public MicroException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public MicroException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public MicroException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public MicroException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

}
