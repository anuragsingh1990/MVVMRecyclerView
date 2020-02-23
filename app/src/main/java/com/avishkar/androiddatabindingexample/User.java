package com.avishkar.androiddatabindingexample;

import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;

import de.hdodenhof.circleimageview.CircleImageView;

public class User {
   public String name,email;
   public int imageid;
   public User(String name,String email,int imageid){
       this.name=name;
       this.email=email;
       this.imageid=imageid;

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    @BindingAdapter("android:imageUrl")
    public static void loadImage(View view,int imageid){
        CircleImageView circleImageView=(CircleImageView)view;
        circleImageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(),imageid));
    }
}
