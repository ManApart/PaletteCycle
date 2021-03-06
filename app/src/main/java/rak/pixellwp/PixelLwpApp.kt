package rak.pixellwp

import android.app.Application
import android.content.Context
import android.util.Log
import rak.pixellwp.cycling.LoggingManager
import rak.pixellwp.cycling.jsonModels.ImageInfo
import java.io.File
import java.io.IOException
import java.io.OutputStreamWriter

//import com.squareup.leakcanary.LeakCanary

class PixelLwpApp : Application() {
    private val logTag = "PixelLWPApp"
    private val loggingManager = LoggingManager(this)

    override fun onCreate() {
        super.onCreate()
        loggingManager.startLogging()
//        if (LeakCanary.isInAnalyzerProcess(this)){
//            return
//        }
//        LeakCanary.install(this)

    }

}