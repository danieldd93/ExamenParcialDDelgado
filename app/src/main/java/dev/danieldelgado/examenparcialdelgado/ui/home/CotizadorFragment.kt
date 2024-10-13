package dev.danieldelgado.examenparcialdelgado.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.danieldelgado.examenparcialdelgado.R

class CotizadorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_cotizador, container, false)

        val spServicios: Spinner = view.findViewById(R.id.cmbServicios)
        ArrayAdapter
            .createFromResource(requireContext(),R.array.servicios_array,
                android.R.layout.simple_spinner_item).also {
                    adapter ->
                adapter.setDropDownViewResource(
                    android.R.layout.simple_spinner_dropdown_item)
                spServicios.adapter = adapter
            }
        //spCountry on ItemSelectedListener
        var spServicioValue = ""

        spServicios.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                spServicioValue = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        spServicios.setSelection(0, false)

        // Obtener referencias a los elementos
        val etCantidad = view.findViewById<EditText>(R.id.txtCantidad)
        val etCosto = view.findViewById<EditText>(R.id.txtCosto)
        val btnCalcular = view.findViewById<Button>(R.id.btnCalcular)
        val tvResultado = view.findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            val cantidadText = etCantidad.text.toString()
            val costoText = etCosto.text.toString()

            if (cantidadText.isNotEmpty() && costoText.isNotEmpty()) {
                val cantidad = cantidadText.toDouble()
                val costo = costoText.toDouble()

                val resultado = cantidad * costo

                tvResultado.text = "El costo es de: $resultado USD"
            } else {
                Toast.makeText(requireContext(), "Por favor ingrese cantidad y costo", Toast.LENGTH_SHORT).show()

            }
        }

        return view
    }

}