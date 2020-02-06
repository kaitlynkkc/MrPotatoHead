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

//    fun checkBox(box: View) {
//        box as CheckBox
//        if (box.isChecked) {
//            .visibility = View.VISIBLE
//        } else {
//            .visibility = View.INVISIBLE
//        }
//    }

//    fun toggleVisible(box: View, img: ImageView) {
//
//    }

    fun checkBox(view: View) {
        view as CheckBox
        if (hat == view) {
            if (view.isChecked) {
                hatimg.visibility = View.VISIBLE
            } else {
                hatimg.visibility = View.INVISIBLE
            }
        }
        if (nose == view) {
            if (view.isChecked) {
                noseimg.visibility = View.VISIBLE
            } else {
                noseimg.visibility = View.INVISIBLE
            }
        }
        if (arms == view) {
            if (view.isChecked) {
                armsimg.visibility = View.VISIBLE
            } else {
                armsimg.visibility = View.INVISIBLE
            }
        }
        if (glasses == view) {
            if (view.isChecked) {
                glassesimg.visibility = View.VISIBLE
            } else {
                glassesimg.visibility = View.INVISIBLE
            }
        }
        if (ears == view) {
            if (view.isChecked) {
                earsimg.visibility = View.VISIBLE
            } else {
                earsimg.visibility = View.INVISIBLE
            }
        }
        if (eyebrows == view) {
            if (view.isChecked) {
                eyebrowsimg.visibility = View.VISIBLE
            } else {
                eyebrowsimg.visibility = View.INVISIBLE
            }
        }
        if (mustache == view) {
            if (view.isChecked) {
                mustacheimg.visibility = View.VISIBLE
            } else {
                mustacheimg.visibility = View.INVISIBLE
            }
        }
        if (eyes == view) {
            if (view.isChecked) {
                eyesimg.visibility = View.VISIBLE
            } else {
                eyesimg.visibility = View.INVISIBLE
            }
        }
        if (mouth == view) {
            if (view.isChecked) {
                mouthimg.visibility = View.VISIBLE
            } else {
                mouthimg.visibility = View.INVISIBLE
            }
        }
        if (shoes == view) {
            if (view.isChecked) {
                shoesimg.visibility = View.VISIBLE
            } else {
                shoesimg.visibility = View.INVISIBLE
            }
        }
    }
}
