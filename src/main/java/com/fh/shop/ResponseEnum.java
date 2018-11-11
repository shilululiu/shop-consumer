package com.fh.shop;

public enum ResponseEnum {
         ERROR_USER(10001,"用户名为空"),
          ERROR_PASS(10002,"密码错误"),
          ERROR_NAME_PASS_CODE(10003,"账户密码验证码为空"),
           ERROR_CODE(10004,"验证码为空"),
           ERROR_USER_LOCK(10005,"账户被锁，请联系管理员解锁"),
            ERROR_PRODUCT_ID(50000,"id无效"),
            ERROR_PRODUCT_IN(50001,"此商品不存在");

    private   int   code;

    private  String  mag;


    private   ResponseEnum(int code ,String mag ){
        this.code=code;
        this.mag=mag;
    }

    public int getCode() {
        return code;
    }

    public String getMag() {
        return mag;
    }
}
