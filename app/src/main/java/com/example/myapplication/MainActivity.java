package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button botton,botton1, botton2, botton3, botton4, botton5, botton6, botton7, botton8, botton9, botton10, botton11, botton12, botton13, botton14, botton15, botton16, botton17, botton18, botton19;
    public TextView texto, cocatenear;
    public  String operador;
    public double numero2, numero1;
    public double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        botton = (Button) findViewById(R.id.boton_0);
        botton1 = (Button) findViewById(R.id.boton_1);
        botton2 = (Button) findViewById(R.id.boton_2);
        botton3 = (Button) findViewById(R.id.boton_3);
        botton4 = (Button) findViewById(R.id.boton_4);
        botton5 = (Button) findViewById(R.id.boton_5);
        botton6= (Button) findViewById(R.id.boton_6);
        botton7 = (Button) findViewById(R.id.boton_7);
        botton8= (Button) findViewById(R.id.boton_8);
        botton9 = (Button) findViewById(R.id.boton_9);
        botton11 = (Button) findViewById(R.id.boton_m);
        botton12 = (Button) findViewById(R.id.boton_me);
        botton13 = (Button) findViewById(R.id.boton_division);
        botton14 = (Button) findViewById(R.id.boton_igual);
        botton15 = (Button) findViewById(R.id.boton_AC);
        botton16 = (Button) findViewById(R.id.boton_porciento);
        botton10 = (Button) findViewById(R.id.boton_punto);
        botton18 = (Button) findViewById(R.id.boton_NOR);
        botton19 = (Button) findViewById(R.id.boton_x);
        texto = (TextView) findViewById(R.id.texto);


    }
    public  void  numero(View view){
       String cocatenear=texto.getText().toString();
        switch (view.getId()){
            case R.id.boton_0:
                texto.setText(cocatenear+"0");
                break;
            case R.id.boton_1:
                texto.setText(cocatenear+"1");
                break;
                case R.id.boton_2:
                texto.setText(cocatenear+"2");
                    break;
                    case R.id.boton_3:
                texto.setText(cocatenear+"3");
                        break;
                        case R.id.boton_4:
                texto.setText(cocatenear+"4");
                            break;
            case R.id.boton_5:
                texto.setText(cocatenear+"5");
                break;
            case R.id.boton_6:
                texto.setText(cocatenear+"6");
                break;
            case R.id.boton_7:
                texto.setText(cocatenear+"7");
                break;
            case R.id.boton_8:
                texto.setText(cocatenear+"8");
                break;
            case R.id.boton_9:
                texto.setText(cocatenear+"9");
                break;
            case R.id.boton_punto:
                texto.setText(cocatenear+".");
                break;
        }

    }
    public  void limpiar(View view) {
numero2=0;
numero1=0;
        texto.setText("");
    total=0;
    }
        public  void sumar(View view){
        numero2=Double.parseDouble(texto.getText().toString());
        operador="+";
        texto.setText("");
    }
    public  void resta(View view){
        numero2=Double.parseDouble(texto.getText().toString());
        operador="-";
        texto.setText("");


    }
    public  void multiplicacion(View view){
        numero2=Double.parseDouble(texto.getText().toString());
        operador="x";
        texto.setText("");

    }
    public  void division(View view){
        numero2=Double.parseDouble(texto.getText().toString());
        operador="÷";
        texto.setText("");
    }
    public  void porciento(View view){
        numero2=Double.parseDouble(texto.getText().toString());
        operador="%";
        texto.setText("");
    }
    public  void cambio(View view){
        numero2=Double.parseDouble(texto.getText().toString());
        operador="+/-";
        numero2=numero2*-1;
        texto.setText(String.valueOf(numero2));
    }
    public  void total(View view) {

        switch (operador) {
            case "+":
                numero1 = Double.parseDouble(texto.getText().toString());
                total=numero2+numero1;
texto.setText(String.valueOf(total));
break;
            case "-":
                numero1 = Double.parseDouble(texto.getText().toString());
                total=numero2-numero1;
                texto.setText(String.valueOf(total));
                break;
            case "x":
                numero1 = Double.parseDouble(texto.getText().toString());
                total=numero2*numero1;
                texto.setText(String.valueOf(total));
                break;
            case "÷":
                numero1 = Double.parseDouble(texto.getText().toString());
                total=numero2/numero1;
                texto.setText(String.valueOf(total));
                break;
            case "%":
                numero1 = Double.parseDouble(texto.getText().toString());
                total=(numero2*numero1)/100;
                texto.setText(String.valueOf(total));
                break;


        }

    }
}





