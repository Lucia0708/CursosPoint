package com.example.lucia.cursospoint.pojo;

/**
 * Created by Lucia on 21/07/2017.
 */

public class Course {
    private String name;
    private String description;
    private String author;
    private float rating;
    private int students;
    private float price;
    private int idImage;


    public Course(String name, String description, String author, float rating, int students, float price, int idImage) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.rating = rating;
        this.students = students;
        this.price = price;
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
}
