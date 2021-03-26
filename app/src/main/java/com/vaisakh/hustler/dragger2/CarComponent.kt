package com.vaisakh.hustler.dragger2

import dagger.Component

@Component
interface CarComponent {

    fun getcar(): Car

    fun fieldinject(mainActivity: MainActivity)
}