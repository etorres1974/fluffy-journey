package br.com.mylibrary

import android.content.Context
import android.widget.Toast

class HelloWorld {

    fun showToast(context: Context, message : String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
    fun Context.showToast(context: Context, message : String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}