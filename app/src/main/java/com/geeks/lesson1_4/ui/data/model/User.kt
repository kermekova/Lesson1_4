package com.geeks.lesson1_4.ui.data.model

import java.io.Serializable

data class User(
    val name: String,
    val email: String,
    val password: String
):Serializable
