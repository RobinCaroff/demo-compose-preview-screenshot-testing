package com.demo.utech.screenshottesting

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.demo.utech.screenshottesting.ui.PreviewFrench
import com.demo.utech.screenshottesting.ui.PreviewsUFontScale
import com.demo.utech.screenshottesting.ui.PreviewsUOrientation

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
annotation class PreviewAnnotations
