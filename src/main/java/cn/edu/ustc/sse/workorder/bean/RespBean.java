package cn.edu.ustc.sse.workorder.bean;

public class RespBean {
    private String status;
    private String msg;

    public RespBean(){

    }

    public RespBean(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
