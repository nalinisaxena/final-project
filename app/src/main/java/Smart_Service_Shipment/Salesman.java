package Smart_Service_Shipment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.nalini.navi1.R;

public class Salesman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salesman);


    }

    public void vsInfo(View view) {

        Intent intent = new Intent(this, DataListActivity.class);
        startActivity(intent);
    }

    public void ssInfo(View view) {
        Intent intent = new Intent(this, SearchContactActivity.class);
        startActivity(intent);
    }


}
