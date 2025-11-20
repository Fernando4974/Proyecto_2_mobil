package com.example.proyect_compose_2

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyect_compose_2.ui.theme.Proyect_compose_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
       App()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Proyect_compose_2Theme {
        Greeting("Android")
    }
}

@Composable
fun Home(){
    val pagina = listOf(
        "Inicio","Favoritos","Configuracion"
    )
    val listState = rememberLazyListState()

    val currentIndex by remember{
        derivedStateOf { listState.firstVisibleItemIndex

      }
    }
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
    ) {
        LazyRow(
            state = listState,
            modifier = Modifier.fillMaxWidth()
        ) { }
    }

}