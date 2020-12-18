package com.company;

public class niño extends calzado{


    public niño() {
    }

    @Override
    public String zapato() {
        return "Que bien me quedan estos: "+getTipo()+"\nQue son talla: "+getTalla();
    }

    @Override
    public String archivo() {
        return "Tipo: "+getTipo()+" || Color: "+getColor()+" || Talla: "+getTalla()+" || Precio: "+getPrecio()+" Lps\n";
    }
}
