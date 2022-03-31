package com.a5k.ihome.view.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.a5k.auth.AuthActivity
import com.a5k.ihome.R
import com.a5k.ihome.data.AppState
import com.a5k.ihome.databinding.ActivityMainBinding
import com.a5k.ihome.presenter.MainPresenter

class MainActivity : AppCompatActivity(), IView {

    private var vb: ActivityMainBinding? = null
    lateinit var navigation: NavController
    private val presenter: MainPresenter<AppState, IView> by lazy {
        MainPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)
        initButtomNavigations()
        navigation = Navigation.findNavController(this,R.id.fragment_container)

        startActivity(Intent(this,AuthActivity::class.java))

      }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)

    }


    override fun initButtomNavigations() {
        vb?.bottomNavigation?.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.news_page -> {
                  //  navigation.navigate(R.id.newsModuleFragment)

                    return@setOnItemSelectedListener true
                }
                R.id.smart_home_page -> {
                  //  navigation.navigate(R.id.smartFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.analytics_page -> {
                //    navigation.navigate(R.id.analyticsFragment)
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }
    }

    override fun singInFragment() {
        TODO("Not yet implemented")
    }

    override fun singOutFragment() {
        TODO("Not yet implemented")
    }

    override fun renderData(appState: AppState) {

    }


    override fun onStop() {
        super.onStop()
        presenter.detachView(this)
    }

}