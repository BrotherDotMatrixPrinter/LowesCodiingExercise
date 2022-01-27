package com.funnycop.lowescodingexercise.ui.composable

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable

@Composable
fun TopNavigationBar(

    title: String,
    navigateBack: () -> Unit

) {

    TopAppBar(

        title = { Text(title) },

        navigationIcon = { IconButton(onClick = navigateBack) {

            Icon(

                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back"

            )

        } }

    )

}