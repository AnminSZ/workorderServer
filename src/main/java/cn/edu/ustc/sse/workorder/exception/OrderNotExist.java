package cn.edu.ustc.sse.workorder.exception;

public class OrderNotExist extends Exception {
   private String code;
   private String message;

    public OrderNotExist(String code,String message){
        this.code = code;
        this.message = message;
    }


}
