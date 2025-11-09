package com.mahmutalperenunal.playstorelauncher

import android.content.ActivityNotFoundException
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val playStorePackage = "com.android.vending"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openPlayStore()
        finish()
    }

    private fun openPlayStore() {
        try {
            val launchIntent = packageManager.getLaunchIntentForPackage(playStorePackage)
            if (launchIntent != null) {
                startActivity(launchIntent)
            } else {
                Toast.makeText(
                    this,
                    getString(R.string.toast_not_found),
                    Toast.LENGTH_LONG
                ).show()
            }
        } catch (_: ActivityNotFoundException) {
            Toast.makeText(
                this,
                getString(R.string.toast_activity_not_found),
                Toast.LENGTH_LONG
            ).show()
        } catch (t: Throwable) {
            Toast.makeText(
                this,
                getString(R.string.toast_generic_error, t.message),
                Toast.LENGTH_LONG
            ).show()
        }
    }
}