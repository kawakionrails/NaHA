package io.github.kawaki.naha.presenter.activities

import dagger.hilt.android.AndroidEntryPoint
import io.github.kawaki.naha.databinding.ActivityMainBinding
import io.github.kawaki.naha.presenter.base.BaseActivity

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setUpActivity() {
        // TODO: Not yet implemented
    }

}