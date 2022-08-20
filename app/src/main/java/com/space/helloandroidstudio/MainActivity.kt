package com.space.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var numero1: Double = 0.0
    lateinit var acumulador: TextView;
    lateinit var resultadoBoton: TextView;
    var operacion : Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        acumulador = findViewById(R.id.acumulador);
        resultadoBoton = findViewById(R.id.resultadoBoton);
        val clearBoton: Button = findViewById(R.id.clearBoton);
        val igualBoton: Button = findViewById(R.id.igualBoton);


    }


    fun numeroPresionado(view: View){
        var num2: String = resultadoBoton.text.toString()

        when(view.id){
            R.id.ceroBoton -> resultadoBoton.setText(num2+ "0");
            R.id.unoBoton -> resultadoBoton.setText(num2 + "1");
            R.id.dosBoton -> resultadoBoton.setText(num2+ "2");
            R.id.tresBoton -> resultadoBoton.setText(num2 + "3");
            R.id.cuatroBoton -> resultadoBoton.setText(num2 + "4");
            R.id.cincoBoton -> resultadoBoton.setText(num2 + "5");
            R.id.seisBoton -> resultadoBoton.setText(num2 + "6");
            R.id.sieteBoton -> resultadoBoton.setText(num2 + "7");
            R.id.ochoBoton -> resultadoBoton.setText(num2 + "8");
            R.id.nueveBoton -> resultadoBoton.setText(num2 + "9");
            R.id.puntoBoton -> resultadoBoton.setText(num2+ ".");

        }

    }

    fun clickOperacion(view: View){
        numero1 = resultadoBoton.text.toString().toDouble();
        var num2_text: String = resultadoBoton.text.toString()
        resultadoBoton.setText("")
        when(view.id){
            R.id.sumaBoton ->{
                acumulador.setText(num2_text + "+")
                operacion = 1
            }
            R.id.restaBoton ->{
                acumulador.setText(num2_text + "-")
                operacion = 2
            }
            R.id.multiplicarBoton ->{
                acumulador.setText(num2_text + "x")
                operacion = 3
            }
            R.id.divisionBoton ->{
                acumulador.setText(num2_text + "÷")
                operacion = 4
            }
        }
    }


}