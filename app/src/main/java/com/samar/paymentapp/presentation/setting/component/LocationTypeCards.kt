package com.samar.paymentapp.presentation.setting.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckBoxOutlineBlank
import androidx.compose.material.icons.filled.HomeWork
import androidx.compose.material.icons.filled.TabUnselected
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samar.paymentapp.domain.model.OperatorCardModel
import com.samar.paymentapp.presentation.common.CircleButton
import com.samar.paymentapp.util.common.sdp
import com.samar.paymentapp.util.common.textSdp

@Composable
fun LocationTypeCards(
    modifier: Modifier = Modifier,
    icon: ImageVector = Icons.Default.HomeWork,
    title: String = "In-home",
    description: String = "I have an issue in my apartment",
    isSelectedItem: (String) -> Boolean,
    onChangeState: (String) -> Unit
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(.8f)
            .padding(top = 5.sdp, bottom = 5.sdp, end = 5.sdp)
            .clip(RoundedCornerShape(12.sdp))
            .selectable(
                selected = isSelectedItem(title),
                onClick = { onChangeState(title) },
                role = Role.RadioButton
            ),
        border = BorderStroke(
            width = 1.5.dp,
            color = if (isSelectedItem(title)) MaterialTheme.colorScheme.onSecondaryContainer else MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(12.sdp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.sdp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CircleButton(
                    imageVector = icon,
                    color = MaterialTheme.colorScheme.primary,
                    shape = CircleShape
                )

                Icon(
                    imageVector = if(isSelectedItem(title)) Icons.Default.Check else Icons.Default.CheckBoxOutlineBlank,
                    contentDescription = "selected"
                )

            }
            Column(modifier = Modifier.padding(top = 10.sdp)) {

                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.SemiBold,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 16.textSdp
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray,
                    fontSize = 12.textSdp
                )
            }
        }
    }
}