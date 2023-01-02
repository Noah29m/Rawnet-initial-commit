package com.example.rawnet

import Screens.HomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.rawnet.ui.theme.RawNetTheme



class MainActivity : ComponentActivity() {


    companion object{
        val TAG : String = MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RawNetTheme {
                HomeScreen()




            }

        }
    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.

        }
    }



    @Composable
    fun RawNet () {
        RawNetTheme {
            Surface(color = MaterialTheme.colors.background) {

            }

        }
    }

