package com.vaisakh.hustler.dragger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    
    //Field dependancy injection
     @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Field dependancy injection
        var fieldinject = DaggerCarComponent.create()
        fieldinject.fieldinject(this)
        
        //DaggerCarComponent.create().getcar() : constructor dependancy injection
        
        car.start()
    }

}
