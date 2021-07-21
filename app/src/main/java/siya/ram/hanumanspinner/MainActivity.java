package siya.ram.hanumanspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ram.hanumanjetpacklibrery.HanumanCustomEditText;
import com.ram.hanumanjetpacklibrery.HanumanSpinner;
import com.ram.hanumanjetpacklibrery.ToasterMessage;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HanumanCustomEditText gh = findViewById(R.id.et_search_jobs);
        Map paramst = new HashMap<>();

        paramst.put("grapes", "12");
        paramst.put("lime", "129");
        paramst.put("lemon", "123");
        paramst.put("cherry", "126");
        paramst.put("blueberry", "128");
        paramst.put("banana", "123");


        gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HanumanSpinner.ShowSpinner(gh, 0, 0, MainActivity.this, paramst,
                        "Category", new HanumanSpinner.SpinnerItemOnClick() {


                            @Override
                            public void onItemClick(String key, String value) {
                                ToasterMessage.ShowToast(MainActivity.this, "K" + key + " Val " + value + "");
                                gh.setText("Key" + value + " ");
                            }
                            @Override
                            public void SetHeader() {
                                ToasterMessage.ShowToast(MainActivity.this, "Category");
                            }
                        });
            }
        });
    }
}