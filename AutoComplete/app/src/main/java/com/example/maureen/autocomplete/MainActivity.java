package com.example.maureen.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;

import android.os.Bundle;
import android.os.Environment;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    AutoCompleteTextView text;
    MultiAutoCompleteTextView text1;
    String[] languages={"Android ","java","IOS","SQL","JDBC","Web services"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        text=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        text1=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);

        ArrayAdapter adapter = new
                ArrayAdapter(this,android.R.layout.simple_list_item_1,languages);

        text.setAdapter(adapter);
        text.setThreshold(1);

        text1.setAdapter(adapter);
        text1.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
