package com.example.myjojo

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable

@Composable
fun MyJojoApp(windowSize: WindowSizeClass){
    when(windowSize.widthSizeClass){
        WindowWidthSizeClass.Compact -> {
            AppPortrait()
        }
        WindowWidthSizeClass.Expanded -> {
            AppLandscape()
        }
    }

}
