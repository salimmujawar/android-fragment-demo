package com.example.herome.Activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.herome.Fragments.MainFragment;
import com.example.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.OnMainFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if(fragment == null) {
            fragment = new MainFragment();
            manager.beginTransaction().add(R.id.fragment_container,fragment).commit();

        }
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }
}
