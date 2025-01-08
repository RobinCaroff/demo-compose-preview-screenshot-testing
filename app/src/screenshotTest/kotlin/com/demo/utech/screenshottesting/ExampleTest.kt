package com.demo.utech.screenshottesting

import androidx.compose.runtime.Composable
import com.demo.utech.screenshottesting.ui.theme.AppTheme

class ExamplePreviewsScreenshots {

    @PreviewAnnotations
    @Composable
    fun GreetingPreview() {
        AppTheme {
            Greeting("Android!")
        }
    }
}
