package com.example.mojaklasa

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MojaKlasaApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEAF1FA)
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(20.dp))
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "MOJA KLASA",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF173B65)
                )

                InfoSection(
                    title = "SZKOŁA",
                    description = "Zespół Szkół"
                )

                InfoSection(
                    title = "MOJA KLASA",
                    description = "2A"
                )

                InfoSection(
                    title = "KIERUNEK KSZTAŁCENIA",
                    description = "Technik informatyk"
                )

                Text(
                    text = "Poznaję programowanie, komputery " +
                            "i nowoczesne technologie.",
                    fontSize = 15.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MojaKlasaPreview() {
    MojaKlasaApp()
}