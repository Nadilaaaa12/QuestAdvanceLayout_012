package com.example.playactivity

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column(modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Kepada Yth,",
            modifier = Modifier.padding(16.dp)
        )
        Text(text = "Nadila Zaskia Aulia",
            modifier = Modifier.padding(start = 16.dp)
        )

        Spacer(modifier = Modifier.size(16.dp))

        DetailMassage(
            judul = "Nama",
            isinya = "Rendi"
        )
        DetailMassage(
            judul = "email",
            isinya = "rendi@gmail.com"
        )
        DetailMassage(
            judul = "NoTelp",
            isinya = "0821983425931"
        )
        DetailMassage(
            judul = "Keterangan",
            isinya = "Hay Suami"
        )
    }
}

@Composable
fun HeaderSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Black)
        .padding(15.dp)
    ){
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
            Column {
                Text(text = "Daerah Khusus Barca",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "FAX: 021-1212121, Tlp:082133438383",
                    color = Color.White
                )
            }
            Box (
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(id = R.drawable.logoumy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null,
                )
            }
        }
    }
}

@Composable
fun DetailMassage(
    judul: String, isinya: String
){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
        ) {
            Text(text = judul,
                modifier = Modifier.weight(0.8f)
            )
            Text(text = ":",
                Modifier.weight(0.2f)
            )
            Text(text = isinya,
                Modifier.weight(2f)
            )
        }
    }
}