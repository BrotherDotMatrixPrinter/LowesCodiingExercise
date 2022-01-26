package com.funnycop.lowescodingexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.funnycop.lowescodingexercise.ui.composable.NavigationController
import com.funnycop.lowescodingexercise.ui.theme.LowesCodingExerciseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            LowesCodingExerciseTheme {

                Surface(color = MaterialTheme.colors.background) {

                    NavigationController()

                }

            }

        }

    }

}