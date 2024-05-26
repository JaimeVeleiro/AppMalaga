package com.politecnicomalaga.appmalaga.Data;

import java.util.ArrayList;

public class Pregunta {

    String sPregunta, sImagen, sRespuestaCorrecta;
    ArrayList<String> alRespuestas;

    public Pregunta(String sPregunta, String sImagen, String sRespuestaCorrecta) {
        this.sPregunta = sPregunta;
        this.sImagen = sImagen;
        this.sRespuestaCorrecta = sRespuestaCorrecta;
        alRespuestas = new ArrayList<>();
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

    public ArrayList<String> getAlRespuestas() {
        return alRespuestas;
    }

    public String cogerRespuesta(int i) {
        String respuesta;
        respuesta = alRespuestas.get(i);
        return respuesta;
    }

    public void setAlRespuestas(ArrayList<String> alRespuestas) {
        this.alRespuestas = alRespuestas;
    }
}
