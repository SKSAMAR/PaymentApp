package com.samar.paymentapp.presentation.home

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.samar.paymentapp.R
import com.samar.paymentapp.presentation.common.ScreenConfig
import com.samar.paymentapp.presentation.dashboard.DashboardActivity
import com.samar.paymentapp.presentation.home.component.HomeImage
import com.samar.paymentapp.presentation.home.component.HomeText
import com.samar.paymentapp.util.common.sdp

@Preview(showBackground = true)
@Composable
fun HomeScreen(context: Context = LocalContext.current){

    ScreenConfig(
        horizontalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalAlignment = Alignment.CenterVertically,
        verticalArrangement = Arrangement.SpaceBetween,
        rowContent = {
            Box(modifier = Modifier
                .weight(1f)
                .padding(5.sdp)
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            shape = RoundedCornerShape(12.sdp),
                            color = MaterialTheme.colorScheme.background
                        )
                        .clip(RectangleShape)
                ){
                    Icon(
                        modifier = Modifier.padding(8.sdp),
                        imageVector = Icons.Default.Home,
                        contentDescription = "home",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
                HomeImage()
            }
            Row(modifier = Modifier.weight(1f)) {
                Column {
                    HomeText(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(15.sdp)
                            .weight(1f)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(.93f)
                            .padding(vertical = 10.sdp)
                            .clickable {
                                context.startActivity(Intent(context, DashboardActivity::class.java))
                            }
                            .align(Alignment.CenterHorizontally)
                            .clip(shape = RoundedCornerShape(10.sdp))
                            .background(color = MaterialTheme.colorScheme.surface)
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.sdp),
                            text = stringResource(id = R.string.lets_start),
                            color = MaterialTheme.colorScheme.primary,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        },
        columnContent = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.sdp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        modifier = Modifier
                            .background(
                                shape = RoundedCornerShape(12.sdp),
                                color = MaterialTheme.colorScheme.background
                            )
                            .clip(RectangleShape)
                    ){
                        Icon(
                            modifier = Modifier.padding(8.sdp),
                            imageVector = Icons.Default.Home,
                            contentDescription = "home",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }
                Column {
                    HomeImage()
                    HomeText(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(15.sdp)
                            .weight(1f)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(.93f)
                            .padding(vertical = 10.sdp)
                            .clickable {
                                context.startActivity(Intent(context, DashboardActivity::class.java))
                            }
                            .align(Alignment.CenterHorizontally)
                            .clip(shape = RoundedCornerShape(10.sdp))
                            .background(color = MaterialTheme.colorScheme.surface)
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.sdp),
                            text = stringResource(id = R.string.lets_start),
                            color = MaterialTheme.colorScheme.primary,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    )
}