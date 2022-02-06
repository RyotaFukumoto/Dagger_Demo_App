package com.example.dagger_demo_app

import javax.inject.Inject


class CoffeeMaker @Inject internal constructor() {
    @Inject
    lateinit var heater: Heater

    @Inject
    lateinit var pump: Pump


    fun drip() {
        heater.heating()
        pump.pumping(heater)
        println("Complete!")
    }
}