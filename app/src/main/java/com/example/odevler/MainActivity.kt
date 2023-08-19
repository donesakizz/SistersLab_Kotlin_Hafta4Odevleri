package com.example.odevler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    ConstraintLayout kullanarak rehbere numara kaydetme ekranı tasarlanacak bir imageView , Kaydet butonu ,iki tane edittext alanı ad ve telefon numarası girilecek.
     Telefon numarası alanına sadece numara girebilsin.
      EditTextler boş olduğunda uyarı versin boş alanları doldurun şeklinde alanlar doldurulduktan sonra “Kaydet” butonuna basıldığında sonraki sayfaya yönlendirsin ve
     numara başarılı bir şekilde kaydedildi texti görünsün
     */

    fun kaydetButtonOnClick(view: android.view.View) {
        val adEditText = findViewById<EditText>(R.id.adEditText)
        val telefonEditText = findViewById<EditText>(R.id.telefonEditText)

        val ad = adEditText.text.toString()
        val telefon = telefonEditText.text.toString()

        if (ad.isEmpty() || telefon.isEmpty()) {
            Toast.makeText(this, "Boş alanları doldurun", Toast.LENGTH_SHORT).show()
        } else {
            // Numara kaydedildiğinde yapılacak işlemler burada yer alabilir.
            val intent = Intent(this, SonrakiSayfaActivity::class.java)
            intent.putExtra("ad", ad)
            intent.putExtra("telefon", telefon)
            startActivity(intent)
        }
    }
}

