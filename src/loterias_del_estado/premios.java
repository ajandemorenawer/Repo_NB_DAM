package loterias_del_estado;

import java.util.Arrays;
import java.util.Random;

public class premios {

    
// Aquí defino los 3 arrays de premios:     
int [] premios_1000=new int[1000];      // array con 1000 números premiados con     1.000 Euros. 
int [] premios_100000=new int[100];     // array con  100 números premiados con   100.000 Euros.
int [] premios_1000000=new int[10];     // array con   10 números premiados con 1.000.000 Euros.
Random rand = new Random();
int pasta_gansa;

// En el siguiente método cargo los 3 arrays con números aleatorios entre 1 y 1.000.000 

public premios(){
    // Array de 1.000 €
    System.out.println("\nPremios de 1.000 € \n");
    for(int i=0; i<=premios_1000.length-1;i++){     // Recorro todo el array
        premios_1000[i] = rand.nextInt(1000000)+1;  // A cada elemento le asigno un valor aleatorio entre 1 y 1.000.000
        System.out.println(premios_1000[i]);        // Y aquí lo visualizo por pantalla.
    }
    Arrays.sort(premios_1000);

    // Array de 100.000 €
    System.out.println("\nPremios de 100.000 € \n");
    for(int i=0; i<=premios_100000.length-1;i++){       // Recorro todo el array
        premios_100000[i] = rand.nextInt(1000000)+1;    // A cada elemento le asigno un valor aleatorio entre 1 y 1.000.000
        System.out.println(premios_100000[i]);          // Y aquí lo visualizo por pantalla.
    }
    Arrays.sort(premios_100000);

    // Array de 1.000.000 €
    System.out.println("\nPremios de 1.000.000 € \n");
    for(int i=0; i<=premios_1000000.length-1;i++){      // Recorro todo el array
        premios_1000000[i] = rand.nextInt(1000000)+1;   // A cada elemento le asigno un valor aleatorio entre 1 y 1.000.000
        System.out.println(premios_1000000[i]);         // Y aquí lo visualizo por pantalla.
    }
    Arrays.sort(premios_1000000);
}


public boolean esta_premiado(int numero){
    // declaro esta variable para controlar si ya he encontrado el número en alguno de los 3 arrays
    boolean esta_premiado = Boolean.FALSE;
    
    // Busco el número en el array de 1000 elementos premiados con 1000 Euros.
    for(int i : premios_1000){
        if (i==numero){                     // si encuentro el número en algún elemento...
            pasta_gansa=1000;               // le asigno el premio y 
            esta_premiado = Boolean.TRUE;   // cambio el booleano de control a true. 
            break;
        }
    }
    if (! esta_premiado){                       // Si el booleano de control esta a true, no necesito seguir buscando.
        for(int i : premios_100000){            // si no, busco en el siguiente array.
            if (i==numero){                     // si encuentro el número...
                pasta_gansa=100000;             // le asigno el premio y
                esta_premiado = Boolean.TRUE;   // cambio el booleano de control a true.
                break;
            }
        }    
    }

    if (! esta_premiado) {                      // Si el booleano de control esta a true, no necesito seguir buscando.
        for(int i : premios_1000000){           // si no, busco en el último array.
            if (i==numero){                     // si encuentro el número...
                pasta_gansa=1000000;            // le asigno el premio y 
                esta_premiado = Boolean.TRUE;   // cambio el booleano de control a true.
                break;
            }
        }    
    }   
    return esta_premiado;
}
    
}
