package com.example.quotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.quotesapp.navbar.BottomNavBar
import com.example.quotesapp.navbar.NavItem
import com.example.quotesapp.screens.HomeScreen
import com.example.quotesapp.screens.FavoriteScreen
import com.example.quotesapp.screens.SettingsScreen
import com.example.quotesapp.ui.theme.QuotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuotesAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var selectedItem by remember { mutableStateOf(NavItem.HOME) }

    when (selectedItem) {
        NavItem.HOME -> HomeScreen(
            selectedItem = selectedItem,
            onItemSelected = { selectedItem = it }
        )
        NavItem.FAVORITES -> FavoriteScreen(
            selectedItem = selectedItem,
            onItemSelected = { selectedItem = it }
        )
        NavItem.SETTINGS -> SettingsScreen(
            selectedItem = selectedItem,
            onItemSelected = { selectedItem = it }
        )
    }
}
