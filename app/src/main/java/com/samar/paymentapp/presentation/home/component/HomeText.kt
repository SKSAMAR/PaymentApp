package com.samar.paymentapp.presentation.home.component

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

@Composable
fun HomeText(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ){
        Text(
            text = stringResource(id = R.string.save_with_us),
            style = MaterialTheme.typography.bodyMedium,
        )

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.dont_be_afraid),
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start
        )

        Text(
            text = stringResource(id = R.string.help_with_bills),
            style = MaterialTheme.typography.bodyLarge
        )

    }
}