package com.samar.paymentapp.presentation.dashboard.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.samar.paymentapp.util.common.sdp

@Preview(showBackground = true)
@Composable
fun MessageCard(
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(3.1f)
            .padding(top = 5.sdp, bottom = 5.sdp, end = 5.sdp)
            .clip(RoundedCornerShape(12.sdp)),
        shape = RoundedCornerShape(12.sdp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(10.sdp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Andrea Cortes",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyMedium.fontSize
                    )
                )

                Text(
                    text = "5 min ago",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyMedium.fontSize
                    )
                )
            }
            Text(
                modifier = Modifier.padding(vertical = 2.sdp),
                text = "Problem with hot Water",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}