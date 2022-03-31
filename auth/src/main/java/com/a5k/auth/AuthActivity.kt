package com.a5k.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.a5k.auth.view.IView

class AuthActivity : AppCompatActivity(), IView {
    lateinit var navigation: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        navigation = Navigation.findNavController(this, R.id.fragment_conteiner_auth)
    toSingInFragment()

    }

    override fun toSingInFragment() {
        navigation.navigate(R.id.singInFragment)
    }

    override fun toSingOutFragment() {
        navigation.navigate(R.id.singOutFragment)
    }

}