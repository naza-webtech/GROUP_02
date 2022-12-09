package nazawebtech.com;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editTextNumber;
    private TextView textView;
    AlertDialog.Builder builder;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = findViewById(R.id.button);
        builder = new AlertDialog.Builder(this);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView= findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editTextNumber.getText().toString();
                double r = Double.parseDouble(s);
                double area = Math.PI * r*r;
                builder.setTitle("GROUP NO 2")
                        .setMessage("The area of the circle is :" + area)
                        .setCancelable(true)
                        .setPositiveButton("OK QuitAPP", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                               finish();
                            }
                        })
                        .setNegativeButton("try Again", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        })
                        .show();

                textView.setText("The area of the circle is :" + area);
            }
        });


    }


}