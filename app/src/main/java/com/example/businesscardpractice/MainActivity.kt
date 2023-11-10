package com.example.businesscardpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardpractice.ui.theme.BusinessCardPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column (
        modifier = Modifier
            .background(Color(0xFFF8C3CD))
            .fillMaxSize()
            .padding(top = 200.dp, bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        TitleAndIcon(modifier = Modifier.weight(1f))
        InfoContext(modifier = Modifier.weight(1f))
    }
}

@Composable
fun TitleAndIcon(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center, //子元件集中於中間
        horizontalAlignment = Alignment.CenterHorizontally //子元件水平置中

    ){
        Icon(
            painter = painterResource(id = R.drawable.baseline_eco_24), //圖片
            contentDescription = null, //無障礙資訊
            tint = Color(0xFFF596AA), //圖標顏色
            modifier = modifier
//                .height(40.dp)
                .width(170.dp)
        )
        Text(
            text = "小油",
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF64363C),
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
        Text(
            text = "小可愛",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF86473F),
            fontWeight = FontWeight.Normal,
        )
    }
}

@Composable
fun InfoContext(modifier: Modifier){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                // .background(Color.Yellow)
                .weight(1f)
                .padding(start = 70.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            IconAndText(Modifier.weight(1f))
            Spacer(Modifier)
            IconAndText(Modifier.weight(1f))
            Spacer(Modifier)
            IconAndText(Modifier.weight(1f))
        }
    }
}

@Composable
fun IconAndText(modifier: Modifier) {
    Row(
        modifier = Modifier.padding(10.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_edit_24), //圖片
            contentDescription = null, //無障礙資訊
            tint = Color(0xFFF596AA), //圖標顏色
            modifier = Modifier
                .padding(end = 30.dp)
                .height(30.dp)
                .width(30.dp)

        )
        Text("test")
    }
}



@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardPracticeTheme {
        BusinessCardApp()
        //TaskCompletedScreen()
    }
}