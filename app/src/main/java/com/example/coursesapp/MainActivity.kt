package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursesapp.data.Topic
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesAppTheme {

            }
        }
    }
}

@Composable
fun CoursesAppLayout(
    topic: Topic,
    modifier: Modifier = Modifier
) {
    Row {
        Column {
            
        }
    }
}

@Preview
@Composable
fun PreviewTopic() {
    TopicLayout(Topic(R.string.architecture, 21, R.drawable.architecture))
}

@Composable
fun TopicLayout(
    topic : Topic,
    modifier: Modifier = Modifier
) {
    val paddingSize = 16.dp
    Card(
        modifier = modifier
    ) {
        Row {
            Image(
                painter = painterResource(id = topic.icon),
                contentDescription = stringResource(id = topic.name),
                modifier = Modifier
                    .size(68.dp)
            )
            Column(
                modifier = Modifier
                    .padding(
                        start = paddingSize,
                        top = paddingSize,
                        end = paddingSize
                    )
            ) {
                Text(text = stringResource(id = topic.name))
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null)
                    Text(
                        text = topic.coursesCount.toString(),
                        modifier = Modifier
                            .padding(start = 8.dp)
                    )
                }
            }
        }
    }
}
