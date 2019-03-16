
package operacionesclase;

import java.util.Scanner;

/**
 *
 * @author AsusPC
 */
public class Operacionesclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     
       int a,b;
        String continuar;
        
        System.out.println(     "PROGRAMA PARA CALCULAR OPERACIONES ARITMETICAS O TRIGONOMETRICAS"
                                           );
        System.out.println("---------------------------------------------------------------------");
        
        do{System.out.println("Elige que quieres calcular "
                                +"\n1 << Funciones aritmeticas >>"
                                +"\n2 << Funciones Trigonometicas >>\n"
                              );
         System.out.println("----------------------------------------------");
        aritmeticas aritmetica = new aritmeticas();
                    a=aritmetica.pedirnumero();
        if(a==1){do{  
         aritmeticas.oper();
         
         Scanner volveraritmeticas = new Scanner(System.in);
    int elige;
      elige=volveraritmeticas.nextInt();
         switch (elige){
                
                case 1: 
                    a=aritmetica.pedirnumero();
                    b=aritmetica.pedirnumero();
                    aritmetica.suma(a, b);
                    break;
                case 2:
                    a=aritmetica.pedirnumero();
                    b=aritmetica.pedirnumero();
                    aritmetica.resta(a, b);
                    break;
                case 3:
                    a=aritmetica.pedirnumero();
                    b=aritmetica.pedirnumero();
                    aritmetica.multiplicacion(a, b);
                    break;
                case 4: 
                    a=aritmetica.pedirnumero();
                    b=aritmetica.pedirnumero();
                    aritmetica.division(a, b);
                    break;
                
                default:
                    System.err.println("digite un numero valido");              
            }
         System.out.println("----------------------------------------------");
          System.out.println("Desea continuar con las operaciones aritmeticas S/N");
            continuar = volveraritmeticas.next();
            continuar = continuar.toLowerCase();
        }while(continuar.equals("s")); 
    } if(a==2){
       
       do{ Trigonometricas.elegir();
        Scanner lect = new Scanner(System.in);
    int elegirb;
    elegirb=lect.nextInt();
         switch (elegirb){
                
                case 1:
                   Trigonometricas.calcularSeno();
                    break;
                case 2:
                    Trigonometricas.calcularCoseno();
                    break;
                case 3:
                    Trigonometricas.calcularTangente();
                    break;
                case 4:
                    Trigonometricas.calcularCotangente();
                    break;
                case 5:
                    Trigonometricas.calcularSecante();
                    break;
                case 6:
                    Trigonometricas.calcularCosecante();
                    break;
                
               
                default:
                    System.err.println("digite un numero valido");              
            }
         System.out.println("Desea continuar con las operaciones trigonometricas S/N");
          Scanner volvertrigonometricas = new Scanner(System.in);
            continuar = volvertrigonometricas.next();
            continuar = continuar.toLowerCase();
         }while(continuar.equals("s"));
        }
    else{
        
        System.err.println("digite un numero valido");
        
        System.out.println("Desea continuar en el programa S/N");
         
    }
         
          Scanner volvertodo = new Scanner(System.in);
            continuar = volvertodo.next();
            continuar = continuar.toLowerCase();
         }while(continuar.equals("s"));
        }
       
    
    
    }
    

