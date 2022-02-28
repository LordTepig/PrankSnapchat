package com.example.pranksnapchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pranksnapchat.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val snaps = listOf(Snap("Jake M", 1680, R.drawable.bitmojimaleone, false),
            Snap("The Thor", 7200, R.drawable.bitmojimaletwo, false),
            Snap("Rose Mary", 86440, R.drawable.bitmojirosemary, false),
            Snap("Heather G", 5, R.drawable.bitmojifemaletwo, false) )

        val mAdapter = SnapAdapter(snaps)
        binding.recyclerView.adapter = mAdapter

        return rootView
    }
}


