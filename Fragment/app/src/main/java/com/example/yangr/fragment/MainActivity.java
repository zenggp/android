package com.example.yangr.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button button = (Button)findViewById(R.id.button);
       // button.setOnClickListener(this);
        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        Log.d("mainactivity1209","xdpi is "+xdpi);
        Log.d("mainactivity1209","ydpi is "+ydpi);

    }
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.button:
//                AnotherRightFragment fragment = new AnotherRightFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                transaction.replace(R.id.right_layout,fragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
//                break;
//            default:
//                break;
//        }
//    }
}
