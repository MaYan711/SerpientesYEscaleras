/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import javax.swing.JOptionPane;

/**
 *
 * @author LL829
 */
public class Botones {
    private static frmformulario formulario;
    private static Jugador nombre[];
    private static int id;
    private static Jugador apellido[];
    
    

    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        String guardado;
formulario = new frmformulario();
nombre = new Jugador[100];



        int contador = 0;
formulario.setVisible(true);
guardado = JOptionPane.showInputDialog("Datos guardados");
    

}
    public static void guardar(String n, String a, String c, int id){
        int contador = 0;
    nombre[contador].setNombre(n);
    nombre[contador].setApellido(a);
    nombre[contador].setid(id);
    
}
    
}

