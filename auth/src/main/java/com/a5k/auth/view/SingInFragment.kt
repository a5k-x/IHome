package com.a5k.auth.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.a5k.auth.data.model.User
import com.a5k.auth.databinding.FragmentSingInBinding


class SingInFragment : Fragment() {

    private var vb: FragmentSingInBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentSingInBinding.inflate(inflater, container, false)
        return vb?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        singInListener()
        onClickListenerToRegistery()
    }

    private fun singInListener() {
        val login = vb?.login
        val pass = vb?.password
        vb?.btnSingIn?.setOnClickListener {
            if (login?.text.toString().isEmpty()) {
                login?.error = ERROR_FIELD
                return@setOnClickListener
            }
            if (pass?.text.toString().isEmpty()) {
                pass?.error = ERROR_FIELD
                return@setOnClickListener
            }
            val user = User(login?.text.toString(), pass?.text.toString())

        }
    }

    private fun onClickListenerToRegistery() {
        vb?.toRegistration?.setOnClickListener {
            (activity as IView).toSingOutFragment()
        }
    }

    companion object {
        private const val NAME_TITLE = "Авторизация"
        private const val ERROR_FIELD = "Введите данные"
        private const val ERROR = "Ошибка"
    }
}