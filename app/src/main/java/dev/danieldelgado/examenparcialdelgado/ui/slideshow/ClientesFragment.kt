package dev.danieldelgado.examenparcialdelgado.ui.slideshow

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
import dev.danieldelgado.examenparcialdelgado.ui.slideshow.adapter.ClienteAdapter
import dev.danieldelgado.examenparcialdelgado.ui.slideshow.model.ClienteModel

class ClientesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_clientes, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvClientes)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = ClienteAdapter(ListClientes())

        return view
    }

    private fun ListClientes(): List<ClienteModel>{
        var lstSong: ArrayList<ClienteModel> = ArrayList()

        lstSong.add(
            ClienteModel(1,R.drawable.mercedes
                ,"Edison Flores"
                ,"MERCEDES"
                ,"CLA"
                , "LVO-333"))
        lstSong.add(
            ClienteModel(2,R.drawable.nissan
                ,"Pedro Gallese"
                ,"NISSAN"
                ,"TT"
                , "SPI-246"))
        lstSong.add(
            ClienteModel(3,R.drawable.susuki
                ,"Jorge Fossati"
                ,"SUSUKI"
                ,"GRAND VITARA"
                , "URU-678"))
        return lstSong
    }
}