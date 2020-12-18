package com.company;

public class dama extends calzado{


    public dama() { }

    @Override
    public String zapato() {
        return "Que bien quedan est@s: "+getTipo()+"\nQue son talla: "+getTalla();
    }

    @Override
    public String archivo() {
        return "Tipo: "+getTipo()+" || Color: "+getColor()+" || Talla: "+getTalla()+" || Precio: "+getPrecio()+" Lps\n";
    }
}
