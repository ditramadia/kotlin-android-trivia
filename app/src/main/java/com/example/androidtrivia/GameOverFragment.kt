package com.example.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.androidtrivia.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentGameOverBinding>(inflater, R.layout.fragment_game_over, container, false)
        (activity as AppCompatActivity).supportActionBar?.title = "Android Trivia"

        binding.tryAgainButton.setOnClickListener {view: View ->
            view.findNavController()
                .navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
        }

        return binding.root
    }
}