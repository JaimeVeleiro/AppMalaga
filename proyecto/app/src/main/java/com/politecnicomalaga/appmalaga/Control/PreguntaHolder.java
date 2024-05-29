package com.politecnicomalaga.appmalaga.Control;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.politecnicomalaga.appmalaga.Comprobacion;
import com.politecnicomalaga.appmalaga.R;

import java.util.ArrayList;
import java.util.Arrays;

public class PreguntaHolder extends RecyclerView.ViewHolder {
    private TextView hpregunta;
    private WebView hwebView;
    private Button hbutton1, hbutton2, hbutton3, hbutton4;


    public PreguntaHolder(@NonNull View itemView,PreguntaRVAdapter adapter) {
        super(itemView);
        hpregunta = (TextView) itemView.findViewById(R.id.tvPregunta);
        hwebView = (WebView) itemView.findViewById(R.id.wvImage);
        hbutton1 = (Button) itemView.findViewById(R.id.tvResp1);
        hbutton2 = (Button) itemView.findViewById(R.id.tvResp2);
        hbutton3 = (Button) itemView.findViewById(R.id.tvResp3);
        hbutton4 = (Button) itemView.findViewById(R.id.tvResp4);

    }


    /*Button button1 = (Button)findViewById(R.id.button1);
    Button button2 = (Button)findViewById(R.id.button2);
    Button button3 = (Button)findViewById(R.id.button3);
    Button button4 = (Button)findViewById(R.id.button4);

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button boton = (Button) v;
            String textoBt = boton.getText().toString();
            Comprobacion comp = new Comprobacion();
            boolean esCorrecto = comp.compararTextos(textoBt,preguntaActual);
            if(esCorrecto){
                //Puntuacion++
                //Cambiar de pregunta
            }else{
                //Cambiar de pregunta
            }

        }
    };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);*/

    public TextView getPregunta() {
        return hpregunta;
    }
    public WebView getWebView() {
        return hwebView;
    }
    public Button getButton1() {
        return hbutton1;
    }
    public Button getButton2() {
        return hbutton2;
    }
    public Button getButton3() {
        return hbutton3;
    }
    public Button getButton4() {
        return hbutton4;
    }
}
