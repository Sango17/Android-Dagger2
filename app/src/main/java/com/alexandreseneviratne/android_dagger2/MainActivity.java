package com.alexandreseneviratne.android_dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    
    @Inject
    MemberDataManager memberDataManager;
    
    private Button submitBtn;
    private EditText memberId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        App.getApp().getMemberAppComponent().inject(this);
        
        submitBtn = (Button) findViewById(R.id.btnSubmit);
        memberId = (EditText) findViewById(R.id.etMemberId);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (memberId.getText().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter a member ID", Toast.LENGTH_LONG);
                } else {
                    String input = memberId.getText().toString();
                    String result = memberDataManager.checkMemberStatus(input);
                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
                }
            }
        });


        
    }
}
