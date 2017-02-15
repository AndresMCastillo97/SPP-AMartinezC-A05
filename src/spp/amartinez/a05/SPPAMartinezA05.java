/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinez.a05;
import java.util.*;
/**
 *
 * @author andres
 */
public class SPPAMartinezA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Solicitanombre(" tu nombre");
        Solicitaredad(" tu edad");
        Solicitarpeso(" tu peso");
        Solicitarmatricula(" tu matricula");
        
    }
    static String Solicitanombre(String mensaje){
        Scanner kb=new Scanner(System.in);
        String nombre="";
        boolean flag;
        do{
            System.out.println("Introduce"+ mensaje);
            try{
                nombre=kb.nextLine();
                flag=true;
            } catch(Exception ex){
                flag=false;
                System.out.println("No escribió su nombre");
                kb.nextLine();
                  
            }
        }while(flag==false);
        return nombre;
    } 
    
    static double Solicitarpeso(String mensaje){
        Scanner kb=new Scanner(System.in);
        double peso=0;
        boolean flag;
        do{
            System.out.println("Introduce"+mensaje);
         try{
            peso=kb.nextDouble();
            flag=true;
        } catch(Exception ex){
                flag=false;
                System.out.println("El dato insertado no es un número");
                kb.nextLine();
                
        }
    }while(flag==false);
        return peso;
}
    static long Solicitarmatricula(String mensaje){
        Scanner kb=new Scanner(System.in);
        long matricula=0;
        boolean flag;
        do{
            System.out.println("Introduce"+mensaje);
         try{
             matricula=kb.nextLong();
             flag=true;
         } catch(Exception ex){
             flag=false;
             System.out.println("El dato insertado no es correcto");
             kb.nextLine();
          }
        }while (flag==false);
           
        return matricula;
    }
    static int Solicitaredad(String mensaje){
        Scanner kb=new Scanner(System.in);
        int edad=0;
        boolean flag;
        
        do{
            System.out.println("Introduce"+mensaje);
         try{
             edad=kb.nextInt();
             flag=true;
         } catch (Exception ex){
             flag=false;
             System.out.println("El dato insertado no es correcto");
             kb.nextLine();
         }
        }while (flag==false);
        return edad;
      
    }
}
