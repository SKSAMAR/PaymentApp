package com.samar.paymentapp.presentation.setting.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.samar.paymentapp.R
import com.samar.paymentapp.util.common.textSdp

@Composable
fun SettingText(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceEvenly
    ){

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.report_issue),
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            fontSize = 24.textSdp
        )

        Text(
            text = stringResource(id = R.string.sorry_to_hear),
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 14.textSdp
        )

    }
}