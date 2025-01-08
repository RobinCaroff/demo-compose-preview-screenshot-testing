package com.demo.utech.screenshottesting.ui

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.demo.utech.screenshottesting.ui.theme.AppTheme

@Composable
fun CallCard(
    userName: String,
    modifier: Modifier = Modifier,

    ) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                imageVector = Icons.Rounded.Call,
                contentDescription = "Call Icon"
            )
            Text(userName)
        }
    }
}

@Composable
@Preview
fun CallCardPreview() {
    AppTheme {
        CallCard("Robin")
    }
}
