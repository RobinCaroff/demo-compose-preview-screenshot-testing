package com.demo.utech.screenshottesting.ui.directory

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.demo.utech.screenshottesting.R
import com.demo.utech.screenshottesting.ui.Contact
import com.demo.utech.screenshottesting.ui.ContactProvider
import com.demo.utech.screenshottesting.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DirectoryScreen(
    directory: List<Contact>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.directory)) }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = { Icon(Icons.Outlined.Star, contentDescription = stringResource(R.string.favorites)) },
                    label = { Text(stringResource(R.string.favorites)) },
                    selected = false,
                    onClick = {}
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Outlined.DateRange, contentDescription = stringResource(R.string.recent)) },
                    label = { Text(stringResource(R.string.recent)) },
                    selected = false,
                    onClick = {}
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = stringResource(R.string.contacts)) },
                    label = { Text(stringResource(R.string.contacts)) },
                    selected = true,
                    onClick = {}
                )
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier,
            contentPadding = paddingValues
        ) {
            items(directory) { contact ->
                ContactItem(contact)
            }
        }
    }
}

@Composable
@PreviewLightDark
internal fun DirectoryScreenPreview(
    @PreviewParameter(ContactProvider::class) directory: List<Contact>
) {
    AppTheme {
        DirectoryScreen(directory)
    }
}
