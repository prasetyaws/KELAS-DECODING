package id.sc.smktelkom_mlg.tugas01.xrpl5_26.kelasdecoding;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Edit1,mail,pass;
    Button DF;
    RadioButton LK,PR;
    CheckBox CB1,CB2,CB3;
    TextView hasil1;
    Spinner kelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edit1 = (EditText) findViewById(R.id.ED1);
        hasil1= (TextView)findViewById(R.id.hasilnama);
        kelas= (Spinner)findViewById(R.id.spinnerKelas);
        CB1=(CheckBox)findViewById(R.id.android);
        CB2=(CheckBox)findViewById(R.id.game);
        CB3=(CheckBox)findViewById(R.id.dekstop);
        LK=(RadioButton)findViewById(R.id.lelaki) ;
        PR=(RadioButton)findViewById(R.id.perempuan) ;
        mail=(EditText)findViewById(R.id.ED2);
        pass=(EditText)findViewById(R.id.ED3);



        DF = (Button)findViewById(R.id.bdaftar);

        DF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(isValid());
                String nama = Edit1.getText().toString();
                String hasil ="\n\nKategori Kelas:\n";
                String kelamin = null;
                int startlen = hasil.length();
                if(CB1.isChecked()) hasil+=CB1.getText()+"\n";
                if(CB2.isChecked()) hasil+=CB2.getText()+"\n";
                if(CB3.isChecked()) hasil+=CB3.getText()+"\n";

                if(PR.isChecked())
                {
                    kelamin = PR.getText().toString();
                }
                else if(LK.isChecked());
                {
                    kelamin = LK.getText().toString();
                }

                if(hasil.length()== startlen) hasil+="Tidak Memilih";

                hasil1.setText("\nNAMA :"+nama
                        +"\n\nKELAS :"
                        +kelas.getSelectedItem().toString()
                        +hasil+"\n\nJENIS KELAMIN:"+kelamin);}




        });
    }




}
