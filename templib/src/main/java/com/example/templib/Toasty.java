package com.example.templib;

import android.content.Context;
import android.widget.Toast;


public class Toasty {


    public static void showmsg(Context c)

    {
        Toast.makeText(c,Constants.text , Toast.LENGTH_SHORT).show();
    }
}
