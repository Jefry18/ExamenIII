package com.company;

public abstract class calzado {

    private String talla;
    private double precio;
    private String color;
    private String tipo;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

   public String zapato (){ return "Que bien me quedan est@s: "+getTipo()+"\nQue son talla: "+getTalla(); }

   public abstract String archivo ();
}
