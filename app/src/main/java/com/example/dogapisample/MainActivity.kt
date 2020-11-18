package com.example.dogapisample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.dogapisample.viewmodel.DogViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var vm:DogViewModel
   // private lateinit var adapter:
private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)

        vm = ViewModelProvider(this)[DogViewModel::class.java]

      //  initAdapter()

        vm.fetchRandomDog()

        vm.dogModelLiveData?.observe(this, Observer {
            if (it!=null){
                Glide.with(this).load(it.message).into(imageView)
            }else{
                showToast("Something went wrong")
            }
        })
        imageView.setOnClickListener {
            vm.fetchRandomDog()

            vm.dogModelLiveData?.observe(this, Observer {
                if (it!=null){
                    Glide.with(this).load(it.message).into(imageView)
                }else{
                    showToast("Something went wrong")
                }
            })
        }
    }

    


    private fun showToast(msg:String){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }


}