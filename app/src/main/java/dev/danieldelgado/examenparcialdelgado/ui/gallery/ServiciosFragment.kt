package dev.danieldelgado.examenparcialdelgado.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.danieldelgado.examenparcialdelgado.R
import dev.danieldelgado.examenparcialdelgado.ui.gallery.adapter.ServicioAdapter
import dev.danieldelgado.examenparcialdelgado.ui.gallery.model.ServicioModel

class ServiciosFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_servicios, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvServicios)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = ServicioAdapter(ListServicios())

        return view
    }

    private fun ListServicios(): List<ServicioModel>{
        var lstServicios: ArrayList<ServicioModel> = ArrayList()

        lstServicios.add(ServicioModel(1,"Cambio de aceite"))
        lstServicios.add(ServicioModel(2,"Mantenimiento correctivo"))
        lstServicios.add(ServicioModel(3,"Alineamiento de dirección"))
        lstServicios.add(ServicioModel(4,"Cambio de frenos"))
        lstServicios.add(ServicioModel(5,"Lavado de motor"))

        return lstServicios
    }

}