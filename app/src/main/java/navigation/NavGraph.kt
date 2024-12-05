package com.example.DiscografiaBeyonce.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.DiscografiaBeyonce.models.Discos
import com.example.DiscografiaBeyonce.ui.screens.DiscosScreen
import com.example.DiscografiaBeyonce.ui.screens.HomeScreen
import com.example.DiscografiaBeyonce.models.discosList
import com.example.DiscografiaBeyonce.ui.screens.DiscosScreen

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen { disco ->
                navController.navigate("animal/${disco.name}")
            }
        }
        composable("animal/{animal}") { backStackEntry ->
            val animalName = backStackEntry.arguments?.getString("animal")
            val selectedDisco = discosList.first { it.name == animalName }
            DiscosScreen(selectedDisco)
        }
    }
}

