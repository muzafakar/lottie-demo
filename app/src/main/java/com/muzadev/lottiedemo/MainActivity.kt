package com.muzadev.lottiedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adpOnBoarding: AdpOnBoarding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adpOnBoarding = AdpOnBoarding(supportFragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        tlDotsContainer.setupWithViewPager(vpOnBoarding)
        vpOnBoarding.adapter = adpOnBoarding

        initOnBoarding()
    }

    private fun initOnBoarding() {
        val walkingOnBoarding = OnBoardingItemFragment().apply {
            arguments = bundleOf(
                    OnBoardingItemFragment.LOTTIE to R.raw.walking,
                    OnBoardingItemFragment.TEXT to R.string.walking
            )

        }
        val meetingOnBoarding = OnBoardingItemFragment().apply {
            arguments = bundleOf(
                    OnBoardingItemFragment.LOTTIE to R.raw.meeting,
                    OnBoardingItemFragment.TEXT to R.string.meeting
            )
        }


        adpOnBoarding.addItem(walkingOnBoarding)
        adpOnBoarding.addItem(meetingOnBoarding)
    }
}
