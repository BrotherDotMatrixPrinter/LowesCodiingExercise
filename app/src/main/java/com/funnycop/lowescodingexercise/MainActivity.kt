package com.funnycop.lowescodingexercise

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.funnycop.lowescodingexercise.ui.composable.NavigationController
import com.funnycop.lowescodingexercise.ui.theme.LowesCodingExerciseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

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