package com.example.mrpotatohead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkBox(box: View) {
        var imgMap: HashMap<CheckBox, ImageView> = hashMapOf(hat to hatimg, nose to noseimg, arms to armsimg, glasses to glassesimg, ears to earsimg,
            eyebrows to eyebrowsimg, mustache to mustacheimg, eyes to eyesimg, mouth to mouthimg, shoes to shoesimg)
        box as CheckBox
        var img: ImageView? = imgMap[box]
        if (box.isChecked) {
            img?.visibility = View.VISIBLE
        } else {
            img?.visibility = View.INVISIBLE
        }
    }
}
