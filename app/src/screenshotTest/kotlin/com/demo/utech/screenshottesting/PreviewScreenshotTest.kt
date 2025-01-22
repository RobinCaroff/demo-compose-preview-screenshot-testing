package com.demo.utech.screenshottesting

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.demo.utech.screenshottesting.ui.theme.PreviewFrench
import com.demo.utech.screenshottesting.ui.theme.PreviewsUFontScale
import com.demo.utech.screenshottesting.ui.theme.PreviewsUOrientation

/**
 * Annotation for composing screenshot tests.
 * This annotation combines default preview, orientation previews, dark and light and font scale previews.
 * It is specifically designed for screenshot tests only.
 */
@Preview
@PreviewFrench
@PreviewsUOrientation
@PreviewsUFontScale
@PreviewLightDark
annotation class PreviewScreenshotTest
