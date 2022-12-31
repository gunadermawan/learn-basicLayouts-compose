package com.gunder.composelayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.composelayouts.ui.theme.ComposeLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Card("Guna Dermawan")
                }
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable(onClick = {}),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.ic_person),
                contentDescription = "person avatar",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .border(
                        2.dp, Color.Green, CircleShape
                    )
                    .size(
                        60.dp
                    )
            )
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "check circle",
                tint = Color.Green,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .offset(x = 8.dp, y = 30.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = "Guna Dermawan", fontWeight = FontWeight.Bold)
            Text(text = "Online ")
        }
    }
}