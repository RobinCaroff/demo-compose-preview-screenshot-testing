package com.demo.utech.screenshottesting.ui.components

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.demo.utech.screenshottesting.R
import com.demo.utech.screenshottesting.ui.theme.AppTheme
import com.demo.utech.screenshottesting.ui.theme.PreviewFrench

@Composable
fun ClickMeButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onClick,
        modifier = modifier.wrapContentSize()
    ) {
        Text(stringResource(R.string.click_me))
    }
}

@Composable
@PreviewFrench
@PreviewLightDark
internal fun ClickMeButtonPreview() {
    AppTheme {
        ClickMeButton(onClick = {})
    }
}
