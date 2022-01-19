package com.kingmeter.common;

import lombok.Data;


/**
 * @description: self defining runtime exception
 * @author: crazyandy
 */
@Data
public class KingMeterException extends RuntimeException{

    private long code;
    private String msg;

    public KingMeterException(ResponseCode responseCode){
        this.code = responseCode.getCode();
        this.msg = responseCode.getMsg();
    }

}
