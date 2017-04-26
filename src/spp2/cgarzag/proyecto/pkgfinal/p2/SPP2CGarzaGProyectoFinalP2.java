/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgarzag.proyecto.pkgfinal.p2;

/**
 *
 * @author Carlos Rafael
 */
import javax.swing.JOptionPane;
public class SPP2CGarzaGProyectoFinalP2 {

    /**
     2.	Desarrolla un programa en Java que acumule cantidades de gasto capturadas, estas pueden tener punto decimal,
     * las debe guardar en un arreglo y las muestre al final con el total de gastos. La captura debe detenerse al introducir cualquier número negativo.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Calculadora();
    }
    public static int solicitacitaEntero(String mensaje){
     
        int num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Integer.parseInt(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double solicitacitaNum(String mensaje){
     
        double num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double[] Calculadora(){
        double suma=0;
        int variable=solicitacitaEntero ("Introduce número de cantidades"); 
        double [] arreglo = new double [variable];
        
        for (int i=0; i<arreglo.length; i++){
                arreglo[i]= solicitacitaNum("indroduce la cantidad:");
                suma = (suma + arreglo[i]);
            }
        
        JOptionPane.showMessageDialog (null, "El gasto total es: " + suma);
    return arreglo;
    }
}