package com.example.state

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.state.ui.theme.StateTheme


@Composable
fun ProductListScreen() {
    var currentLanguage by rememberSaveable { mutableStateOf(Language.RUSSIAN) }
    Column(
        modifier = Modifier
            .padding(50.dp)
            .background(Color.Gray)
            .wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(

            text = if (currentLanguage == Language.RUSSIAN)
                "Список продуктов" else "List of products",
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.DarkGray),
            color = Color.White,
        )
        ProductItem("Banana", currentLanguage)
        ProductItem("Eggs", currentLanguage)
        ProductItem("Chicken", currentLanguage)
        ProductItem("Curd", currentLanguage)
        ProductItem("Yogurt", currentLanguage)

        Button(onClick = {
            currentLanguage = if (
                currentLanguage == Language.RUSSIAN)
                Language.ENGLISH else Language.RUSSIAN
        }) {
            Text(
                if (currentLanguage == Language.RUSSIAN)
                    "Switch language" else "Переключить язык"
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StateTheme {
        ProductListScreen()
    }
}