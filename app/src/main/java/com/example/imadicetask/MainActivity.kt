package com.example.imadicetask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity()
{

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editAge = findViewById<EditText>(R.id.editTextText)
        val nameView = findViewById<TextView>(R.id.textViewage)
        val mainButton = findViewById<Button>(R.id.nextButton)
        val returnButton = findViewById<Button>(R.id.returnButton)
        val enterAge = findViewById<TextView>(R.id.enterAgeView)
        val Napoleon = findViewById<ImageButton>(R.id.Napoleon)
        val Washington = findViewById<ImageButton>(R.id.Washington)
        val Kennedy = findViewById<ImageButton>(R.id.Kennedy)
        val Isaac = findViewById<ImageButton>(R.id.Isaac)
        val Ienstein = findViewById<ImageButton>(R.id.Ienstein)
        val KingTutImage = findViewById<ImageButton>(R.id.KingTut)
        val Cleopatra = findViewById<ImageButton>(R.id.Cleopatra)
        val Elizabeth = findViewById<ImageButton>(R.id.Elizabeth)
        val Clancy = findViewById<ImageButton>(R.id.Clancy)
        val Lincoln = findViewById<ImageButton>(R.id.Abraham)
        val NapDdescr = findViewById<TextView>(R.id.NapDdescr)
        val WasDdescr = findViewById<TextView>(R.id.WasDdescr)
        val KenDdescr = findViewById<TextView>(R.id.KenDdescr)
        val NewtDdescr = findViewById<TextView>(R.id.NewtDdescr)
        val IenDdescr = findViewById<TextView>(R.id.IenDdescr)
        val TutDdescr = findViewById<TextView>(R.id.tutDdescr)
        val CleoDdescr = findViewById<TextView>(R.id.CleoDdescr)
        val ElizDdescr = findViewById<TextView>(R.id.ElizDdescr)
        val TomDdesrc = findViewById<TextView>(R.id.TomDdescr)
        val LinDdescr = findViewById<TextView>(R.id.LinDdescr)

        //Images all set invisible to prevent clutter on screen.
        nameView.isVisible = false
        returnButton.isVisible = false
        Napoleon.isVisible = false
        Washington.isVisible = false
        Kennedy.isVisible = false
        Isaac.isVisible = false
        Ienstein.isVisible = false
        KingTutImage.isVisible = false
        Cleopatra.isVisible = false
        Elizabeth.isVisible = false
        Clancy.isVisible = false
        Lincoln.isVisible = false

        //Edittext fields fields all set to invisible to avoid clutter on screen.
        NapDdescr.isVisible= false
        WasDdescr.isVisible = false
        KenDdescr.isVisible = false
        NewtDdescr.isVisible = false
        IenDdescr.isVisible = false
        TutDdescr.isVisible = false
        CleoDdescr.isVisible = false
        ElizDdescr.isVisible = false
        TomDdesrc.isVisible = false
        LinDdescr.isVisible = false

        mainButton.setOnClickListener()
        {
            try
            {
                val age = editAge.text.toString().toInt()
                when (age)
                {
                    51 ->
                    {
                        nameView.text = "Napoleon Bonaparte"

                        Napoleon.isVisible = true
                        NapDdescr.isVisible = true
                    }
                    67 ->
                    {
                        nameView.text = "George Washington"

                        Washington.isVisible = true
                        WasDdescr.isVisible = true
                    }
                    46 ->
                    {
                        nameView.text = "John F. Kennedy"

                        Kennedy.isVisible = true
                        KenDdescr.isVisible = true
                    }
                    84 ->
                    {
                        nameView.text = "Isaac Newton"

                        Isaac.isVisible = true
                        NewtDdescr.isVisible = true
                    }
                    76 ->
                    {
                        nameView.text = "Albert Ienstein"

                        Ienstein.isVisible = true
                        IenDdescr.isVisible = true
                    }
                    18 ->
                    {
                        nameView.text = "King Tutankhamun"

                        KingTutImage.isVisible = true
                        TutDdescr.isVisible = true
                    }
                    39 ->
                    {
                        nameView.text = "Cleopatra"

                        Cleopatra.isVisible = true
                        CleoDdescr.isVisible = true
                    }
                    96 ->
                    {
                        nameView.text = "Elizabeth the 2nd"

                        Elizabeth.isVisible = true
                        ElizDdescr.isVisible = true
                    }
                    66 ->
                    {
                        nameView.text = "Tom Clancy"

                        Clancy.isVisible = true
                        TomDdesrc.isVisible = true
                    }
                    57 ->
                    {
                        nameView.text = "Abraham lincoln"

                        Lincoln.isVisible = true
                        LinDdescr.isVisible = true
                    }
                    else -> nameView.text = "This age is not within our history data base."
                }

            } catch (e: Exception) { nameView.text = "Input error" }

            mainButton.isVisible = false
            returnButton.isVisible = true
            enterAge.isVisible = false
            nameView.isVisible = true

        }


        returnButton.setOnClickListener()
        {
            (findViewById<EditText>(R.id.editTextText)).setText("")

            //All are imageButtons.
            mainButton.isVisible = true
            returnButton.isVisible = false
            enterAge.isVisible = true
            nameView.isVisible = false
            Napoleon.isVisible = false
            Washington.isVisible = false
            Kennedy.isVisible = false
            Isaac.isVisible = false
            Ienstein.isVisible = false
            KingTutImage.isVisible = false
            Cleopatra.isVisible = false
            Elizabeth.isVisible = false
            Clancy.isVisible = false
            Lincoln.isVisible = false

            //All are Edittext fields.
            NapDdescr.isVisible = false
            WasDdescr.isVisible = false
            KenDdescr.isVisible = false
            NewtDdescr.isVisible = false
            IenDdescr.isVisible = false
            TutDdescr.isVisible = false
            CleoDdescr.isVisible = false
            ElizDdescr.isVisible = false
            TomDdesrc.isVisible = false
            LinDdescr.isVisible = false
        }
    }
}