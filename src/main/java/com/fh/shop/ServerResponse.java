package com.fh.shop;

import java.io.Serializable;

public class ServerResponse   implements Serializable {
    private static final long serialVersionUID = 7529490267626667484L;
    private  int  code;

    private   String mag;

    private  Object data;

    public  ServerResponse(){}


    public  static  ServerResponse   success(){
        return  new ServerResponse(200,"成功");
    }

    public  static  ServerResponse   success(Object data){

        return  new ServerResponse(200,"成功",data);
    }
    public  static  ServerResponse  error(){

        return new ServerResponse(-1,"error异常");
    }


    public  static  ServerResponse  error(ResponseEnum responseEnum ){

        return new ServerResponse(responseEnum.getCode(),responseEnum.getMag());
    }



    private   ServerResponse(int code,String mag){
        this.code=code;
        this.mag=mag;
    }

    private   ServerResponse(int code,String mag,Object data){
        this.code=code;
        this.mag=mag;
        this.data=data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
