package com.example.layoutsastudio

import android.media.Image
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutsastudio.ui.theme.LayoutsAStudioTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Switch
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color // Correct import for Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Preview(
    showBackground = true
)

@Composable
fun Layout01() {
    Box (

        modifier = Modifier
            .background(Color.White)
            .padding(60.dp)
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .padding(60.dp)
        ){
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.DarkGray)
                    .fillMaxWidth()){ Text("Calculadora", color = Color.White, fontSize = 30.sp,
                        modifier = Modifier
                            .padding(15.dp)
            ) }
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.DarkGray)
                    .fillMaxWidth()){ Text("Calculadora", color = Color.White, fontSize = 30.sp,
                modifier = Modifier
                    .padding(15.dp)
            ) }
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.DarkGray)
                    .fillMaxWidth()){ Text("Calculadora", color = Color.White, fontSize = 30.sp,
                modifier = Modifier
                    .padding(15.dp)
            ) }
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.DarkGray)
                    .fillMaxWidth()){ Text("Calculadora", color = Color.White, fontSize = 30.sp,
                modifier = Modifier
                    .padding(15.dp)
            ) }
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.DarkGray)
                    .fillMaxWidth()){ Text("Calculadora", color = Color.White, fontSize = 30.sp,
                modifier = Modifier
                    .padding(15.dp)
            ) }
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.DarkGray)
                    .fillMaxWidth()){ Text("Calculadora", color = Color.White, fontSize = 30.sp,
                modifier = Modifier
                    .padding(15.dp)
            ) }
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.DarkGray)
                    .fillMaxWidth()){ Text("Calculadora", color = Color.White, fontSize = 30.sp,
                modifier = Modifier
                    .padding(15.dp)
            ) }
        }
    }
}

@Preview(
    showBackground = true
)

@Composable
fun Layout02() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9370DB))
    ) {
        Row(modifier = Modifier
            .background(Color.White)
            .fillMaxSize()) {
            Column (modifier = Modifier
                .background(Color.DarkGray)
                .padding(10.dp)
                .fillMaxSize()
                .weight(2f)){
                Row (modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .weight(1f)){
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp)
                        .background(Color.Red)){
                        Text(text = "1", fontSize = 60.sp)
                    }
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(10.dp)
                    .background(Color.Red)){
                    Text(text = "2", fontSize = 60.sp)
                    }
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(10.dp)
                    .background(Color.Red)){
                    Text(text = "3", fontSize = 60.sp)
                    }
                }
                Row (horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .weight(1f)){
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp)
                        .background(Color.Red)){
                        Text(text = "3", fontSize = 60.sp)
                    }
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp)
                        .background(Color.Red)){
                        Text(text = "4", fontSize = 60.sp)
                    }
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp)
                        .background(Color.Red)){
                        Text(text = "5", fontSize = 60.sp)
                    }
                }
                Row (modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .weight(1f)){
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp)
                        .background(Color.Red)){
                        Text(text = "6", fontSize = 60.sp)
                    }
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp)
                        .background(Color.Red)){
                        Text(text = "7", fontSize = 60.sp)
                    }
                    Box(contentAlignment = Alignment.Center, modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(10.dp)
                        .background(Color.Red)){
                        Text(text = "8", fontSize = 60.sp)
                    }
                }
                Row (modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp)
                            .background(Color.Red)
                    ) {
                        Text(text = "0", fontSize = 60.sp)
                    }
                }
            }
            Column (modifier = Modifier
                .background(Color.DarkGray)
                .padding(10.dp)
                .fillMaxSize()
                .weight(1f)){
                Row (modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp)
                            .background(Color.Red)
                    ) {
                        Text(text = "+", fontSize = 60.sp)
                    }
                }
                Row (modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp)
                            .background(Color.Red)
                    ) {
                        Text(text = "C", fontSize = 60.sp)
                    }
                }
                Row (modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(10.dp)
                            .background(Color.Red)
                    ) {
                        Text(text = "=", fontSize = 60.sp)
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Layout03(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)){
        Row(modifier = Modifier
            .padding(30.dp)
            .fillMaxSize()
            .weight(1f)
            .background(Color.White)) {
            Image(
                painter = painterResource(id = R.drawable.mario), // Replace with your drawable image name
                contentDescription = "Image in First Row",
                contentScale = ContentScale.Crop, // Adjust this to fit the image scale type
                modifier = Modifier
                    .fillMaxSize() // Make the image fill the Row space
            )
        }
        Row(modifier = Modifier
            .padding(30.dp)
            .fillMaxSize()
            .weight(1f)
            .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam nec gravida elit, eu condimentum neque. Aliquam blandit, nisi congue blandit sagittis, turpis erat convallis mauris, ac efficitur libero metus nec ante. Phasellus vehicula, lectus in suscipit lobortis, nisi purus gravida enim, eget lobortis ipsum sem et felis. Ut sem enim, laoreet nec nisi vitae, dapibus elementum purus. Nunc efficitur nisi metus, at efficitur nisi mollis vulputate. Cras et ultricies elit. Mauris mauris sapien, mattis at elit sed, faucibus tincidunt nisi. Aenean vehicula enim nunc, vitae ultricies ante auctor nec. Aliquam malesuada diam non dolor sodales, eget eleifend turpis dictum.",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                color = Color.Blue,
                modifier = Modifier
                    .fillMaxSize()

            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Layout04(){
    var checked by remember { mutableStateOf(true) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green)) {
        Row(modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
            .fillMaxWidth())
        {
            TextField(value = "Nom (*)",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            )
        }
        Row(modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
            .fillMaxWidth())
        {
            TextField(value = "Cognom (*)",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) }
        Row(modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
            .fillMaxWidth())
        {
            TextField(value = "Correu Electronic (*)",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            )
        }
        Row(modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
            .fillMaxWidth()
            .weight(1f))

        {
            TextField(value = "Missatge (*)",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
            .fillMaxWidth())
        {
            Column(modifier = Modifier
                .padding(15.dp)) {
                Switch(
                checked = checked,
                onCheckedChange = {checked = it}
            )}
            Column(verticalArrangement = Arrangement.Center) {
                Text(text = "Subscriume per correu",
                    fontSize = 22.sp
                )
            }
        }
        Row(modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
            .fillMaxWidth())
        {
            TextField(value = "Url del servidor (*)",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) }
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly)
        {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Accepta",
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(20.dp)
                )
            }

            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Rebutja",
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(20.dp)
                )
            }
        }
    }
}
@Preview(
    showBackground = true
)
@Composable
fun Layout05(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .padding(10.dp)
                    .fillMaxSize()

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text("Paraula", color = Color.White, fontSize = 16.sp)
                }
                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                ) {
                    Text(
                        "Paraula (max 20 lletres)", fontSize = 16.sp,
                        modifier = Modifier
                            .padding(10.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text("Traducció", color = Color.White, fontSize = 16.sp)
                }
                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                ) {
                    Text(
                        "Paraula (max 20 lletres)", fontSize = 16.sp,
                        modifier = Modifier
                            .padding(10.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp)
                    .fillMaxSize()
                    .background(Color.LightGray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    Text("Esborra", textAlign = TextAlign.Center, fontSize = 28.sp)
                }
            }
        }
        Row(
            modifier = Modifier
                .weight(5f)
                .padding(10.dp)
                .background(Color.LightGray)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .verticalScroll(rememberScrollState())

            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text("Afegeix - Edita - Esborra")

                }

                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                ) { Text("Blanc", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Red)
                ) { Text("Vermell", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                ) { Text("DarkGray", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.LightGray)
                ) { Text("LightGray", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Green)
                ) { Text("Green", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Black)
                ) { Text("Black", fontSize = 40.sp, color = Color.White) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Cyan)
                ) { Text("Cyan", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Gray)
                ) { Text("Gray", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Magenta)
                ) { Text("Magenta", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Yellow)
                ) { Text("Yellow", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.White)
                ) { Text("Blanc", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Red)
                ) { Text("Vermell", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                ) { Text("DarkGray", fontSize = 40.sp) }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.LightGray)
                ) { Text("LightGray", fontSize = 40.sp) }
            }
        }
    }
}

