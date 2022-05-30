package com.aydsoft.ortalamahesaplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aydsoft.ortalamahesaplama.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hesapla.setOnClickListener{
            if(binding.txtFinal.text.isNotEmpty() && binding.txtVize.text.isNotEmpty() && binding.txtVizeOran.text.isNotEmpty() && binding.txtFinalOran.text.isNotEmpty())
            {

                var vize= binding.txtVize.text.toString().toInt()
                var final= binding.txtFinal.text.toString().toInt()
                var vizeOran= binding.txtVizeOran.text.toString().toInt()
                var finalOran= binding.txtFinalOran.text.toString().toInt()

                var hesapla:Double = ((vize*vizeOran)/100) + ((final*finalOran)/100).toDouble()
                txtSonuc.text="Not Ortalamanız: "+hesapla.toString()
                if(hesapla>=0 && hesapla<=29)
                {
                    txtSonuc2.text="Harf Notunuz: FF "
                }
                else if(hesapla>=30 && hesapla<=39)
                {
                    txtSonuc2.text="Harf Notunuz: FD "
                }
                else if(hesapla>=40 && hesapla<=49)
                {
                    txtSonuc2.text="Harf Notunuz: DD "
                }
                else if(hesapla>=50 && hesapla<=59)
                {
                    txtSonuc2.text="Harf Notunuz: DC "
                }
                else if(hesapla>=60 && hesapla<=69)
                {
                    txtSonuc2.text="Harf Notunuz: CC "
                }
                else if(hesapla>=70 && hesapla<=74)
                {
                    txtSonuc2.text="Harf Notunuz: CB "
                }
                else if(hesapla>=75 && hesapla<=79)
                {
                    txtSonuc2.text="Harf Notunuz: BB "
                }
                else if(hesapla>=80 && hesapla<=89)
                {
                    txtSonuc2.text="Harf Notunuz: AB "
                }
                else
                {
                    txtSonuc2.text="Harf Notunuz: AA "
                }
                txtVize.text.clear()
                txtVizeOran.text.clear()
                txtFinal.text.clear()
                txtFinalOran.text.clear()
            }
            else
            {
                binding.txtSonuc.text="Boş alan bırakmadığınızdan emin olun!"
                binding.txtSonuc2.text=""
            }
        }
    }
}