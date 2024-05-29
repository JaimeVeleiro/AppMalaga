package com.politecnicomalaga.appmalaga.Data;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;
import com.politecnicomalaga.appmalaga.Control.PreguntasViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Request {
    private List<Pregunta> listData;
    private PreguntasViewModel vmInstance;

    public enum idioma {
        ESP,
        ING
    }

    public Request(PreguntasViewModel vmInstance) {
        this.vmInstance = vmInstance;
        listData = new ArrayList<>();
    }

    public void getData(idioma tipo) {
        String data = "";

        if (tipo == idioma.ESP) {
            data = "{" +
                    "\"alm\": [" +
                    "{" +
                    "\"sPregunta\": \"¿En qué siglo experimentó Málaga un auge industrial significativo?\"," +
                    "\"sImagen\": \"https://www.juntadeandalucia.es/institutodeestadisticaycartografia/atlashistoriaecon/cap_39/Industria_Malaga_sXIX.jpg\"," +
                    "\"alRespuestas\": [" +
                    "\"Siglo XVIII\"," +
                    "\"Siglo XIX\"," +
                    "\"Siglo XX\"," +
                    "\"Siglo XXI\"" +
                    "],\n" +
                    "\"sRespuestaCorrecta\": \"Siglo XIX\"" +
                    "}," +
                    "{" +
                    "\"sPregunta\": \"¿Qué producto era famoso por fabricarse en la fábrica de chocolate malagueña 'La Riojana'?\"," +
                    "\"sImagen\": \"https://s2.ppllstatics.com/diariosur/www/multimedia/202003/05/media/cortadas/1920%20-Fachada%20de%20la%20tienda%20de%20La%20Riojana%20de%20la%20calle%20Larios.%20Archivo%20Municipal%20de%20M%C3%A1laga-kSLB-U100414994223knE-624x385@Diario%20Sur.jpg\"," +
                    "\"alRespuestas\": [" +
                    "\"Vino\"," +
                    "\"Aceite\"," +
                    "\"Chocolate\"," +
                    "\"Papel\"" +
                    "]," +
                    "\"sRespuestaCorrecta\": \"Chocolate\"" +
                    "}" +
                    "," +
                    "{" +
                    "\"sPregunta\": \"¿En qué barrio de Málaga se ubicaba la fábrica 'Industria Malagueña S.A.'?\",\n" +
                    "\"sImagen\": \"https://www.juntadeandalucia.es/institutodeestadisticaycartografia/atlashistoriaecon/cap_40/Area_industrial_Malaga.jpg\",\n" +
                    "\"alRespuestas\": [" +
                    "\"Churriana\"," +
                    "\"Huelin\"," +
                    "\"Teatinos\"," +
                    "\"Carranque\"" +
                    "]," +
                    "\"sRespuestaCorrecta\": \"Huelin\"" +
                    "}," +
                    "{" +
                    "\"sPregunta\": \"¿Cuál fue la principal fuente de energía utilizada en las industrias malagueñas del siglo XIX?\",\n" +
                    "\"sImagen\": \"https://edea.juntadeandalucia.es/bancorecursos/file/c8b11d01-6442-4da4-82e4-e2ddf6442103/1/es-an_2018070512_9141928.zip/Petroleo.jpg\",\n" +
                    "\"alRespuestas\": [" +
                    "\"Vapor\"," +
                    "\"Electricidad\"," +
                    "\"Carbón\"," +
                    "\"Petróleo\"" +
                    "],\n" +
                    "\"sRespuestaCorrecta\": \"Vapor\"\n" +
                    "},\n" +
                    "{\n" +
                    "\"sPregunta\": \"¿Qué sector industrial fue pionero en la introducción de maquinaria de vapor en Málaga?\",\n" +
                    "\"sImagen\": \"https://www.fundacionaquae.org/wp-content/uploads/2016/01/maquina-vapor-1024x697.jpg\",\n" +
                    "\"alRespuestas\": [\n" +
                    "\"Textil\",\n" +
                    "\"Siderúrgico\",\n" +
                    "\"Alimentario\",\n" +
                    "\"Químico\"\n" +
                    "],\n" +
                    "\"sRespuestaCorrecta\": \"Siderúrgico\"\n" +
                    "},\n" +
                    "{\n" +
                    "\"sPregunta\": \"¿En qué se ha reconvertido la antigua zona industrial de Málaga en las últimas décadas?\",\n" +
                    "\"sImagen\": \"https://www.juntadeandalucia.es/institutodeestadisticaycartografia/atlashistoriaecon/cap_40/Area_industrial_Malaga.jpg\",\n" +
                    "\"alRespuestas\": [\n" +
                    "\"Zona residencial\",\n" +
                    "\"Parque empresarial\",\n" +
                    "\"Centro comercial\",\n" +
                    "\"Área de ocio y cultura\"\n" +
                    "]," +
                    "\"sRespuestaCorrecta\": \"Área de ocio y cultura\"\n" +
                    "}" +
                    "]" +
                    "}";
        } else if (tipo == idioma.ING) {
            data = ControladorFicheros.readText("preguntasIngles.json");
        }
        setData(data);

    }

    public void setData(String data) {

        Gson gson = new Gson();
        AlmacenPreguntas almP = gson.fromJson(data, AlmacenPreguntas.class);

        listData = Arrays.asList(almP.getAlm());

        this.vmInstance.setData();

    }

    public List<Pregunta> getListData() {
        return listData;
    }
}
