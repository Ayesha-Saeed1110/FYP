package com.ayesha.smartparklite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setting splashscreen code
        /* Thread.sleep(2000) // 2 seconds
         installSplashScreen()*/
        setContentView(R.layout.activity_main)
        /*// Copy the Excel file from assets to internal storage
        copyExcelFileToInternalStorage("Dashboard.xlsx")

        // Start GraphActivity to display the graph
        val intent = Intent(this, GraphActivity::class.java)
        startActivity(intent)*/


        /*   private fun copyExcelFileToInternalStorage(fileName: String) {
               val file = File(filesDir, fileName)
               if (!file.exists()) {
                   val assetManager = assets
                   var inputStream: InputStream? = null
                   var outputStream: FileOutputStream? = null
                   try {
                       inputStream = assetManager.open(fileName)
                       outputStream = openFileOutput(fileName, MODE_PRIVATE)

                       val buffer = ByteArray(1024)
                       var length: Int
                       while (inputStream.read(buffer).also { length = it } > 0) {
                           outputStream.write(buffer, 0, length)
                       }
                   } catch (e: Exception) {
                       e.printStackTrace()
                   } finally {
                       inputStream?.close()
                       outputStream?.close()
                   }
               }*/
        Handler().postDelayed({
            startActivity(Intent(this, LoginPage::class.java))
            finish()
        },1000)

    }
}

