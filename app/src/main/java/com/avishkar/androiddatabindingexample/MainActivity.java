package com.avishkar.androiddatabindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.avishkar.androiddatabindingexample.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    List<User> list = new ArrayList<>();
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.viewEmployees.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.viewEmployees.setHasFixedSize(true);

        list.add(new User("Anurag", "anurag@gmail.com", R.drawable.ic_launcher_background));
        list.add(new User("Ashutosh", "ashutosh@gmail.com", R.drawable.ic_launcher_foreground));
        list.add(new User("Anshuman", "anush@gmail.com", R.drawable.ic_launcher_background));
        adapter = new RecyclerAdapter(this, list);
        mainBinding.viewEmployees.setAdapter(adapter);
    }


}
