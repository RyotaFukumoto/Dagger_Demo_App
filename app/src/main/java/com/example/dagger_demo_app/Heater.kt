package com.example.dagger_demo_app

import javax.inject.Inject


class Heater @Inject internal constructor() {
    var isHot = false

    fun heating() {
        isHot = true
        println("heating")
    }
}