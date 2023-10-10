package com.lebontroc.models;

import java.time.LocalDate;

public class Post {

    private int id;
    private Object object;
    private String title;
    private LocalDate publication;
    private String adresse;

    public Post(int id, Object object, String title, LocalDate publication, String adresse) {
        this.id = id;
        this.object = object;
        this.title = title;
        this.publication = publication;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublication() {
        return publication;
    }

    public void setPublication(LocalDate publication) {
        this.publication = publication;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", object=" + object +
                ", title='" + title + '\'' +
                ", publication=" + publication +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}