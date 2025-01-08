package com.demo.utech.screenshottesting

import androidx.compose.runtime.Composable
import com.demo.utech.screenshottesting.ui.theme.ScreenshotTestingTheme

class ExamplePreviewsScreenshots {

    @PreviewAnnotations
    @Composable
    fun GreetingPreview() {
        ScreenshotTestingTheme {
            Greeting("Android!")
        }
    }
}
