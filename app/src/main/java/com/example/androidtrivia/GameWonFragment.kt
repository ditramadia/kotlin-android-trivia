package com.example.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.androidtrivia.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentGameWonBinding>(inflater, R.layout.fragment_game_won, container, false)

        binding.nextMatchButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_gameWonFragment_to_gameFragment)
        )

        return binding.root
    }
}