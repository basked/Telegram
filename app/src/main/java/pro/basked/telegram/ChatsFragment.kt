package pro.basked.telegram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pro.basked.telegram.databinding.FragmentChatsBinding

/**
 * A simple [Fragment] subclass.
 */
class ChatsFragment : Fragment() {
    // Добавлеям ссылку на фрагмент
    private lateinit var mBinding: FragmentChatsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // инициализация биндинга
        mBinding=FragmentChatsBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
    }

}
