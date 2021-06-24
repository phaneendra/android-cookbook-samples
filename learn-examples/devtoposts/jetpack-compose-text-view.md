---
title: Jetpack Compose Text View
published: false
description: Sample to learn how to display a simple text using compose
tags: jetpack,compose,android
---

This is part of a collection of samples for learning android development,

In Google IO '19, Google launched Jetpack Compose to create declarative UI. So, basically, declarative UI means to create UI by specifying a specific set of UI elements we need and to structure it some way.

In this sample, we are going to learn how to display a simple text using compose.

|Example|Preview|
|-------|-------|
|[How do I display text on the screen using Jetpack Compose?](../app/src/main/java/com/example/learnandroid/samples/text/SimpleTextActivity.kt)|<img src ="./assets/simpletextview.png" width=214 height=400> |

## Why we should use Jetpack Compose?
We should use Jetpack compose because using it we have to write less code compared to what we write today. For example, we are not writing XML files explicitly now. Also, using compose we can write any type of UI just by using Kotlin.

NOTE: To use Jetpack Compose, you need to have the latest Canary version of Android Studio 4.2. So, you can move over to the [Android Studio Preview](https://developer.android.com/studio/preview/) page and download the latest Canary version and then make an Empty Compose Activity.
Please get **Android Studio Arctic Fox 2020.3.1 Canary 4** or above to build this project.


## Composable Function
In Jetpack Compose, Composable functions are used to define all the UI of your app programmatically. So, you need not use any XML files for the layout of the app. All you need to make a composable function is just by using the @Composable annotation to the function name. The basic syntax of a Composable function is:

```
@Composable
fun AnyUiComponent() {
    // Code for UI element
}
```
Now, you know what Composable Functions are and how to make a composable function by using the @Composable annotation. Let's move on to the example of Text.

## Displaying a Simple Text

To display a text, we use Text Composable and inside that, we pass the string that we want to display. For example,

```
@Composable
fun SimpleText(displayText: String) {
    Text(text = displayText)
}
```
Here, SimpleText is a Composable function and inside that function, we are using Text and passing displayText into it.

Now, you can call this SimpleText function from the setContent block of the onCreate method of the activity.
```
class SimpleTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SimpleText(getString(R.string.text_message_simpletext))
            }
        }
    }
}
```
Here, we are using a Column that is used to display some content vertically and inside that Column, we are calling the SimpleText Composable function.