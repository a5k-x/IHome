package com.a5k.auth.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.a5k.auth.data.model.User
import com.a5k.auth.databinding.FragmentSingOutBinding


class SingOutFragment : Fragment() {

    private var vb: FragmentSingOutBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentSingOutBinding.inflate(inflater, container, false)
        return vb?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        singOutListener()
        onClickListenerToRegistery()
    }

    private fun singOutListener() {
        val login = vb?.newLogin
        val pass = vb?.newPassword
        val repeatPass = vb?.repeatPassword
        vb?.btnSingOut?.setOnClickListener {
            if (login?.text.toString().isEmpty()) {
                login?.error = ERROR_FIELD
                return@setOnClickListener
            }
            if (pass?.text.toString().isEmpty()) {
                pass?.error = ERROR_FIELD
                return@setOnClickListener
            }
            if (repeatPass?.text.toString().isEmpty()) {
                repeatPass?.error = ERROR_FIELD
                return@setOnClickListener
            }
            val user = User(login?.text.toString(), pass?.text.toString())
            if (user != null) {

            }

        }
    }

    private fun onClickListenerToRegistery() {
        vb?.toAutorization?.setOnClickListener {
            (activity as IView).toSingInFragment()
        }
    }

    companion object {
        private const val NAME_TITLE = "Регистрация"
        private const val ERROR_FIELD = "Не верные данные"
        private const val ERROR = "Ошибка"
    }
}