package com.demo.utech.screenshottesting.ui.data

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.demo.utech.screenshottesting.ui.model.Contact

class ContactProvider : PreviewParameterProvider<List<Contact>> {
    override val values: Sequence<List<Contact>> = sequenceOf(
        listOf(
            Contact("Robin", "0234567890"),
            Contact("John", "0987654321"),
            Contact("Robert", "0234567890"),
            Contact("Bob", "0987654321"),
            Contact("Charlie", "0234567890"),
            Contact("David", "0987654321"),
            Contact("Eve", "0234567890"),
            Contact("Frank", "0987654321"),
            Contact("Grace", "0234567890")
        )
    )
}
