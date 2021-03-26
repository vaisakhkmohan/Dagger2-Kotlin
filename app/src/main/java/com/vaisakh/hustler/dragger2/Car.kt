package com.vaisakh.hustler.dragger2

import javax.inject.Inject


class Car {

    lateinit var engine: Engine
    lateinit var wheel: Wheel

    @Inject
    constructor(wheel: Wheel,engine: Engine){
        this.engine = engine
        this.wheel = wheel
    }

    fun start(){

    }
}