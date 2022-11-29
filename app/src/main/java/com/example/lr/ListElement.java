package com.example.lr;

public class ListElement {
    public String color;
    public String nombre;
    public String descrip;

    //CONSTRUCTOR....
    public ListElement(String color, String nombre, String descrip) {
        this.color = color;
        this.nombre = nombre;
        this.descrip = descrip;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }


}
