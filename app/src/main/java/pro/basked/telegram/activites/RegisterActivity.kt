package pro.basked.telegram.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pro.basked.telegram.R

class RegisterActivity : AppCompatActivity() {

    private lateinit var mBiRegisterActivity: RegisterActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}
