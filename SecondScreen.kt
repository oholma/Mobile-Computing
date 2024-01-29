package com.example.composetutorial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Button(
            onClick = { navController.popBackStack() }
        ) {
            Text("Back to the messages")
        }
        val contactsSample = listOf(
            Text("List of my contacts:"),
            Text("Matti Meikäläinen"),
            Text("Maija Mehiläinen"),
            Text("Lumi Koskinen"),
            Text("Aava Virtanen"))
    }
}