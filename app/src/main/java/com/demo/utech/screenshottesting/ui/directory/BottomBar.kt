package com.demo.utech.screenshottesting.ui.directory

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.demo.utech.screenshottesting.R

@Composable
fun BottomBar() {
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