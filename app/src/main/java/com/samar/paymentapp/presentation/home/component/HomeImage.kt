package com.samar.paymentapp.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import com.samar.paymentapp.R
import com.samar.paymentapp.util.common.sdp

@Composable
fun HomeImage(
    modifier: Modifier = Modifier
){
    Image(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.2f)
            .clip(RectangleShape)
            .padding(top = 10.sdp),
        painter = painterResource(id = R.drawable.home_background),
        contentDescription = "background Image"
    )
}