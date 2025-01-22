package com.demo.utech.screenshottesting.ui.directory

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.demo.utech.screenshottesting.R
import com.demo.utech.screenshottesting.ui.model.Contact

@Composable
fun ContactItem(
    contact: Contact,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.padding(4.dp))
        Icon(Icons.Outlined.AccountBox, contentDescription = stringResource(R.string.favorites))
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(contact.name)
            Text(contact.phoneNumber)
        }
    }
}

@PreviewLightDark
@Composable
internal fun ContactItemPreview() {
    ContactItem(
        Contact("Alice", "1234567890")
    )
}
