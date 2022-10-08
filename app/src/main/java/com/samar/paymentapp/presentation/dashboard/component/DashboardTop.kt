package com.samar.paymentapp.presentation.dashboard.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.samar.paymentapp.R
import com.samar.paymentapp.util.common.sdp

@Preview(showBackground = true)
@Composable
fun DashboardTop(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = stringResource(id = R.string.welcome_back),
                color = Color.Gray
            )
            Text(
                text = "Sk Samar",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.SemiBold
            )
        }
        Image(
            modifier = Modifier
                .size(40.sdp)
                .clip(CircleShape)
                .aspectRatio(1f),
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "profile_picture",
            contentScale = ContentScale.Crop
        )
    }
}