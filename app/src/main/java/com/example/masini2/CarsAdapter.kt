package com.example.masini2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.masini2.data.CarItem
import com.example.masini2.databinding.OneItemBinding


class CarsAdapter(private val carItems: List<CarItem>) : RecyclerView.Adapter<CarsAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(OneItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val carItem=carItems[position]
        holder.bind(carItem)
    }

    override fun getItemCount() = carItems.size

    class ViewHolder(val binding: OneItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(carItem: CarItem)
        {
            binding.carTitle.text=carItem.model
            binding.imageView.setImageResource(carItem.photo)
            binding.imageView.setOnClickListener{
                val action = ThirdFragmentDirections.actionThirdFragmentToCarInfo(carIdArgument = carItem.id)
                itemView.findNavController().navigate(action)
            }


        }

    }
}


/*class CarsAdapter(private val carItems: List<CarItem>) : RecyclerView.Adapter<CarsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_item,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val carItem=carItems[position]
        holder.bind(carItem)
    }

    override fun getItemCount() = carItems.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        fun bind(carItem: CarItem) {
            var carTitle = itemView.findViewById<View>(R.id.carTitle)
        }
    }
}*/