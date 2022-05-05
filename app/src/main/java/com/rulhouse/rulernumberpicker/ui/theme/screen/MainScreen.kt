package com.rulhouse.rulernumberpicker.ui.theme.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rulhouse.rulernumberpicker.ui.theme.methods.ScreenMethods

@Preview
@Composable
fun MainScreen(

) {
    val context = LocalContext.current

    val width = remember { mutableStateOf(1) }
    val height = remember { mutableStateOf(1) }

    val list = mutableListOf<Int>()
    for (i in 1 until 20) {
        list.add(i)
    }
    Column(
        modifier = Modifier
            .height(50.dp)
//            .wrapContentSize()
//            .onGloballyPositioned { layoutCoordinates ->
//                width.value = layoutCoordinates.size.width
//                height.value = layoutCoordinates.size.height
//                Log.d("TestSize", "width = ${width.value}")
//                Log.d("TestSize", "height = ${height.value}")
//            }
    ) {
        list.forEach {
            Text(
                modifier = Modifier
                    .background(Color.Red)
                    .onGloballyPositioned { layoutCoordinates ->
                        width.value = layoutCoordinates.size.width
                        height.value = layoutCoordinates.size.height
                        Log.d("TestSize", "width = ${width.value}")
                        Log.d("TestSize", "height = ${height.value}")
                    },
                text = it.toString(),
                textAlign = TextAlign.Center
            )
        }
    }
}