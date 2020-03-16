package pro.basked.telegram.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


open class BaseFragment(val layout: Int) : Fragment() {


    private lateinit var mRootView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = inflater.inflate(layout, container,  false)
        return mRootView
    }

    override fun onStart() {
        // общие настройки дальнейние в каждом отдельном фрагменте в onResume
        super.onStart()
    }
}
