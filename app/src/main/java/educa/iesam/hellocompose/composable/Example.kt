package educa.iesam.hellocompose.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.dp


@Composable
fun Example(user: String){

    Text("Hello: $user!", modifier = Modifier.background(Color.Cyan).padding(top = 70.dp).clickable{})
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_8_PRO
)
@Composable
fun example(){
    Example("Karamon")

}