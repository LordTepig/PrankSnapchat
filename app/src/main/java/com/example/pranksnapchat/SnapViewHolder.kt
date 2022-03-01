package com.example.pranksnapchat

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pranksnapchat.databinding.ListItemLayoutBinding

class SnapViewHolder (val binding: ListItemLayoutBinding):
    RecyclerView.ViewHolder(binding.root){

    private lateinit var currentSnap: Snap

    init{
        binding.root.setOnClickListener{
            setSnapStatus(currentSnap)
            binding.root.findNavController().navigate(R.id.action_mainFragment_to_prankSnapFragment)
            currentSnap.opened = true
        }
    }

    fun bindSnap(snap:Snap){
        currentSnap = snap
        setSnapStatus((currentSnap))
    }

    fun setSnapStatus(snap:Snap){
        binding.senderPFPImageView.setImageResource(currentSnap.senderPFPResourceID)
        binding.usernameTextView.text = currentSnap.username
        binding.statusIconImageView.setImageResource(currentSnap.iconStatusResourceID)
        binding.statusTextView.text = currentSnap.status
        binding.timeSinceSentTextView.text = "${currentSnap.time}m"


    }

}