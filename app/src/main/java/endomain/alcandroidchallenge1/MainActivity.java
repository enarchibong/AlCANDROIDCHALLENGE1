package endomain.alcandroidchallenge1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonB;
    private Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonB= (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2(); //activity2 is activityB
            }
        });

        buttonC= (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityC();
            }
        });

    }

    private void openActivityC() {
        Intent intent= new Intent(this, ActivityC.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent= new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
