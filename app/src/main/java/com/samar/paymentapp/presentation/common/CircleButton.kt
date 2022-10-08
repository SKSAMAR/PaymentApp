package com.samar.paymentapp.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import com.samar.paymentapp.util.common.sdp

@Composable
fun CircleButton(
    color: Color,
    imageVector: ImageVector,
    shape: Shape = CircleShape

){
    Box(
        modifier = Modifier
            .background(
                shape = shape,
                color = color
            )
            .clip(shape = shape)
    ){
        Icon(
            modifier = Modifier.padding(8.sdp),
            imageVector = imageVector,
            contentDescription = "imageVector",
            tint = MaterialTheme.colorScheme.surface
        )
    }
}