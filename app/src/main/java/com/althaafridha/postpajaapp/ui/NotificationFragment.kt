package com.althaafridha.postpajaapp.ui

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.althaafridha.postpajaapp.R
import com.althaafridha.postpajaapp.data.PostData
import com.althaafridha.postpajaapp.databinding.FragmentHomeBinding
import com.althaafridha.postpajaapp.databinding.FragmentNotificationBinding
import com.althaafridha.resepibuapp.adapter.NotificationAdapter
import com.althaafridha.resepibuapp.adapter.PostAdapter

class NotificationFragment : Fragment() {
    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNotificationBinding.inflate(inflater, container, false)

        binding.rvNotif.apply {
            setHasFixedSize(true)

            layoutManager = LinearLayoutManager(activity)
            adapter = NotificationAdapter(PostData.listNotif)

        }
        return binding.root
    }
}