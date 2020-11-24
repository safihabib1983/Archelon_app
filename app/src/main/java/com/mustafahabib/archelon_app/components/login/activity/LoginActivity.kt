package com.mustafahabib.archelon_app.components.login.activity

import android.view.View
import androidx.fragment.app.Fragment
import com.mustafahabib.archelon_app.components.base.GenericActivity
import com.mustafahabib.archelon_app.components.login.LoginFragment
import kotlinx.android.synthetic.main.activity_generic.*

class LoginActivity : GenericActivity() {

    override fun setToolBar() {
        toolbar.visibility = View.GONE
    }

    override fun loadFragment(callback: (f: Fragment) -> Unit) {
        callback.invoke(LoginFragment.newInstance())
    }

    override fun loadTag(): String {
        return "LoginTag"
    }
}