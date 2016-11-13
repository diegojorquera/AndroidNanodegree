package com.example.android.appportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showToast(CharSequence toastText)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toastText, duration);
        toast.show();
    }

    private void showProjectButtonToast(CharSequence projectName)
    {
        String toastText = String.format("This is where I'd put my %s project - if I had one!", projectName);
        showToast(toastText);
    }

    public void onProjectButtonClick(View view)
    {
        if (view instanceof Button)
        {
            Button button = (Button)view;
            showProjectButtonToast(button.getText());
        }
        else
        {
            showToast("Error - expected view to be a button");
        }
    }
}
