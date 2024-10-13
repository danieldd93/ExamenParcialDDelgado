package dev.danieldelgado.examenparcialdelgado.ui.slideshow.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.danieldelgado.examenparcialdelgado.R
import dev.danieldelgado.examenparcialdelgado.ui.slideshow.model.ClienteModel

class ClienteAdapter(private var lstCliente: List<ClienteModel>)
    : RecyclerView.Adapter<ClienteAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val ivCarro = itemView.findViewById<ImageView>(R.id.imgCarro)
        val tvName = itemView.findViewById<TextView>(R.id.txtNombre)
        val tvMarca = itemView.findViewById<TextView>(R.id.txtMarca)
        val tvModelo = itemView.findViewById<TextView>(R.id.txtModelo)
        val tvPlaca = itemView.findViewById<TextView>(R.id.txtPlaca)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_cliente, parent, false))
    }

    override fun getItemCount(): Int {
        return lstCliente.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemCliente = lstCliente[position]
        holder.ivCarro.setImageResource(itemCliente.image)
        holder.tvName.text = itemCliente.ClienteName
        holder.tvMarca.text = itemCliente.marca
        holder.tvModelo.text = itemCliente.modelo
        holder.tvPlaca.text = itemCliente.placa
    }
}