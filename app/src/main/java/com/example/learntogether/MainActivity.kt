package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnText(
                        text1 = "Jetpack Compose tutorial",
                        text2 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        text3 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
                    )
                }
            }
        }
    }
}
@Composable
fun LearnText(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = text1, fontSize = 24.sp,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = text2, textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = text3, textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
        )
    }
}

@Composable
fun LearnImage(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column {
        Image(
            painter = image,
            contentDescription = "Image"
        )

        LearnText(
            text1, text2, text3
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LearnImagePreview() {
    LearnTogetherTheme {
        LearnImage(
            stringResource(R.string.jetpack_compose_text1),
            text2 = stringResource(R.string.jetpack_compose_text2),
            text3 = stringResource(R.string.text3)
        )
    }
}