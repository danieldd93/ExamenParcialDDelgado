package dev.danieldelgado.examenparcialdelgado.ui.gallery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.danieldelgado.examenparcialdelgado.ui.gallery.model.ServicioModel
import dev.danieldelgado.examenparcialdelgado.R

class ServicioAdapter(private var lstServicio: List<ServicioModel>)
    : RecyclerView.Adapter<ServicioAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val ptName = itemView.findViewById<TextView>(R.id.ptName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_servicio, parent, false))
    }

    override fun getItemCount(): Int {
        return lstServicio.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstServicio[position]
        holder.ptName.text = itemSong.servicioName
    }
}
