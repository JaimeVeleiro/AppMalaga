package com.politecnicomalaga.appmalaga.Data;

import java.util.ArrayList;

public class Pregunta {

    String sPregunta, sImagen, sRespuestaCorrecta;
    String[] alRespuestas;

    public Pregunta(String sPregunta, String sImagen, String sRespuestaCorrecta) {
        this.sPregunta = sPregunta;
        this.sImagen = sImagen;
        this.sRespuestaCorrecta = sRespuestaCorrecta;
        alRespuestas = new String[20];
    }

    public String getsPregunta() {
        return sPregunta;
    }

    public void setsPregunta(String sPregunta) {
        this.sPregunta = sPregunta;
    }

    public String getsImagen() {
        return sImagen;
    }

    public void setsImagen(String sImagen) {
        this.sImagen = sImagen;
    }

    public String getsRespuestaCorrecta() {
        return sRespuestaCorrecta;
    }

    public void setsRespuestaCorrecta(String sRespuestaCorrecta) {
        this.sRespuestaCorrecta = sRespuestaCorrecta;
    }

    public String cogerRespuesta(int i) {
        String respuesta;
        respuesta = alRespuestas[i];
        return respuesta;
    }

}
