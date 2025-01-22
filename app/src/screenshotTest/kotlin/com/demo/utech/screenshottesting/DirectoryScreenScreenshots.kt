package com.demo.utech.screenshottesting

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.demo.utech.screenshottesting.ui.data.ContactProvider
import com.demo.utech.screenshottesting.ui.directory.DirectoryScreenPreview
import com.demo.utech.screenshottesting.ui.model.Contact

class DirectoryScreenScreenshots {
    @PreviewScreenshotTest
    @Composable
    fun CallCardPreviewTest(
        @PreviewParameter(ContactProvider::class) directory: List<Contact>
    ) {
        DirectoryScreenPreview(directory)
    }
}