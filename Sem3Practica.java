/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem3practica;

import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class Sem3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  
        String resultado="";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                resultado = resultado + "@";
            }
            resultado=resultado + "\n";
        }
        System.out.println(resultado);
    }
    */
      //Ejercicio 2 de la semana 3
      /*
      String intro;
      int num;
      int numtime=0;
      
      intro=JOptionPane.showInputDialog("Introduzca el numero:");
      num=Integer.parseInt(intro);
             
        for (int i = 0; i < 11; i++) {
            System.out.println(num+"X"+numtime+"="+num*numtime);
            numtime=numtime+1;
            
        }
        */
      /*
      //Ejercicio 3 , practica
        String TRIANGULO="";
        
        String entry=JOptionPane.showInputDialog("Introduzaca la cantidad de filas:");
        int cantidad=Integer.parseInt(entry);
        
        for (int i = 0; i < cantidad + 1; i++) {
            for (int j = 0; j < i; j++) {
                TRIANGULO=TRIANGULO + "*";
                
            }
            TRIANGULO=TRIANGULO+"\n";
        }
        
        System.out.println(TRIANGULO);
            
        }
    */
      
      /*
      // ejercicio 4
        for (int i = 20; i < 31; i++) {
            System.out.println(i +" Su valor al cudrado es:"+ i*i );
        }
            
        }
      */
     
      /*
      int estudiantes=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes:"));
      
      int nota=0;
      int nota_minima=101;
      int nota_maxima=0;
      int total_notas=0;
      int aprobados=0;
      
        for (int i = 0; i < estudiantes; i++) {
            nota=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del estudiante:"));
            total_notas=total_notas+nota;
            if (nota_maxima < nota){
                   nota_maxima=nota;
            }
            if (nota_minima > nota){
                    nota_minima=nota;     
            }
            if (nota>=70){
                aprobados=aprobados+1;
                
            }
        }
        total_notas=total_notas/nota;
        JOptionPane.showMessageDialog(null,"Promedio: "+total_notas+"\nNota más alta es: "+nota_maxima+"\nLa nota mas baja es de: "+nota_minima+"\nEstudiantes aprobados: "+aprobados);
    */

        String entrar;
        int nota=0;
        int temporal=0;
        int nota_minima=101;
        int nota_maxima=0;
        int total_notas=0;
        int aprobados=0;
       
        while(true){
            entrar=JOptionPane.showInputDialog("Digite la nota del estudiante:(numero negativo para salir)");
            temporal=Integer.parseInt(entrar);
            if(temporal<0){
                break;
            }else{
                total_notas=total_notas+temporal;
                nota=nota+1;

                if (temporal < nota_minima){
                    nota_minima=temporal;
                }
                if (temporal > nota_maxima){
                    nota_maxima=temporal;     
                }
                if (temporal>=70){
                    aprobados=aprobados+1;        
                }
            }   
        }
        total_notas=total_notas/nota;
        JOptionPane.showMessageDialog(null,"Promedio: "+total_notas+"\nNota más alta es: "+nota_maxima+"\nLa nota mas baja es de: "+nota_minima+"\nEstudiantes aprobados: "+aprobados);
    }    
}
