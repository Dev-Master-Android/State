package com.example.state

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProductItem(productName: String, language: Language) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 1.dp)
            .fillMaxWidth()
            .background(Color.White,
                shape = androidx.compose.foundation.shape.RoundedCornerShape(100.dp))
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .padding(2.dp),
            text = when (language) {
                Language.RUSSIAN -> when (productName) {
                    "Banana" -> "Банан"
                    "Eggs" -> "Яйца"
                    "Chicken" -> "Курица"
                    "Curd" -> "Творог"
                    "Yogurt" -> "Йогурт"
                    else -> productName
                }

                Language.ENGLISH -> productName
            },
            )
    }

}