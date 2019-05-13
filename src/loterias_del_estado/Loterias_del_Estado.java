package loterias_del_estado;

import java.util.*;

public class Loterias_del_Estado {

    public static void main(String[] args) {

        // Definimos la entrada por teclado
        Scanner entrada = new Scanner(System.in);   
       
        // en el constructor de la clase premios generamos y ordenamos los premios (arrays)
        premios bombo = new premios();              
        
        // Vamos a aceptar por teclado el número de lotería que hemos comprado.
        System.out.println("\nVeamos cuánta pasta se lleva Hacienda. Introduce tu número...\n");
        int i=entrada.nextInt();
        
        // Ya tenemos el número de la lotería que hemos comprado. Ahora buscaremos en los arrays de premios a ver si nos ha tocado. 
        // El método esta_pemiado busca el número en los 3 arrays de premios:
        // - busca en el array de 1.000 elementos de    1.000 Euros.
        // - busca en el array de   100 elementos de  100.000 Euros.
        // - busca en el array de    10 elementos de 1000.000 Euros.
        // Si lo encuentra en algún array, enhorabuena. Si no lo encuentra, mala suerte.
        
        if(bombo.esta_premiado(i)){ 
            // Aquí lo habría encontrado.
            System.out.println("\n\nEnhorabuena !! Has sido agraciado con "+bombo.pasta_gansa+" €");
            System.out.println("Lo veras, pero no lo catarás porque para eso está Hacienda, que somos todos. (y el dinero púbico no es de nadie)\n\n");
        }
        else {
            System.out.println("\n\nOoooh, qué penaaa !!  No tienes ni pa pipas. Pero no te preocupes, si te hubiera tocado, Hacienda te habría dejado peor.\n\n");
        }
        
    }
    
}
