package com.samar.paymentapp.presentation.dashboard

import android.annotation.SuppressLint
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.samar.paymentapp.R
import com.samar.paymentapp.domain.model.operatorList
import com.samar.paymentapp.presentation.common.ScreenConfig
import com.samar.paymentapp.presentation.dashboard.component.BalanceCard
import com.samar.paymentapp.presentation.dashboard.component.DashboardTop
import com.samar.paymentapp.presentation.dashboard.component.MessageCard
import com.samar.paymentapp.presentation.dashboard.component.OperatorCards
import com.samar.paymentapp.util.common.sdp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun DashboardScreen() {
    var spanCount by remember {
        mutableStateOf(2)
    }
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
        ScreenConfig(
            horizontalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalAlignment = Alignment.CenterVertically,
            verticalArrangement = Arrangement.SpaceBetween,
            rowContent = {
                spanCount = 4
                Box(
                    modifier = Modifier
                        .padding(8.sdp)
                ) {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(spanCount),
                    ) {
                        item(span = { GridItemSpan(spanCount) }) { DashboardTop() }
                        item(span = { GridItemSpan(spanCount) }) { BalanceCard(modifier = Modifier.padding(vertical = 15.sdp)) }
                        items(operatorList) { operator ->
                            OperatorCards(operatorCardModel = operator)
                        }

                        item(span = { GridItemSpan(spanCount) }) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 15.sdp, bottom = 8.sdp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = stringResource(id = R.string.messages),
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.SemiBold
                                )
                                Text(
                                    text = stringResource(id = R.string.see_all),
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                        item(span = { GridItemSpan(spanCount) }) {
                            Column {
                                for (i in 1..3) {
                                    MessageCard()
                                }
                            }
                        }
                    }
                }
            },
            columnContent = {
                spanCount = 2
                Box(
                    modifier = Modifier
                        .padding(8.sdp)
                ) {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(spanCount),
                    ) {
                        item(span = { GridItemSpan(spanCount) }) { DashboardTop() }
                        item(span = { GridItemSpan(spanCount) }) { BalanceCard(modifier = Modifier.padding(vertical = 15.sdp)) }
                        items(operatorList) { operator ->
                            OperatorCards(operatorCardModel = operator)
                        }

                        item(span = { GridItemSpan(spanCount) }) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 15.sdp, bottom = 8.sdp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = stringResource(id = R.string.messages),
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.SemiBold
                                )
                                Text(
                                    text = stringResource(id = R.string.see_all),
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                        item(span = { GridItemSpan(spanCount) }) {
                            Column {
                                for (i in 1..3) {
                                    MessageCard()
                                }
                            }
                        }
                    }
                }
            }
        )
    }
}