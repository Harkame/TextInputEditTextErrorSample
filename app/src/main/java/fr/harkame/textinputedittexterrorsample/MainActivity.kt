package fr.harkame.textinputedittexterrorsample

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import fr.harkame.textinputedittexterrorsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btDisableEditText.setOnClickListener {
            if(binding.etPhoneNumber.isEnabled)
            {
                binding.etPhoneNumber.isEnabled = false

                binding.btDisableEditText.text = "Enable"
                binding.etPhoneNumber.isFocusableInTouchMode = true
                binding.etPhoneNumber.error = "etPhoneNumber is now disabled !"
                binding.etPhoneNumber.requestFocus()
            }
            else
            {
                binding.etPhoneNumber.isEnabled = true

                binding.btDisableEditText.text = "Disable"
                binding.etPhoneNumber.isFocusableInTouchMode = true
                binding.etPhoneNumber.error = "etPhoneNumber is now enabled !"
                binding.etPhoneNumber.requestFocus()
            }
        }
    }
}