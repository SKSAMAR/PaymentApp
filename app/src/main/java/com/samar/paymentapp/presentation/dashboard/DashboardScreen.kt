package com.samar.paymentapp.presentation.dashboard

import android.annotation.SuppressLint
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun DashboardScreen(){
    Scaffold(
        floatingActionButton = {

            FloatingActionButton(
                onClick = {},
                shape = CircleShape
            ) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "setting")
            }
        }
    ) {

    }
}