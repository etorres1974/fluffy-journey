package br.com.mylibrary

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

interface Toaster {
    fun showToast(context: Context, message : String)
}
