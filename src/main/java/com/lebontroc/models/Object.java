package com.lebontroc.models;

public class Object {

    private int id;
    private User user;
    private String name;
    private String image;
    private String desc;
    private String condition;
    private String type;

    public Object(int id, User user, String name, String image, String desc, String condition, String type) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.image = image;
        this.desc = desc;
        this.condition = condition;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Object{" +
                "id=" + id +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", desc='" + desc + '\'' +
                ", condition='" + condition + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}