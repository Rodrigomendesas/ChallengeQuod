package com.fiap.challengequod

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFacialBiometrics = findViewById<Button>(R.id.btnFacialBiometrics)
        val btnDigitalBiometrics = findViewById<Button>(R.id.btnDigitalBiometrics)
        val btnDocumentAnalysis = findViewById<Button>(R.id.btnDocumentAnalysis)
        val btnSimSwap = findViewById<Button>(R.id.btnSimSwap)
        val btnRegisterUpdate = findViewById<Button>(R.id.btnRegisterUpdate)
        val btnAntiFraudScore = findViewById<Button>(R.id.btnAntiFraudScore)

        btnFacialBiometrics.setOnClickListener {
            startActivity(Intent(this, FacialBiometricsActivity::class.java))
        }

        btnDigitalBiometrics.setOnClickListener {
            startActivity(Intent(this, DigitalBiometricsActivity::class.java))
        }

        btnDocumentAnalysis.setOnClickListener {
            startActivity(Intent(this, DocumentAnalysisActivity::class.java))
        }

        btnSimSwap.setOnClickListener {
            startActivity(Intent(this, SimSwapActivity::class.java))
        }

        btnRegisterUpdate.setOnClickListener {
            startActivity(Intent(this, RegisterUpdateActivity::class.java))
        }

        btnAntiFraudScore.setOnClickListener {
            startActivity(Intent(this, AntiFraudScoreActivity::class.java))
        }
    }
}
