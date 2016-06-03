package Smart_Service_Shipment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.nalini.navi1.R;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


    }


    public void vInfo(View view) {

        Intent intent = new Intent(this, DataListActivity.class);
        startActivity(intent);
    }

    public void uInfo(View view) {
        Intent intent = new Intent(this, UpdateContactActivity.class);
        startActivity(intent);
    }


}
