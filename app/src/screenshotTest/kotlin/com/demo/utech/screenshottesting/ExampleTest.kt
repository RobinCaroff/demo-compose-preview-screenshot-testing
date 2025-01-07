package com.google.yourapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.yourapp.ui.theme.MyApplicationTheme

class ExamplePreviewsScreenshots {

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyApplicationTheme {
            Greeting("Android!")
        }
    }
}