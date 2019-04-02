package cn.edu.ustc.sse.workorder.bean;

import java.util.Date;

public class OrderInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.number
     *
     * @mbg.generated
     */
    private String number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.priority
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.category
     *
     * @mbg.generated
     */
    private Integer category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.userID
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.attachment
     *
     * @mbg.generated
     */
    private String attachment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.engineerID
     *
     * @mbg.generated
     */
    private Integer engineerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.finishTime
     *
     * @mbg.generated
     */
    private Date finishtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.number
     *
     * @return the value of order.number
     *
     * @mbg.generated
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.number
     *
     * @param number the value for order.number
     *
     * @mbg.generated
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.title
     *
     * @return the value of order.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.title
     *
     * @param title the value for order.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status
     *
     * @return the value of order.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status
     *
     * @param status the value for order.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.priority
     *
     * @return the value of order.priority
     *
     * @mbg.generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.priority
     *
     * @param priority the value for order.priority
     *
     * @mbg.generated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.category
     *
     * @return the value of order.category
     *
     * @mbg.generated
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.category
     *
     * @param category the value for order.category
     *
     * @mbg.generated
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.userID
     *
     * @return the value of order.userID
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.userID
     *
     * @param userid the value for order.userID
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.phone
     *
     * @return the value of order.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.phone
     *
     * @param phone the value for order.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.email
     *
     * @return the value of order.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.email
     *
     * @param email the value for order.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.attachment
     *
     * @return the value of order.attachment
     *
     * @mbg.generated
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.attachment
     *
     * @param attachment the value for order.attachment
     *
     * @mbg.generated
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.engineerID
     *
     * @return the value of order.engineerID
     *
     * @mbg.generated
     */
    public Integer getEngineerid() {
        return engineerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.engineerID
     *
     * @param engineerid the value for order.engineerID
     *
     * @mbg.generated
     */
    public void setEngineerid(Integer engineerid) {
        this.engineerid = engineerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.createTime
     *
     * @return the value of order.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.createTime
     *
     * @param createtime the value for order.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.finishTime
     *
     * @return the value of order.finishTime
     *
     * @mbg.generated
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.finishTime
     *
     * @param finishtime the value for order.finishTime
     *
     * @mbg.generated
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.content
     *
     * @return the value of order.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.content
     *
     * @param content the value for order.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}