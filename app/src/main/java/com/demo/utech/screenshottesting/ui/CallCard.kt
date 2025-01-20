package com.demo.utech.screenshottesting.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.demo.utech.screenshottesting.R
import com.demo.utech.screenshottesting.ui.theme.AppTheme

@Composable
fun CallCard(
    userName: String,
    modifier: Modifier = Modifier,
    onCLick: () -> Unit = { }
) {
    val context = LocalContext.current
    Card(
        modifier = modifier
            .clickable { onCLick() }
            .semantics {
                this.contentDescription = context.getString(R.string.call_name, userName)
            },
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                imageVector = Icons.Rounded.Call,
                contentDescription = null
            )
            Text(userName)
        }
    }
}

@Composable
@PreviewLightDark
internal fun CallCardPreview() {
    AppTheme {
        CallCard("Robin")
    }
}
