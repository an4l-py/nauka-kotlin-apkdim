
package com.example.mojaklasa

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun InfoSection(
    title: String,
    description: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(
            text = title,
            color = Color(0xFF52769A),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = description,
            color = Color(0xFF173B65),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }
}