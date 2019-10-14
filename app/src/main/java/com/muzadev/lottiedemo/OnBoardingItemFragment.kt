package com.muzadev.lottiedemo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_on_boarding_item.*

/**
 * A simple [Fragment] subclass.
 */
class OnBoardingItemFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_on_boarding_item, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val animationId = it.getInt(LOTTIE)
            lavOnBoarding.setAnimation(animationId)

            val text = it.getInt(TEXT)
            tvOnBoarding.text = getString(text)
        }

    }

    companion object {
        const val LOTTIE = "Lottie"
        const val TEXT = "Text"
    }

}
