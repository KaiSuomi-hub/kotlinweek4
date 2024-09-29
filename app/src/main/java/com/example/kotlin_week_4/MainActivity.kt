package com.example.kotlin_week_4

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlin_week_4.ui.theme.Kotlinweek4Theme
import com.example.kotlin_week_4.ui.theme.Shapes
import com.example.kotlin_week_4.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlinweek4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    MyApp()
                }
            }
        }
    }
}



@Composable
fun MyApp() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    Column {
        var verticalArrangement = Arrangement.spacedBy(16.dp)
        Text(
            text="My title",
            style = MaterialTheme.typography.headlineSmall,
            modifier = appModifier)
        OutlinedTextField(
            value = "",
            onValueChange = {/*TODO*/},
            modifier = appModifier
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = appModifier,
            
        ) {
            Text("Submit")
        }
    }
}

@Preview
@Composable
fun Surface() {
    Kotlinweek4Theme {
        MyApp()

}}