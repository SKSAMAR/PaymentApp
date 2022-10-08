package com.samar.paymentapp.presentation.dashboard

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                Column(
                    modifier = Modifier
                        .padding(8.sdp)
                ) {
                    DashboardTop()
                    Row {
                        LazyColumn(
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 5.sdp)
                        ) {
                            item {
                                BalanceCard(modifier = Modifier.padding(vertical = 7.sdp))
                            }
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 5.sdp, bottom = 4.sdp),
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

                            item {
                                for (i in 1..3) {
                                    MessageCard()
                                }
                            }
                        }
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(2),
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 5.sdp)
                        ) {
                            items(operatorList) { operator ->
                                OperatorCards(operatorCardModel = operator)
                            }
                        }
                    }
                }
            },
            columnContent = {
                Box(
                    modifier = Modifier
                        .padding(8.sdp)
                ) {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                    ) {
                        item(span = { GridItemSpan(2) }) { DashboardTop() }
                        item(span = { GridItemSpan(2) }) {
                            BalanceCard(
                                modifier = Modifier.padding(
                                    vertical = 15.sdp
                                )
                            )
                        }
                        items(operatorList) { operator ->
                            OperatorCards(operatorCardModel = operator)
                        }

                        item(span = { GridItemSpan(2) }) {
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
                        item(span = { GridItemSpan(2) }) {
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