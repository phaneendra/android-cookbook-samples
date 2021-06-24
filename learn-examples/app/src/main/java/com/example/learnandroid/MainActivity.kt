package com.example.learnandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnandroid.data.getActivitiesList
import com.example.learnandroid.ui.theme.LearnAndroidTheme
import com.example.learnandroid.samples.text.SimpleTextActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnAndroidTheme {
                val context = LocalContext.current
                val activityList = getActivitiesList(context = context)
                LazyColumn {
                    items(activityList) { activity ->
                        ComponentItem(
                            context = context,
                            intent = activity.intent,
                            title = activity.title
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ComponentItem(context: Context, intent: Intent, title: String) {
    Button(
        onClick = {
            context.startActivity(intent)
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            text = title,
            textAlign = TextAlign.Center
        )
    }
}