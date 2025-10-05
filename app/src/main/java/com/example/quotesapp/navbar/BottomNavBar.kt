package com.example.quotesapp.navbar

import androidx.compose.foundation.layout.*
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.R

@Composable
fun BottomNavBar(
    selectedItem: NavItem = NavItem.HOME,
    onItemSelected: (NavItem) -> Unit = {}
) {
    BottomAppBar(
        modifier = Modifier.height(120.dp),
        containerColor = Color.White
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Home
            NavBarItem(
                icon = if (selectedItem == NavItem.HOME)
                    R.drawable.ic_home_selected
                else
                    R.drawable.home_notselected,
                label = "Home",
                isSelected = selectedItem == NavItem.HOME,
                onClick = { onItemSelected(NavItem.HOME) }
            )

            // Favorites
            NavBarItem(
                icon = if (selectedItem == NavItem.FAVORITES)
                    R.drawable.fav
                else
                    R.drawable.fav_notselected,
                label = "Favorites",
                isSelected = selectedItem == NavItem.FAVORITES,
                onClick = { onItemSelected(NavItem.FAVORITES) }
            )

            // Settings
            NavBarItem(
                icon = if (selectedItem == NavItem.SETTINGS)
                    R.drawable.settings
                else
                    R.drawable.settings_notselected,
                label = "Settings",
                isSelected = selectedItem == NavItem.SETTINGS,
                onClick = { onItemSelected(NavItem.SETTINGS) }
            )
        }
    }
}

@Composable
private fun NavBarItem(
    icon: Int,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = Modifier.size(80.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = label,
                modifier = Modifier.size(28.dp),
                tint = if (isSelected) Color(0xFFFF8C42) else Color.Gray
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = label,
                fontSize = 12.sp,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                color = if (isSelected) Color(0xFFFF8C42) else Color.Gray
            )
        }
    }
}

enum class NavItem {
    HOME, FAVORITES, SETTINGS
}

@Preview(showSystemUi = true)
@Composable
private fun BottomNavBarPreview() {
    var selectedItem by remember { mutableStateOf(NavItem.HOME) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        BottomNavBar(
            selectedItem = selectedItem,
            onItemSelected = { selectedItem = it }
        )
    }
}