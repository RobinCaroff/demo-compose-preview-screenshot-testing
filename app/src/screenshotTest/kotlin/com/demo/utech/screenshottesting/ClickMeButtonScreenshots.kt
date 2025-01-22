package com.demo.utech.screenshottesting

import androidx.compose.runtime.Composable
import com.demo.utech.screenshottesting.ui.components.ClickMeButtonPreview

class ClickMeButtonScreenshots {
    @PreviewScreenshotTest
    @Composable
    fun ButtonPreviewTest() {
        ClickMeButtonPreview()
    }
}
