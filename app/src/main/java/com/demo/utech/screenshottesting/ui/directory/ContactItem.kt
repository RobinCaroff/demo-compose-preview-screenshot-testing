package com.demo.utech.screenshottesting.ui.directory

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.demo.utech.screenshottesting.R
import com.demo.utech.screenshottesting.ui.model.Contact
import com.demo.utech.screenshottesting.ui.theme.AppTheme

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
        Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.small_spacer)))
        Icon(
            imageVector = Icons.Outlined.AccountBox,
            contentDescription = stringResource(R.string.favorites),
            tint = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.size(dimensionResource(R.dimen.icon_size))
        )
        Column(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.medium_spacer))
        ) {
            Text(
                text = contact.name,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = contact.phoneNumber,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@PreviewLightDark
@Composable
internal fun ContactItemPreview() {
    AppTheme {
        ContactItem(
            Contact("Alice", "1234567890")
        )
    }
}
