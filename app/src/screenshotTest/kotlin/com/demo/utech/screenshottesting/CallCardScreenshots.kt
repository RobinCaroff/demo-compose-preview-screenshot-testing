package com.demo.utech.screenshottesting

import androidx.compose.runtime.Composable
import com.demo.utech.screenshottesting.ui.components.CallCardPreview

class CallCardScreenshots {
    @PreviewScreenshotTest
    @Composable
    fun CallCardPreviewTest() {
        CallCardPreview()
    }
}
