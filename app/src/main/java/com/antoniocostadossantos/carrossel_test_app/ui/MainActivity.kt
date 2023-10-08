package com.antoniocostadossantos.carrossel_test_app.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearSnapHelper
import com.antoniocostadossantos.carrossel_test_app.databinding.ActivityMainBinding
import com.antoniocostadossantos.carrossel_test_app.entity.CarrosselEntity
import com.antoniocostadossantos.carrossel_test_app.ui.adapter.CarrosselAdapter
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carrosselAdapter: CarrosselAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
        sendItemsForAdapter()
    }

    private fun initAdapter() {
        val rv = binding.rvCarrossel
        carrosselAdapter = CarrosselAdapter(
            onClick = {
                Toast.makeText(this, "${it.id}", Toast.LENGTH_SHORT).show()
            }
        )
        rv.adapter = carrosselAdapter

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv)
    }

    private fun sendItemsForAdapter() {

        val items = listOf(
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),
            CarrosselEntity(
                id = Random().nextInt(10),
                imageUrl = "https://static3.tcdn.com.br/img/img_prod/460977/teste_100485_1_cbc226c7d23a19c784fb4752ffe61337.png"
            ),

            )
        carrosselAdapter.setItems(items)
    }
}