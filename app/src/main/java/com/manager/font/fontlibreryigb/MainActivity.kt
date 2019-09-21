package com.manager.font.fontlibreryigb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manager.font.fontmanager.*
import kotlinx.android.synthetic.main.activity_main.*


//Created by jGutierrez 'LordIsaac'
// Date 2018

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Todo 'Kotlin Code Compatible with'
        // load icon using the library
        tv_icon_one.setTextFontAwesome(JGBFontManager.fontCash)
        // load icon using inicode
        // for more icon here: https://fontawesome.com/icons?d=gallery&m=free
        tv_icon_two.setTextFontAwesome("\uf7c6")
        // load icon using name fonts
        tv_icon_three.setTextFontAwesome("beer")
        // load icon
        switch1.setTextFontAwesome("angry")
        // load icon
        button.setTextFontAwesome("award")
        /*

        Todo 'Java Code Compatible with'
        TextView
        FontIconIGB.Companion.setTextFontAwesome_Text_View(yourTextView).setText("user")
        EditText
        FontIconIGB.Companion.setTextEditFontAwesome_Edit_Text(yourEditText).setText("user")
        Button
        FontIconIGB.Companion.setTextEditFontAwesome_Button(yourButton).setText("user")
        Swictht
        FontIconIGB.Companion.setTextSwitchFontAwesome_Switch(yourSwicht).setText("user")
        CheckBox
        FontIconIGB.Companion.setTextCheckBoxFontAwesome_CheckBox(yourCheckBox).setText("user")
        ToggleButton
        FontIconIGB.Companion.setToggleButtonFontAwesome_ToggleButton(yourToggleButton).setText("user"))
        */

    }
}
