package com.demo.utech.screenshottesting

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.demo.utech.screenshottesting.ui.Contact
import com.demo.utech.screenshottesting.ui.ContactProvider
import com.demo.utech.screenshottesting.ui.directory.DirectoryScreenPreview

class DirectoryScreenScreenshots {
    @PreviewAnnotations
    @Composable
    fun CallCardPreviewTest(
        @PreviewParameter(ContactProvider::class) directory: List<Contact>
    ) {
        DirectoryScreenPreview(directory)
    }
}