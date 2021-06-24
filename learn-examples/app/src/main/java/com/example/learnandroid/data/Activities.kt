package com.example.learnandroid.data

import android.content.Context
import android.content.Intent
import com.example.learnandroid.samples.text.SimpleTextActivity

data class Activities(val title: String, val intent: Intent)

fun getActivitiesList(context: Context): List<Activities> {
    return listOf<Activities>(
        Activities("SimpleText", Intent(context, SimpleTextActivity::class.java))
    )
}

