package com.politecnicomalaga.appmalaga.Data;

import java.util.ArrayList;

public class Pregunta {

    String sPregunta, sImagen, sRespuestaCorrecta;
    String[] alRespuestas;

    public Pregunta(String sPregunta, String sImagen, String sRespuestaCorrecta) {
        this.sPregunta = sPregunta;
        this.sImagen = sImagen;
        this.sRespuestaCorrecta = sRespuestaCorrecta;
        alRespuestas = new String[4];
    }

    public String getsPregunta() {
        return sPregunta;
    }


    public String getsImagen() {
        return sImagen;
    }

    public String getsRespuestaCorrecta() {
        return sRespuestaCorrecta;
    }


    public String cogerRespuesta(int i) {
        String respuesta;
        respuesta = alRespuestas[i-1];
        return respuesta;
    }

}
