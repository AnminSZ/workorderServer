package cn.edu.ustc.sse.workorder.bean;

import java.util.Date;

/**
 * 用户留言
 * param:
 * role  留言的角色  1.用户  2.工程师
 *
 * */
public class Comment {
    private int id;
    private int orderid;
    private String content;
    private int role;
    private Date createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
