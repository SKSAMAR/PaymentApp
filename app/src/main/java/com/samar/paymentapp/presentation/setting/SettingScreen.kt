package com.samar.paymentapp.presentation.setting

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apartment
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.samar.paymentapp.R
import com.samar.paymentapp.presentation.common.ScreenConfig
import com.samar.paymentapp.presentation.setting.component.LocationTypeCards
import com.samar.paymentapp.presentation.setting.component.PropertyCard
import com.samar.paymentapp.presentation.setting.component.SettingText
import com.samar.paymentapp.util.common.sdp
import com.samar.paymentapp.util.common.textSdp

@Composable
fun SettingScreen(){
    val selectedValue = remember { mutableStateOf("In-home") }
    val isSelectedItem: (String) -> Boolean = { selectedValue.value == it }
    val onChangeState: (String) -> Unit = { selectedValue.value = it }

    ScreenConfig(
        horizontalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalAlignment = Alignment.CenterVertically,
        verticalArrangement = Arrangement.SpaceBetween,
        rowContent = {
            Row(
                modifier = Modifier.padding(horizontal = 15.sdp)
            ){
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                ) {
                    Icon(
                        modifier = Modifier.size(40.sdp),
                        imageVector = Icons.Default.Settings,
                        contentDescription = "setting"
                    )
                    SettingText(modifier = Modifier
                        .padding(vertical = 2.sdp))
                    Text(
                        modifier = Modifier.padding(vertical = 2.sdp),
                        text = stringResource(id = R.string.property),
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.textSdp
                    )
                    PropertyCard()

                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier
                                .background(
                                    shape = RoundedCornerShape(12.sdp),
                                    color = MaterialTheme.colorScheme.background
                                )
                                .clip(RectangleShape)
                                .align(Alignment.End)
                        ){
                            Icon(
                                modifier = Modifier.padding(8.sdp),
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "back",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                        Text(
                            modifier = Modifier.padding(vertical = 5.sdp),
                            text = stringResource(id = R.string.type_of_issue),
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.SemiBold
                        )
                        Row {
                            LocationTypeCards(
                                modifier = Modifier.weight(1f),
                                title = "In-home",
                                description = "I have an issue in my apartment",
                                icon = Icons.Default.Home,
                                isSelectedItem = isSelectedItem,
                                onChangeState = onChangeState
                            )
                            LocationTypeCards(
                                modifier = Modifier.weight(1f),
                                title = "Communal",
                                description = "This is an issue in public space",
                                icon = Icons.Default.Apartment,
                                isSelectedItem = isSelectedItem,
                                onChangeState = onChangeState
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(.98f)
                            .padding(vertical = 10.sdp)
                            .clickable {}
                            .align(Alignment.CenterHorizontally)
                            .clip(shape = RoundedCornerShape(10.sdp))
                            .background(color = MaterialTheme.colorScheme.surface)
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.sdp),
                            text = stringResource(id = R.string.next),
                            color = MaterialTheme.colorScheme.primary,
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
        },
        columnContent = {
            Column(
                modifier = Modifier.padding(15.sdp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .background(
                                shape = RoundedCornerShape(12.sdp),
                                color = MaterialTheme.colorScheme.background
                            )
                            .clip(RectangleShape)
                            .align(Alignment.End)
                    ){
                        Icon(
                            modifier = Modifier.padding(8.sdp),
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "back",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }

                    Icon(
                        modifier = Modifier.size(50.sdp),
                        imageVector = Icons.Default.Settings,
                        contentDescription = "setting"
                    )
                    SettingText(modifier = Modifier.padding(vertical = 10.sdp))
                    Text(
                        modifier = Modifier.padding(vertical = 5.sdp),
                        text = stringResource(id = R.string.property),
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold
                    )
                    PropertyCard()
                    Text(
                        modifier = Modifier.padding(vertical = 5.sdp),
                        text = stringResource(id = R.string.type_of_issue),
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold
                    )
                    Row {
                        LocationTypeCards(
                            modifier = Modifier.weight(1f),
                            title = "In-home",
                            description = "I have an issue in my apartment",
                            icon = Icons.Default.Home,
                            isSelectedItem = isSelectedItem,
                            onChangeState = onChangeState
                        )
                        LocationTypeCards(
                            modifier = Modifier.weight(1f),
                            title = "Communal",
                            description = "This is an issue in public space",
                            icon = Icons.Default.Apartment,
                            isSelectedItem = isSelectedItem,
                            onChangeState = onChangeState
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(.93f)
                        .padding(vertical = 10.sdp)
                        .clickable {}
                        .align(Alignment.CenterHorizontally)
                        .clip(shape = RoundedCornerShape(10.sdp))
                        .background(color = MaterialTheme.colorScheme.surface)
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.sdp),
                        text = stringResource(id = R.string.next),
                        color = MaterialTheme.colorScheme.primary,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    )
}