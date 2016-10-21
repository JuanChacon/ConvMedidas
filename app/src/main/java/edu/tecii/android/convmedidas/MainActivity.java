package edu.tecii.android.convmedidas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Pies,Metros;
    private TextView Pul,Yar,Met,Mil;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pies=(EditText)findViewById(R.id.txtPie);
        Metros=(EditText)findViewById(R.id.txtmetros);
        Pul=(TextView)findViewById(R.id.TvPu);
        Yar=(TextView)findViewById(R.id.TvYa);
        Met=(TextView)findViewById(R.id.TvMe);
        Mil=(TextView)findViewById(R.id.TvMi);
        boton=(Button)findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                double p,y,mts,milla;
                String resul=Pies.getText().toString();
                String resul2=Metros.getText().toString();
                Double xP=Double.parseDouble(resul);
                Double zM=Double.parseDouble(resul2);

                p=((xP*12)+(zM/0.0254));
                y=((xP/3)+(zM/0.9144));
                mts=(((xP*12)*0.0254)+zM);
                milla=((((xP*12)*0.0254)/1609)+(zM/1609));

                String RP,RY,RMt,Rmi="";
                RP="La suma de las dos cantidades en Pulgadas es "+ p;
                RY="La suma de las dos cantidades en Yardas es "+ y;
                RMt="La suma de las dos cantidades en Metros es "+ mts;
                Rmi="La suma de las dos cantidades en Millas es "+ milla;

                Pul.setText(RP);
                Yar.setText(RY);
                Met.setText(RMt);
                Mil.setText(Rmi);
            }
        });
    }
}
