package com.samar.paymentapp.domain.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class OperatorCardModel(
    val type: String,
    val amount: String,
    val icon: ImageVector
)

val operatorList = listOf(
    OperatorCardModel( type =  "Electricity", amount = "$250.90", icon = Icons.Default.ElectricBolt),
    OperatorCardModel( type =  "Water", amount = "$126.10", icon = Icons.Default.WaterDrop),
    OperatorCardModel( type =  "Trash", amount = "$35.00", icon = Icons.Default.RestoreFromTrash),
    OperatorCardModel( type =  "Wifi", amount = "$19.90", icon = Icons.Default.Router),
)