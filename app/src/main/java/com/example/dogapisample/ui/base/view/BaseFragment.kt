package com.example.dogapisample.ui.base.view

import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.dogapisample.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BaseFragment : Fragment() {

    fun setBottomNavigationVisibility(status: Int) {
//        val navBar: BottomNavigationView =
//            requireActivity().findViewById(R.id.bnv_bottom_navigation)
//        navBar.visibility = status
    }

    fun setToolBarVisibility(status: Int) {
//        val toolbar: Toolbar = requireActivity().findViewById(R.id.toolbar)
//        toolbar.visibility = status
    }
}