package com.example.ciclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "numero")
public class Number {


    @Id
    private Integer number;
    private static Boolean isHappy;

    public static int[] digitosNumero(int iNumero){

        // Creamos un array del tamaño del número de dígitos del número
        String x = Integer.toString(iNumero);
        int[] iNumeros = new int[x.length()];

        // Método que devuelve los dígitos de un número
        int iDigito = 0;
        while (iNumero>0){
            iNumeros[iDigito] = iNumero%10;
            iNumero = iNumero/10;
            iDigito++;
        }

        return iNumeros;

    }

    public static void main(String[] args) {

        int iNumero = 2;
        Set<Integer> iCalculados = new HashSet<Integer>();
        boolean bRepetido = false;


        int[] iNumeros = digitosNumero(iNumero);
        System.out.println("Calculando si el número" + iNumero + " es un número feliz");

        int iSuma = 0;

        while ((iSuma!=1) && !(bRepetido)){
            iSuma = 0;
            for (int x=0;x<iNumeros.length;x++)
                iSuma += Math.pow(iNumeros[x],2);
            iNumeros = digitosNumero(iSuma);

            System.out.println(iSuma);

            // Controlamos si ha salido un número repetido. Para no entrar en el bucle.
            if (iCalculados.contains(new Integer(iSuma)))
                bRepetido = true;
            else
                iCalculados.add(new Integer(iSuma));
        }

        if (bRepetido)
            isHappy = false ;
        else
            isHappy = true;
    }


}