package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
    }
}

val contacts = listOf(

    Contact(
        name = "Carlos Silva",
        phone = "(11) 98765-4321",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Ana Oliveira",
        phone = "(21) 99876-5432",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Lucas Pereira",
        phone = "31) 98877-6543",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Juliana Costa",
        phone = "(41) 97788-7654",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Roberto Santos",
        phone = "(51) 96699-8765",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Fernanda Lima",
        phone = "(61) 95555-1234",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Pedro Rocha",
        phone = "(71) 94444-5678",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Gustavo Almeida",
        phone = "(91) 92222-8765",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Mariana Souza",
        phone = "81) 93333-4321",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Isabela Martins",
        phone = "(51) 91111-2345",
        icon = R.drawable.sample10
    )

)