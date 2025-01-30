package com.demo.utech.screenshottesting.ui.directory

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.demo.utech.screenshottesting.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DirectoryTopAppBar() {
    TopAppBar(
        title = { Text(stringResource(R.string.directory)) }
    )
}