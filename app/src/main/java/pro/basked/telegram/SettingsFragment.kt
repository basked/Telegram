package pro.basked.telegram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pro.basked.telegram.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private lateinit var mBinding:FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       mBinding=FragmentSettingsBinding.inflate(layoutInflater)
        return  mBinding.root
    }

}
