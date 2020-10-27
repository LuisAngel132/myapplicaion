package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button botton, botton1, botton2, botton3, botton4, botton5, botton6, botton7, botton8, botton9, botton10, botton11, botton12, botton13, botton14, botton15, botton16, botton17, botton18, botton19;
    public TextView texto, cocatenear, tex;
    public String operador;
    public double numero2 = 0, numero1 = 0, numero3 = 0, numero4 = 0, numero5 = 0, numero6 = 0, numeroderecuperacion1 = 0, numeroderecuperacion2 = 0;
    public double total = 0;
    public int scont = 0, suma = 0, resta = 0, division = 0, multiplicacion = 0, numeroperdido = 0, vectorcontador = 1, vectornumero = 0;
    public double[] vnumero1 = new double[vectorcontador];
    public char[] voperador = new char[vectorcontador];
    public double[] vnumero2 = new double[vectorcontador];
    public char[] vigual = new char[vectorcontador];
    public double[] vresultado = new double[vectorcontador];
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
        botton6 = (Button) findViewById(R.id.boton_6);
        botton7 = (Button) findViewById(R.id.boton_7);
        botton8 = (Button) findViewById(R.id.boton_8);
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
        tex = (TextView) findViewById(R.id.tex);
    }
    public void numero(View view) {
        String cocatenear = texto.getText().toString();
        switch (view.getId()) {
            case R.id.boton_0:
                texto.setText(cocatenear + "0");
                break;
            case R.id.boton_1:
                texto.setText(cocatenear + "1");
                break;
            case R.id.boton_2:
                texto.setText(cocatenear + "2");
                break;
            case R.id.boton_3:
                texto.setText(cocatenear + "3");
                break;
            case R.id.boton_4:
                texto.setText(cocatenear + "4");
                break;
            case R.id.boton_5:
                texto.setText(cocatenear + "5");
                break;
            case R.id.boton_6:
                texto.setText(cocatenear + "6");
                break;
            case R.id.boton_7:
                texto.setText(cocatenear + "7");
                break;
            case R.id.boton_8:
                texto.setText(cocatenear + "8");
                break;
            case R.id.boton_9:
                texto.setText(cocatenear + "9");
                break;
            case R.id.boton_punto:
                texto.setText(cocatenear + ".");
                break;
        }

    }

    public void limpiar(View view) {
        numero3 = 0;
        numero5 = 0;
        numero1 = 0;
        numero4 = 0;
        texto.setText("");
        total = 0;
        numero2 = 0;

        suma = 0;
        resta = 0;
        division = 0;
        multiplicacion = 0;
        tex.setText("");

    }

    public void sumar(View view) {
        if (multiplicacion == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 * numero1;

            } else {
                total = numero2 * numero1;


            }

            suma = 0;
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            multiplicacion = 0;

        }

        if (division == 1) {

            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero4 > 0) {
                total = numero5 / numero1;
                for (int x = vectorcontador; x < vectornumero; x++) {
                    vnumero1[x] = numero5;
                    voperador[x] = '÷';
                    vnumero2[x] = numero1;
                    vigual[x] = '=';
                    vresultado[x] = total;
                }
            } else {
                total = numero2 / numero1;

            }


            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            division = 0;

        }
        if (resta == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());

            if (numero5 > 0) {
                total = numero5 - numero1;

            } else {
                total = numero2 - numero1;

            }
            suma = 0;

            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            resta = 0;


        }
        if (numero3 >= 1) {
            numero4 = Double.parseDouble(texto.getText().toString());

            operador = "+";
            Log.i("", "" + texto.getText().toString());
            texto.setText("");
        }
        if (numero3 <= 0) {
            numero2 = Double.parseDouble(texto.getText().toString());
            operador = "+";
            Log.i("", "" + operador + texto.getText().toString());
            texto.setText("");
        }
        if (numero3 < 2) {
            numero5 = numero2 + numero4;
            tex.setText(String.valueOf(numero2));
            if (numero4 > 0) {
                tex.setText(String.valueOf(numero2) + "+=" + String.valueOf(numero4));
            }
        } else {

            numero5 += numero4;
            tex.setText(String.valueOf(numero5) + "+=" + String.valueOf(numero4));


        }
        numero3++;

        suma = 1;
// numero 2/ 4  1/ 8
    }

    public void resta(View view) {
        if (multiplicacion == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 * numero1;

            } else {
                total = numero2 * numero1;


            }

            suma = 0;
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            multiplicacion = 0;

        }
        if (suma == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 + numero1;

            } else {
                total = numero2 + numero1;

            }
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            suma = 0;
        }
        if (division == 1) {

            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero4 > 0) {
                total = numero5 / numero1;

            } else {
                total = numero2 / numero1;

                suma = 0;
                numero5 = 0;
                numero3 = 0;
                numero2 = 0;
                numero4 = 0;
                texto.setText(String.valueOf(total));
                division = 0;

            }
            if (multiplicacion == 1) {
                numero1 = Double.parseDouble(texto.getText().toString());
                if (numero5 > 0) {
                    total = numero5 * numero1;
                }
            } else {
                total = numero2 * numero1;


                suma = 0;
                numero5 = 0;
                numero3 = 0;
                numero2 = 0;
                numero4 = 0;
                texto.setText(String.valueOf(total));
                multiplicacion = 0;

            }
        }

        if (numero3 >= 1) {
            numero4 = Double.parseDouble(texto.getText().toString());


            operador = "-";
            Log.i("", "" + texto.getText().toString());
            texto.setText("");
        }
        if (numero3 <= 0) {
            numero2 = Double.parseDouble(texto.getText().toString());
            operador = "-";
            Log.i("", "" + operador + texto.getText().toString());
            texto.setText("");
        }
        if (numero3 < 2) {
            numero5 = numero2 - numero4;
            tex.setText(String.valueOf(numero2) + "-" + String.valueOf(numero4));

        } else {
            numero5 -= numero4;
            tex.setText(String.valueOf(numero5) + "-=" + String.valueOf(numero4));


        }
        resta = 1;
        numero3++;


    }

    public void multiplicacion(View view) {
        if (suma == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 + numero1;

            } else {
                total = numero2 + numero1;

            }
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            suma = 0;
        }
        if (resta == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());

            if (numero5 > 0) {
                total = numero5 - numero1;

            } else {
                total = numero2 - numero1;

            }
            suma = 0;

            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            resta = 0;


        }
        if (division == 1) {

            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero4 > 0) {
                total = numero5 / numero1;

            } else {
                total = numero2 / numero1;

            }

            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            division = 0;

        }
        if (numero3 >= 1) {
            numero4 = Double.parseDouble(texto.getText().toString());
            operador = "x";
            texto.setText("");
        }
        if (numero3 <= 0) {
            numero2 = Double.parseDouble(texto.getText().toString());
            operador = "x";
            texto.setText("");
        }
        if (numero3 < 2) {
            numero5 = numero2 * numero4;
            tex.setText(String.valueOf(numero2) + "*" + String.valueOf(numero4));

        } else {
            numero5 *= numero4;
            tex.setText(String.valueOf(numero5) + "*=" + String.valueOf(numero4));

        }
        numero3++;
        multiplicacion = 1;
    }

    public void division(View view) {
        if (multiplicacion == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 * numero1;

            } else {
                total = numero2 * numero1;


            }

            suma = 0;
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            multiplicacion = 0;

        }
        if (suma == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 + numero1;

            } else {
                total = numero2 + numero1;

            }
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            suma = 0;
        }
        if (resta == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());

            if (numero5 > 0) {
                total = numero5 - numero1;

            } else {
                total = numero2 - numero1;


            }
        }
        if (numero3 >= 1) {
            numero4 = Double.parseDouble(texto.getText().toString());
            operador = "÷";
            texto.setText("");
        }
        if (numero3 <= 0) {
            numero2 = Double.parseDouble(texto.getText().toString());
            operador = "÷";
            texto.setText("");
        }
        if (numero3 < 2) {
            numero5 = numero2 / numero4;
            tex.setText(String.valueOf(numero2) + "÷" + String.valueOf(numero4));

        } else {
            numero5 /= numero4;
            tex.setText(String.valueOf(numero5) + "÷=" + String.valueOf(numero4));


        }
        numero3++;
        division = 1;
    }

    public void porciento(View view) {
        if (division == 1) {

            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero4 > 0) {
                total = numero5 / numero1;

            } else {
                total = numero2 / numero1;

            }

            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            division = 0;

        }
        if (multiplicacion == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 * numero1;

            } else {
                total = numero2 * numero1;


            }

            suma = 0;
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            multiplicacion = 0;

        }
        if (suma == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());
            if (numero5 > 0) {
                total = numero5 + numero1;

            } else {
                total = numero2 + numero1;

            }
            suma = 0;
            numero5 = 0;
            numero3 = 0;
            numero2 = 0;
            numero4 = 0;
            texto.setText(String.valueOf(total));
            suma = 0;
        }
        if (resta == 1) {
            numero1 = Double.parseDouble(texto.getText().toString());

            if (numero5 > 0) {
                total = numero5 - numero1;

            } else {
                total = numero2 - numero1;


            }
        }
        numero2 = Double.parseDouble(texto.getText().toString());
        operador = "%";
        texto.setText("");
    }

    public void cambio(View view) {

        if (numero3 >= 1) {
            numero4 = Double.parseDouble(texto.getText().toString());
            operador = "+/-";
            numero4 = numero4 * -1;
            texto.setText(String.valueOf(numero4));
        }
        if (numero3 <= 0) {
            numero2 = Double.parseDouble(texto.getText().toString());
            operador = "+/-";
            numero2 = numero2 * -1;
            tex.setText(String.valueOf(numero2));

            texto.setText(String.valueOf(numero2));
        }


    }

    public void total(View view) {
        vectornumero++;
        switch (operador) {
            case "+":

                numero1 = Double.parseDouble(texto.getText().toString());
                if (numero5 > 0) {
                    total = numero5 + numero1;
                    tex.setText(String.valueOf(numero5) + "+" + String.valueOf(numero1));

                } else {
                    total = numero2 + numero1;
                    tex.setText(String.valueOf(numero2) + "+" + String.valueOf(numero1));

                }

                texto.setText(String.valueOf(total));
                suma = 0;
                resta = 0;
                division = 0;
                multiplicacion = 0;
                numero3 = 0;
                numero5 = 0;
                numero1 = 0;
                numero4 = 0;
                break;
            case "-":
                Log.d("error", "aqui es el error");
                numero1 = Double.parseDouble(texto.getText().toString());

                if (numero5 > 0) {
                    total = numero5 - numero1;
                    tex.setText(String.valueOf(numero5) + "-" + String.valueOf(numero1));


                } else {
                    total = numero2 - numero1;
                    tex.setText(String.valueOf(numero2) + "-" + String.valueOf(numero1));


                }


                Log.d("total", "total       " + String.valueOf(total));
                Log.d("total", "total n5      " + String.valueOf(numero5));

                Log.d("total", "numero 2   " + String.valueOf(numero2));
                Log.d("total", "numero 1     " + String.valueOf(numero1));


                texto.setText(String.valueOf(total));
                suma = 0;
                resta = 0;
                division = 0;
                multiplicacion = 0;
                numero3 = 0;
                numero5 = 0;
                numero1 = 0;
                numero4 = 0;
                break;
            case "x":
                numero1 = Double.parseDouble(texto.getText().toString());
                if (numero5 > 0) {
                    total = numero5 * numero1;
                    tex.setText(String.valueOf(numero5) + "*" + String.valueOf(numero1));

                } else {
                    total = numero2 * numero1;
                    tex.setText(String.valueOf(numero2) + "*" + String.valueOf(numero1));


                }

                suma = 0;
                suma = 0;
                numero5 = 0;
                numero3 = 0;
                numero2 = 0;
                numero4 = 0;
                texto.setText(String.valueOf(total));
                multiplicacion = 0;


                break;
            case "÷":

                numero1 = Double.parseDouble(texto.getText().toString());
                if (numero4 > 0) {
                    total = numero5 / numero1;
                    tex.setText(String.valueOf(numero5) + "÷" + String.valueOf(numero1));

                } else {
                    total = numero2 / numero1;
                    tex.setText(String.valueOf(numero2) + "÷" + String.valueOf(numero1));


                }


                texto.setText(String.valueOf(total));
                suma = 0;
                resta = 0;
                division = 0;
                multiplicacion = 0;
                numero3 = 0;
                numero5 = 0;
                numero1 = 0;
                numero4 = 0;
                break;
            case "%":
                numero1 = Double.parseDouble(texto.getText().toString());
                total = (numero2 * numero1) / 100;
                tex.setText(String.valueOf(numero2) + "%" + String.valueOf(numero1));

                texto.setText(String.valueOf(total));
                suma = 0;
                resta = 0;
                division = 0;
                multiplicacion = 0;
                numero3 = 0;
                numero5 = 0;
                numero1 = 0;
                numero4 = 0;
                break;

        }


    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Se Inicio la funcion de calculadora basica", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Esta lista para usarse la calculadora basica", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

}











