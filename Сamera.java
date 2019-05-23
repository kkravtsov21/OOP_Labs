package com.example.Lab6;


class Camera {
    protected String name;
    protected int model;
    public Camera(String name,int model) {
        this.name = name;
        this.model=model;
    }
    public void info() {
        System.out.println(name+"-"+model);
    }
}

