
package com.example.son.chunhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText c_dai, c_rong;
    TextView ketqua;
    Button tinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_dai=(EditText)findViewById(R.id.editText);
        c_rong=(EditText)findViewById((R.id.editText2));
        ketqua=(TextView)findViewById(R.id.textView4);
        tinh=(Button)findViewById((R.id.button));



        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cd=Integer.parseInt(c_dai.getText().toString());
                int cr=Integer.parseInt(c_rong.getText().toString());
              //  HinhChuNhat a=new HinhChuNhat(cd,cr);

                //int thongtin =a.getdai();
                //ketqua.setText(thongtin);
             int dt=cd*cr;
             int cv=(cd+cr)*2;
             ketqua.setText("Dien tich:  "+dt+ "   Chu vi:   "+ cv);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
