package com.demo.utech.screenshottesting

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.demo.utech.screenshottesting.ui.theme.AppTheme

class ExamplePreviewsScreenshots {
    @PreviewAnnotations
    @Composable
    fun ButtonPreviewTest() {
        AppTheme {
            Button(
                onClick = {},
                modifier = Modifier.wrapContentSize()
            ) {
                Text(stringResource(R.string.click_me))
            }
        }
    }
}
