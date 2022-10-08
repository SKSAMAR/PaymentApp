package com.samar.paymentapp.presentation.dashboard.component

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.samar.paymentapp.R
import com.samar.paymentapp.presentation.dashboard.DashboardActivity
import com.samar.paymentapp.util.common.sdp

@Preview(showBackground = true)
@Composable
fun BalanceCard(
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.sdp),
        shape = RoundedCornerShape(18.sdp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.inverseSurface)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.sdp, bottom = 6.sdp, start = 15.sdp, end = 15.sdp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "August",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyMedium.fontSize
                    )
                )

                Text(
                    text = "Due in 5 Days",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyMedium.fontSize
                    )
                )
            }
            
            Text(
                modifier = Modifier.padding(vertical = 10.sdp),
                text = "$431.90",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.SemiBold,
                overflow = TextOverflow.Ellipsis
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 10.sdp)
                    .clip(shape = RoundedCornerShape(10.sdp))
                    .background(color = MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.sdp),
                    text = stringResource(id = R.string.pay_now),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}
