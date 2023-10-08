package com.antoniocostadossantos.carrossel_test_app.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.antoniocostadossantos.carrossel_test_app.databinding.CarrosselItemBinding
import com.antoniocostadossantos.carrossel_test_app.entity.CarrosselEntity

class CarrosselAdapter(
    val onClick: (CarrosselEntity) -> Unit,
) : RecyclerView.Adapter<CarrosselAdapter.CarrosselViewHolder>() {

    private var carrosselItems = mutableListOf<CarrosselEntity>()

    fun setItems(items: List<CarrosselEntity>) {
        carrosselItems.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarrosselViewHolder {
        val binding =
            CarrosselItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return CarrosselViewHolder(binding)
    }

    override fun getItemCount() = carrosselItems.size

    override fun onBindViewHolder(holder: CarrosselViewHolder, position: Int) {
        holder.bind(carrosselItems[position])

        holder.binding.carrosselImage.setOnClickListener {
            onClick(carrosselItems[position])
        }
    }

    class CarrosselViewHolder(val binding: CarrosselItemBinding) : ViewHolder(binding.root) {

        fun bind(carrosselEntity: CarrosselEntity) {
            binding.carrosselImage.load(carrosselEntity.imageUrl)
        }
    }

}

