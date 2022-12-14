package com.color.color_my_views_

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.color.color_my_views_.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableView : List<View> = listOf(binding.boxOneText,binding.boxTwoText,
            binding.boxThreeText,binding.boxFourText,binding.boxFiveText,binding.constraintLayout,
            binding.redButton,binding.yellowButton,binding.greenButton)
        for(item in clickableView)
        {
//            item.setOnClickListener(makeColored(item))
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)


            R.id.red_button -> view.setBackgroundResource(android.R.color.holo_red_light)
            R.id.yellow_button -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.green_button -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}