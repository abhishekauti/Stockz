package com.main.app.fragments.practicemode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import com.main.app.R


class PracticeModeFragment1 : Fragment() {

    lateinit var createGameBtn : MaterialButton

    //info btns
    lateinit var infoBtnPortfolio : ImageButton
    lateinit var infoBtnMarketPlace : ImageButton
    lateinit var infoBtnTimeFrame : ImageButton
    lateinit var infoBtnGamePlay : ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_practice_mode1, container, false)
        createGameBtn = view.findViewById(R.id.createGameBtn)

        infoBtnPortfolio = view.findViewById(R.id.infoBtnPortfolio)
        infoBtnMarketPlace = view.findViewById(R.id.infoBtnMarketPlace)
        infoBtnTimeFrame = view.findViewById(R.id.infoBtnTimeFrame)
        infoBtnGamePlay = view.findViewById(R.id.infoBtnGameType)

//        val alertDialog  = AlertDialog.Builder(this)

        infoBtnGamePlay.setOnClickListener {
//TODO Show Dialog
        }

        createGameBtn.setOnClickListener {
            showPracticeModeInstructions()
        }

        return view
    }

    private fun showPracticeModeInstructions() {
        TODO("Not yet implemented")
    }

}