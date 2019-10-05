package id.ac.poliban.dts.yusril.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //kenaikan view ke object di source kita
        Object edit_Text;
        EditText etUserName = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btClear = findViewById(R.id.btCLear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(v -> {
            //mengosongkan EditText
            etUserName.setText("");
            etPassword.setText("");
            //meletakan kursor di etUserName
            etUserName.requestFocus();
        });

        btLogin.setOnClickListener(v -> {
            //mengosongkan edittext
            etUserName.setText("");
            etPassword.setText("");
            //meletakan kursor
            etPassword.requestFocus();

        });
    }
}
