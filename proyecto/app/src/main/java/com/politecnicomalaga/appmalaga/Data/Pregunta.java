package com.politecnicomalaga.appmalaga.Data;

public class Pregunta {

    String sPregunta, sImagen, sRespuesta, sRespuestaCorrecta;

    public Pregunta(String sPregunta, String sImagen, String sRespuesta, String sRespuestaCorrecta) {
        this.sPregunta = sPregunta;
        this.sImagen = sImagen;
        this.sRespuesta = sRespuesta;
        this.sRespuestaCorrecta = sRespuestaCorrecta;
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

    public String getsRespuesta() {
        return sRespuesta;
    }

    public void setsRespuesta(String sRespuesta) {
        this.sRespuesta = sRespuesta;
    }

    public String getsRespuestaCorrecta() {
        return sRespuestaCorrecta;
    }

    public void setsRespuestaCorrecta(String sRespuestaCorrecta) {
        this.sRespuestaCorrecta = sRespuestaCorrecta;
    }
}
