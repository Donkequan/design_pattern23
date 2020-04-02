package com.pattern.prototype.demo2;

import java.util.Date;

public class Video implements Cloneable{

    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Video v = (Video) object;
        v.date = (Date) this.date.clone();
        return object;
    }

    public Video() {
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
