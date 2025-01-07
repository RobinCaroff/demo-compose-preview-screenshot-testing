package com.demo.utech.screenshottesting

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.demo.utech.screenshottesting.ui.theme.ScreenshotTestingTheme

class ExamplePreviewsScreenshots {

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ScreenshotTestingTheme {
            Greeting("Android!")
        }
    }
}