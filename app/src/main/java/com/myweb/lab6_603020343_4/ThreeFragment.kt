package com.myweb.lab6_603020343_4


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_three2.view.*

/**
 * A simple [Fragment] subclass.
 */
class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_three2,container,false)
        view.btnClickFragThree.setOnClickListener(){
            val toast  = Toast.makeText(context, "Click On Fragment Three", Toast.LENGTH_SHORT)
            toast.show()
        }
        // Inflate the layout for this fragment
        return view
    }


}
