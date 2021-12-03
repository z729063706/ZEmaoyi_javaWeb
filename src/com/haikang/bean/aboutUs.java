package com.haikang.bean;


public class AboutUs {
    private int id;
    private String title;
    private String pic;
    private String intro;
    private String detail;
    
    public AboutUs(String title, String pic) {
        this.title = title;
        this.pic = pic;
    }
    
    public AboutUs(int id, String title, String pic) {
        this.id = id;
        this.title = title;
        this.pic = pic;
    }

    public AboutUs() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    } 
    
}
