package com.company;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int opt;

        do {
            opt = menu();

            switch (opt) {
                case 1:
                    calzadoCaballero();
                    break;
                case 2:
                    calzadoDama();
                    break;
                case 3:
                   calzadoNiño();
                    break;
                default:
                    opt = 4;
            }

        }while (opt!=4);
    }


    public static int menu (){
        int opt;
        opt = Integer.parseInt(JOptionPane.showInputDialog(
                " Ingrese el departamento: \n"
                        +"1. Caballeros\n"
                        +"2. Damas\n"
                        +"3. Niños\n"
                        +"4. Salir del Sistema\n"));

        return opt;
    }

    public static void calzadoNiño (){
        calzado n = new niño();
        n.setTipo(JOptionPane.showInputDialog("Ingrese el Tipo de Zapato"));
        n.setColor(JOptionPane.showInputDialog("Ingrese el Color"));
        n.setTalla(JOptionPane.showInputDialog("Ingrese el Talla:"));
        n.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));


        JOptionPane.showMessageDialog(null,n.zapato());
        inventario.writeFileAppend("Calzado para Niño", n.archivo());
    }

    public static void calzadoCaballero (){
        calzado c = new caballero();
        c.setTipo(JOptionPane.showInputDialog("Ingrese el Tipo de Zapato:"));
        c.setColor(JOptionPane.showInputDialog("Ingrese el Color:"));
        c.setTalla(JOptionPane.showInputDialog("Ingrese el Talla:"));
        c.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio:")));

        JOptionPane.showMessageDialog(null,c.zapato());
        inventario.writeFileAppend("Calzado para Hombres", c.archivo());
    }

    public static void calzadoDama (){
        calzado d = new dama();
        d.setTipo(JOptionPane.showInputDialog("Ingrese el Tipo de Zapato"));
        d.setColor(JOptionPane.showInputDialog("Ingrese el Color"));
        d.setTalla(JOptionPane.showInputDialog("Ingrese el Talla:"));
        d.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));

        JOptionPane.showMessageDialog(null,d.zapato());
        inventario.writeFileAppend("Calzado para Mujer", d.archivo());
    }

}
