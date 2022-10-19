package com.kingmeter.common;


import java.util.HashMap;
import java.util.Map;

/**
 * @description: status code and message from server to http httpChannelMap
 * @author: crazyandy
 */
public enum ResponseCode {

    SUCCESS(200, "succeed"),

    BAD_REQUEST(400, "httpChannelMap parameter is not valid"),
    UNAUTHORIZED(401, "Authentication failed"),
    LOGIN_ERROR(401, "login failed,username or password not right"),
    FORBIDDEN(403, "forbidden"),
    NOT_FOUND(404, "resource not exist"),
    OPERATE_ERROR(405, "The operation failed and the resource requesting the operation did not exist"),
    TIME_OUT(408, "httpChannelMap timeout"),
    SERVER_ERROR(500, "server internal error"),

    StartCodeErrorType(2001l,"Start code error type"),
    EndCodeErrorType(2002l,"End code error type"),
    CRC16CodeErrorType(2003,"CRC16 code error type"),
    Device_Token_Not_Correct(2004,"this token from the device is not correct"),

    Device_Not_Logon(1001l, "this device has not logon"),
    Device_Not_Response(1002l, "this device has not response"),
    Device_Still_Locked(1003l, "this device is still locked"),
    Device_Unlock_Failed(1004l, "unlock this device failed,something happen wrong"),
    Device_Malfunction(1005l, "something happen wrong"),
    Device_Token_Not_Exist(1006l, "this token does not exist"),
    Device_Connection_Not_Exist(1007l, "the connection does not exist"),


    ThisVersionOfFirmWareExist(1008l, "this version of firmware has been exist"),

    BadParameters(1009, "bad parameter"),

    FirmWareNameWrongFormatException(1010l, "the name of this firmware has a incorrect format");


    private long code;
    private String msg;

    ResponseCode(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    static Map<Long, ResponseCode> enumMap = new HashMap();

    static {
        for (ResponseCode type : ResponseCode.values()) {
            enumMap.put(type.code, type);
        }
    }

    public static ResponseCode getEnum(long value) {
        return enumMap.get(value);
    }

    public static boolean containsValue(Integer value) {
        return enumMap.containsKey(value);
    }

    @Override
    public String toString() {
        return this.code+"";
    }
}
