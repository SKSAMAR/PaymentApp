package com.samar.paymentapp.presentation.dashboard.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.samar.paymentapp.domain.model.OperatorCardModel
import com.samar.paymentapp.presentation.common.CircleButton
import com.samar.paymentapp.util.common.sdp

@Composable
fun OperatorCards(
    modifier: Modifier = Modifier,
    operatorCardModel: OperatorCardModel
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .padding(top = 5.sdp, bottom = 5.sdp, end = 5.sdp)
            .clip(RoundedCornerShape(12.sdp)),
        shape = RoundedCornerShape(12.sdp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(10.sdp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            CircleButton(
                imageVector = operatorCardModel.icon,
                color = MaterialTheme.colorScheme.primary,
                shape = CircleShape
            )

            Column(modifier = Modifier.padding(top = 10.sdp)) {

                Text(
                    text = operatorCardModel.amount,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.SemiBold,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = operatorCardModel.type,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }
        }
    }
}