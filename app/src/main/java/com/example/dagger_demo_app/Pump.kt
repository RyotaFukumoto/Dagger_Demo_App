package com.example.dagger_demo_app

import javax.inject.Inject


class Pump @Inject internal constructor(
    ) {
    fun pumping(heater: Heater) {
        if (heater.isHot) {
            println("pumping")
        }
    }
}

