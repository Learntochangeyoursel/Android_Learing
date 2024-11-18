package com.example.helloworld11

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld11.ui.theme.HelloWorld11Theme

class helloworld : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //完整添加并调用button
        setContentView(R.layout.layout_halloworld)
        val myButton1: Button = findViewById(R.id.button1)  // 确保 my_button 一致
        myButton1.setOnClickListener {
            // 处理点击事件
            Toast.makeText(this, "按钮被点击了", Toast.LENGTH_SHORT).show()
        }

        val myButton2: Button = findViewById(R.id.button2)  // 确保 my_button 一致
        myButton2.setOnClickListener {
            // 处理点击事件
            Toast.makeText(this, "恭喜你猜对了", Toast.LENGTH_SHORT).show()
        }
        //myButton.setOnClickListener()
        //enableEdgeToEdge()    屏幕边缘设置
        /*setContent {
            HelloWorld11Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }*/
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
fun GreetingPreview() {
    HelloWorld11Theme {
        Greeting("Android")
    }
}