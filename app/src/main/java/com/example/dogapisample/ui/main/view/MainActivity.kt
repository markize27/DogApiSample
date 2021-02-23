package com.example.dogapisample.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.dogapisample.R
import com.example.dogapisample.ui.main.viewModel.MainActivityViewModel
import com.example.dogapisample.viewmodel.DogViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

            //КОНФЛИКТ ТАК СКАЗАТЬ
            //КОНФЛИКТ ТАК СКАЗАТЬ//КОНФЛИКТ ТАК СКАЗАТЬ
    //КОНФЛИКТ ТАК СКАЗАТЬ
    //КОНФЛИКТ ТАК СКАЗАТЬ

    @Inject
    lateinit var viewModel: MainActivityViewModel

    private lateinit var vm: DogViewModel


    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)

        vm = ViewModelProvider(this)[DogViewModel::class.java]


        vm.fetchRandomDog()

        vm.dogModelLiveData?.observe(this, Observer {
            if (it != null) {
                Glide.with(this).load(it.message).into(imageView)
            } else {
                showToast("Something went wrong")
            }
        })
        imageView.setOnClickListener {
            vm.fetchRandomDog()

            vm.dogModelLiveData?.observe(this, Observer {
                if (it != null) {
                    Glide.with(this).load(it.message).into(imageView)
                } else {
                    showToast("Something went wrong")
                }
            })
        }
    }


    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}