package br.com.chronosAcademy.Media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {

    @Test
    public void validaNota1(){
        Media media = new Media();
        String resultado = media.calculaMedia(-1, 5.0);
        assertEquals("Nota inválida", resultado);
    }
    @Test
    public void validaNota2(){
        Media media = new Media();
        String resultado = media.calculaMedia(5.0, -1);
        assertEquals("Nota inválida", resultado);
    }

    @Test
    public void validaNotaNeg(){
        Media media = new Media();
        String resultado = media.calculaMedia(-1, -1);
        assertEquals("Nota inválida", resultado);
    }

    @Test
    public void validaNotaSup10(){
        Media media = new Media();
        String resultado = media.calculaMedia(11, 11);
        assertEquals("Nota inválida", resultado);
    }


    @Test
    public void validaNotaZero(){
        Media media = new Media();
        String resultado = media.calculaMedia(0, 0);
        assertEquals("Reprovado", resultado);
    }

    @Test
    public void validaAprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(5.0, 5.0);
        assertEquals("Aprovado", resultado);
    }
    @Test
    public void validaReprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(4.9, 5.0);
        assertEquals("Reprovado", resultado);
    }
}