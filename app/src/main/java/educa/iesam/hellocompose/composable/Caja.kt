package educa.iesam.hellocompose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Caja(modifier: Modifier = Modifier){
    Box(modifier = modifier.fillMaxSize().background(Color.Yellow), contentAlignment = Alignment.TopCenter){
        Box(modifier = Modifier.background(Color.Cyan).fillMaxSize()){
            Column(){
                Text("Hola Mundo 1", modifier = Modifier.background(Color.Red).weight(1F))
                Text("Hola Mundo 2",modifier = Modifier.background(Color.Blue).weight(1F))
                Text("Hola Mundo 3",modifier = Modifier.background(Color.Yellow).weight(1F))
                Text("Hola Mundo 4",modifier = Modifier.background(Color.Green).weight(1F))
            }
        }
    }
}