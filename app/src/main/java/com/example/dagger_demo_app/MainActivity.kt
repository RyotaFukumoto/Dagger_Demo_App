package com.example.dagger_demo_app
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.Component


class MainActivity : AppCompatActivity() {

    private lateinit var coffeeShop :CoffeeShop

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coffeeShop = DaggerMainActivity_CoffeeShop.create()
        coffeeShop.maker().drip()
    }

    @Component
    interface CoffeeShop {
        fun maker(): CoffeeMaker
    }
}
