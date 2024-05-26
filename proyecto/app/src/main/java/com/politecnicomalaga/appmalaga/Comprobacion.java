package com.politecnicomalaga.appmalaga;

import com.politecnicomalaga.appmalaga.Data.Pregunta;

public class Comprobacion {
    public boolean compararTextos(String textoBoton, Pregunta pregunta){
        if(pregunta == null || textoBoton == null){
            return false;
        }else{
            return pregunta.getsRespuestaCorrecta().equals(textoBoton);
        }
    }
}
