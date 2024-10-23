package com.example.playactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playactivity.ui.theme.PlayActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlayActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
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

fun PlayActivity() {
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection()
        Text(text = "Kepada Yth,", modifier = Modifier.padding(16.dp))
        Text(text = "Nadila Zaskia Aulia,", modifier = Modifier.padding(start = 16.dp))
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama",
            isinya = "Maman Alkatiri"
        )
        DetailSurat(
            judul = "Alamat",
            isinya = "Kota Bandung,Jawa Barat"
        )
        DetailSurat(
            judul = "No Telp",
            isinya = "0813245632123"
        )
        DetailSurat(
            judul = "Kepentingan",
            isinya = "DetailSurat(\n" +
                    "             judul = \"Nama\",\n" +
                    "             isinya = \"Maman Alkatiri\"\n" +
                    "         )\n" +
                    " DetailSurat(\n" +
                    "             judul = \"Alamat\",\n" +
                    "             isinya = \"Kota Bandung,Jawa Barat,\"\n" +
                    " DetailSurat(\n" +
                    "             judul = \"No Telp\",\n" +
                    "             isinya = \"0813274563123\"\n" +
                    "   )"
        )


    }
}

@Composable
fun HeaderSection() {
    Box (
        modifier = Modifier.fillMaxWidth().background(color = Color.DarkGray).padding(15.dp)) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column {
                Text(text = "Daerah Istimewa Yogyakarta",
                color = Color.White
                )
                Text(
                    text = "FAX : 021-121212, Tlp : 0821111",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(id = R.drawable.logoumy),
                    contentDescription = "", modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                    )
                    Icon(imageVector = Icons.Filled.Done,
                        contentDescription = null
                    )
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul: String, isinya: String
){
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 2.dp)
        ) {
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))


        }
        
    }
}

