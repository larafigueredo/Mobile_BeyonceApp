package com.example.DiscografiaBeyonce.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.DiscografiaBeyonce.models.Discos
import com.example.DiscografiaBeyonce.models.discosList
import com.example.DiscografiaBeyonce.ui.components.DiscosListItem

@Composable
fun HomeScreen(onDiscosSelected: (Discos) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }
    val filteredDiscos = remember(searchQuery) {
        discosList.filter { it.name.contains(searchQuery, ignoreCase = true) }
    }
    Column {
        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Pesquisar") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            items(filteredDiscos) { discos ->
                DiscosListItem(discos, onDiscosSelected)
            }
        }
    }
}

