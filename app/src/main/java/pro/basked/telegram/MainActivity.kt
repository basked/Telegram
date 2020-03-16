package pro.basked.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import pro.basked.telegram.databinding.ActivityMainBinding
import pro.basked.telegram.fragments.ChatsFragment
import pro.basked.telegram.objects.AppDrawer

class MainActivity : AppCompatActivity() {
    //mBinding where m -member (член класса)
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    //функуиональность активити
    private fun initFunc() {
        setSupportActionBar(mToolbar)
        // меняем пустую активность на фрагмент чата
        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer,
                ChatsFragment()
            ).commit()
        // Рисуем боковое меню
        mAppDrawer.create()
    }


    private fun initFields() {
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }
}
