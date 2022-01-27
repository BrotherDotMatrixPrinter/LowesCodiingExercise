package com.funnycop.lowescodingexercise.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(

    primary = Liberty,
    primaryVariant = StPatricksBlue,
    secondary = Lilac,

    background = RaisinBlack,
    surface = RaisinBlack,
    onPrimary = RaisinBlack,
    onSecondary = Alabaster,
    onBackground = Alabaster,
    onSurface = Alabaster

)

private val LightColorPalette = lightColors(

    primary = DarkCornflowerBlue,
    primaryVariant = StPatricksBlue,
    secondary = Lilac,

    background = Alabaster,
    surface = Alabaster,
    onPrimary = Alabaster,
    onSecondary = RaisinBlack,
    onBackground = RaisinBlack,
    onSurface = RaisinBlack

)

@Composable
fun LowesCodingExerciseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}