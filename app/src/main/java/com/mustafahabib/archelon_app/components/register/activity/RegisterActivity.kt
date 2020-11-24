package com.mustafahabib.archelon_app.components.register.activity

import android.view.View
import androidx.fragment.app.Fragment
import com.mustafahabib.archelon_app.components.base.GenericActivity
import com.mustafahabib.archelon_app.components.register.RegisterFragment
import kotlinx.android.synthetic.main.activity_generic.*

class RegisterActivity : GenericActivity() {

    override fun setToolBar() {
        toolbar.visibility = View.GONE
    }

    override fun loadFragment(callback: (f: Fragment) -> Unit) {
        callback.invoke(RegisterFragment.newInstance())
    }

    override fun loadTag(): String {
        return "RegisterTag"
    }
}