package com.samar.paymentapp.presentation.setting.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.samar.paymentapp.util.common.sdp

@Preview(showBackground = true)
@Composable
fun PropertyCard(
    modifier: Modifier = Modifier,
    address: String = "Hamburg 1, 10115 Berlin"
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(3.1f)
            .padding(top = 5.sdp, bottom = 5.sdp, end = 5.sdp)
            .clip(RoundedCornerShape(12.sdp)),
        shape = RoundedCornerShape(12.sdp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.inversePrimary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.sdp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Address",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                        color = MaterialTheme.colorScheme.inverseSurface
                    )
                )
                Icon(
                    imageVector = Icons.Default.MoreHoriz,
                    contentDescription = "dots",
                    tint = MaterialTheme.colorScheme.inverseSurface
                )
            }
            Text(
                modifier = Modifier.padding(vertical = 2.sdp),
                text = address,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colorScheme.inverseSurface
            )


        }
    }
}