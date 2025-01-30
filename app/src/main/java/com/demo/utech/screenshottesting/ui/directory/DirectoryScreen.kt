package com.demo.utech.screenshottesting.ui.directory

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.demo.utech.screenshottesting.ui.data.ContactProvider
import com.demo.utech.screenshottesting.ui.model.Contact
import com.demo.utech.screenshottesting.ui.theme.AppTheme

@Composable
fun DirectoryScreen(
    directory: List<Contact>,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = { DirectoryTopAppBar() },
        bottomBar = { BottomBar() }
    ) { paddingValues ->
        LazyColumn(
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
