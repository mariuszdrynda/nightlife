package pl.przemsoft.nightlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartAppActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);
        Intent intent = new Intent(this, TestDragBarActivity.class);
        startActivity(intent);
    }
}
