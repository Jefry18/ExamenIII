package com.company;

public class caballero extends calzado{


    public caballero() { }


    @Override
    public String zapato() {
        return "Que bien me quedan est@s: "+getTipo()+"\nQue son talla: "+getTalla();
    }

    @Override
    public String archivo() {
        return "Tipo: "+getTipo()+" || Color: "+getColor()+" || Talla: "+getTalla()+" || Precio: "+getPrecio()+" Lps\n";
    }
}
