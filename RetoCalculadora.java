/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.retocalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTEBAN
 */
public class RetoCalculadora {
    public static void main(String[] args) {
            int opcion1=0;
        
        opcion1=Integer.parseInt(JOptionPane.showInputDialog("""
                                                             Selecciona una opcion
                                                             1. Realizar una operacion
                                                             2. Salir
                                                             """));
        switch (opcion1){
                case 1 -> {
                    if (opcion1 == 1);
                        volverMenu();
                break;
                }
                case 2 -> {
                    if (opcion1 == 2);
                        break;
                }
        }
    }
    public static void volverMenu(){
        int opcion2 = 0;
        double num1,num2,resultado;
        
        opcion2=Integer.parseInt(JOptionPane.showInputDialog("""
                                                             Selecciona una operacion
                                                             1. Suma
                                                             2. Resta
                                                             3. Multiplicación
                                                             4. División
                                                             5. Potencia
                                                             6. Raíz cuadrada de un número
                                                             """));
        switch (opcion2){
            case 1:
                num1=Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
                num2=Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
                resultado = num1+num2;
                JOptionPane.showMessageDialog(null,"el resultado es " + resultado);
                volverMenu();
                break;
            
            case 2: 
                num1=Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
                num2=Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
                resultado = num1-num2;
                JOptionPane.showMessageDialog(null,"el resultado es " + resultado);
                volverMenu();
                break;
            
            case 3: 
                num1=Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
                num2=Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
                resultado = num1*num2;
                JOptionPane.showMessageDialog(null,"el resultado es " + resultado);
                volverMenu();
                break;
                
            case 4:
                num1=Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
                num2=Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
                resultado = num1/num2;
                JOptionPane.showMessageDialog(null,"el resultado es " + resultado);
                volverMenu();
                break;
            
            case 5:
                num1=Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero base"));
                num2=Double.parseDouble(JOptionPane.showInputDialog("ingresa el exponente"));
                resultado = Math.pow(num1, num2);
                JOptionPane.showMessageDialog(null,"el resultado es " + resultado);
                volverMenu();
                break;
                
            case 6:
                num1=Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero a sacar raiz"));
                resultado = Math.sqrt(num1);
                JOptionPane.showMessageDialog(null,"la raiz es " + resultado);
                volverMenu();
                break;
            
            case 7: 
                JOptionPane.showMessageDialog(null, "cerrando programa");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "ingrese una operacion valida");
                break;
                
        }
    }
}

