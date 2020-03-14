package pro.basked.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.Drawer
import pro.basked.telegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //mBinding where m -member (член класса)
    private lateinit var mBindinding: ActivityMainBinding
    private lateinit var mDrawler: Drawer
    private lateinit var mHeader: AccountHeader
    private lateinit var mToolbar:Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
