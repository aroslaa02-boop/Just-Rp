
package com.stormmobile.rp

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.ViewGroup
import android.widget.*

class MainActivity : Activity() {

    private val bg = Color.rgb(10, 13, 24)
    private val blue = Color.rgb(35, 105, 230)
    private val white = Color.WHITE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 32, 28, 32)
            setBackgroundColor(bg)
        }

        val scroll = ScrollView(this)
        scroll.addView(root)

        val logo = TextView(this).apply {
            text = "STORM"
            textSize = 42f
            setTextColor(blue)
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
        }
        root.addView(logo)

        val subtitle = TextView(this).apply {
            text = "MOBILE ROLEPLAY"
            textSize = 16f
            letterSpacing = 0.25f
            setTextColor(white)
            gravity = Gravity.CENTER
        }
        root.addView(subtitle)

        val status = TextView(this).apply {
            text = "Добро пожаловать в новый мир!"
            textSize = 15f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 35, 0, 25)
        }
        root.addView(status)

        val login = EditText(this).apply {
            hint = "Логин"
            setSingleLine()
            setTextColor(white)
            setHintTextColor(Color.GRAY)
            setPadding(18, 12, 18, 12)
            setBackgroundColor(Color.rgb(29, 35, 52))
        }
        root.addView(login, params())

        val password = EditText(this).apply {
            hint = "Пароль"
            setSingleLine()
            inputType = 129
            setTextColor(white)
            setHintTextColor(Color.GRAY)
            setPadding(18, 12, 18, 12)
            setBackgroundColor(Color.rgb(29, 35, 52))
        }
        root.addView(password, params())

        val server = TextView(this).apply {
            text = "СЕРВЕР: STORM ROLEPLAY"
            textSize = 14f
            setTextColor(white)
            gravity = Gravity.CENTER
            setPadding(0, 28, 0, 20)
        }
        root.addView(server)

        val play = Button(this).apply {
            text = "ИГРАТЬ"
            setTextColor(white)
            setBackgroundTintList(
                android.content.res.ColorStateList.valueOf(blue)
            )
            setOnClickListener {
                status.text =
                    "Игровой клиент ещё подключается. Скоро!"
            }
        }
        root.addView(play, params())

        val register = Button(this).apply {
            text = "РЕГИСТРАЦИЯ"
            setOnClickListener {
                status.text =
                    "Регистрация появится после подключения сервера."
            }
        }
        root.addView(register, params())

        val version = TextView(this).apply {
            text = "STORM MOBILE RP • версия 1.0"
            textSize = 11f
            setTextColor(Color.GRAY)
            gravity = Gravity.CENTER
            setPadding(0, 35, 0, 0)
        }
        root.addView(version)

        setContentView(scroll)
    }

    private fun params(): LinearLayout.LayoutParams {
        return LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).apply {
            setMargins(0, 8, 0, 8)
        }
    }
}
