package com.funnycop.lowescodingexercise.ui.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController

@Composable
fun CityLookup(navController: NavController) {

    var city by remember { mutableStateOf("") }

    ConstraintLayout(

        modifier = Modifier.fillMaxSize()

    ) {

        val (textField, spacer, button) = createRefs()

        createVerticalChain(textField, spacer, button, chainStyle = ChainStyle.Packed)

        TextField(

            value = city,
            onValueChange = { city = it },
            label = { Text("City Name") },

            modifier = Modifier.constrainAs(textField) {

                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(spacer.top)

            }

        )

        Spacer(

            modifier = Modifier.height(8.dp).constrainAs(spacer) {

                top.linkTo(textField.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(button.top)

            }

        )

        OutlinedButton(

            content = { Text("Lookup") },
            onClick = { /*TODO*/ },

            modifier = Modifier.constrainAs(button) {

                top.linkTo(spacer.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)

            }

        )

    }

}