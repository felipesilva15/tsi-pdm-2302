package io.github.felipesilva15;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toast.makeText(this, "Aplicação rodando...", Toast.LENGTH_LONG).show();

        TextView aluno = new TextView(this);
        aluno.setText("Hello World!");
        setContentView(aluno);
    }
}
