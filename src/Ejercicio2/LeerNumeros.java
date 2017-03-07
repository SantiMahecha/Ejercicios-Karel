package Ejercicio2;

import java.util.Scanner;

public class LeerNumeros {
    
    public static void main(String[] args) {

        
        Scanner Lectura = new Scanner(System.in);
        int[] NumerosI = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Ingrese el número dentro del cuarto "+(i+1)+": ");
            NumerosI[i] = Lectura.nextInt();
        }
        Cuartos c = new Cuartos(NumerosI[0], NumerosI[1], NumerosI[2]); 
        
        
        int[] Numeros = new int[3];
        for(int i=0;i<3;i++){
            c.Entrar();
            Numeros[i]=NumeroBool.toInt(c.EvaluarCuarto());
            c.Salir();
            if(i!=2)
                c.Siguiente();
        }
        
        
        System.out.println(""+Numeros[0]+Numeros[1]+Numeros[2]);
    }
    
}

