package com.kingmeter.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @description: code,message,data
 * from server to http request
 * @author: crazyandy
 */
@NoArgsConstructor
@Data
public class ResponseData implements Serializable {
    private static final long serialVersionUID = 2813362834345491563L;
    private long code;
    private String message = "";
    private Object data = new ArrayList<>();

    public ResponseData(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMsg();
    }

    public ResponseData(ResponseCode responseCode, Object data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMsg();
        this.data = data;
    }

    public ResponseData(long code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
