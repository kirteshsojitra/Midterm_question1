package com.example.Mid_term_question1
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1 = findViewById<EditText>(R.id.editTextNumber1)
        val edit2 = findViewById<EditText>(R.id.editTextNumber2)
        val Add = findViewById<Button>(R.id.buttonAdd)
        val Subtract = findViewById<Button>(R.id.buttonSubtract)
        val Multiply = findViewById<Button>(R.id.buttonMultiply)
        val Divide = findViewById<Button>(R.id.buttonDivide)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        Add.setOnClickListener {
            val number1 = edit1.text.toString().toDoubleOrNull() ?: 0.0
            val number2 = edit2.text.toString().toDoubleOrNull() ?: 0.0
            val result = number1 + number2
            textViewResult.text = "Addition of two numbers: $result"
        }

        Subtract.setOnClickListener {
            val number1 = edit1.text.toString().toDoubleOrNull() ?: 0.0
            val number2 = edit2.text.toString().toDoubleOrNull() ?: 0.0
            val result = number1 - number2
            textViewResult.text = "subtraction of two numbers: $result"
        }

        Multiply.setOnClickListener {
            val number1 = edit1.text.toString().toDoubleOrNull() ?: 0.0
            val number2 = edit2.text.toString().toDoubleOrNull() ?: 0.0
            val result = number1 * number2
            textViewResult.text = "Multiplication of two numbers: $result"
        }

        Divide.setOnClickListener {
            val number1 = edit1.text.toString().toDoubleOrNull() ?: 0.0
            val number2 = edit2.text.toString().toDoubleOrNull() ?: 0.0
            val result = if (number2 != 0.0) {
                number1 / number2
            } else {
                "Cannot divide by zero"
            }
            textViewResult.text = "Division of two numbers: $result"
        }
    }
}