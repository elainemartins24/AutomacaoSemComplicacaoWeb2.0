package br.com.chronosAcademy.Media;

import java.util.concurrent.atomic.DoubleAccumulator;

public class Media {
    public String calculaMedia(double nota1, double nota2) {
        double media;

       if(nota1 <0 || nota2 < 0){
          return "Nota inválida";
       } else if (nota1 > 10 || nota2 >10){
           return "Nota inválida"; }
               else {media = (nota1 + nota2) / 2; }


        if (media < 5) {
            return "Reprovado"; //retorna com a informação
        }
        return "Aprovado"; //retorna com a informação no caso negativo
    }
}


