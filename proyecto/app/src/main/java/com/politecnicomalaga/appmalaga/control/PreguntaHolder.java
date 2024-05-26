package com.politecnicomalaga.appmalaga.control;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PreguntaHolder extends RecyclerView.ViewHolder {
    private TextView hpregunta;
    private WebView hwebView;
    private Button hbutton1, hbutton2, hbutton3, hbutton4;


    public PreguntaHolder(@NonNull View itemView,PreguntasAdapter adapter) {
        super(itemView);
        hpregunta = (TextView) itemView.findViewById(R.id.tvPregunta);
        hwebView = (WebView) itemView.findViewById(R.id.wvImage);
        hbutton1 = (Button) itemView.findViewById(R.id.tvResp1);
        hbutton2 = (Button) itemView.findViewById(R.id.tvResp2);
        hbutton3 = (Button) itemView.findViewById(R.id.tvResp3);
        hbutton4 = (Button) itemView.findViewById(R.id.tvResp4);

    }
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
