package com.example.quotesapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.quotesapp.navbar.BottomNavBar
import com.example.quotesapp.navbar.NavItem

@Composable
fun SettingsScreen(
    selectedItem: NavItem,
    onItemSelected: (NavItem) -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomNavBar(
                selectedItem = selectedItem,
                onItemSelected = onItemSelected
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box {
                Text(
                    text = "Settings Screen",
                    fontSize = 30.sp
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSettingsScreen() {
    SettingsScreen(selectedItem = NavItem.SETTINGS, onItemSelected = {})
}
