package com.mfkrg.praktika2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mfkrg.praktika2.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    Spinner spinnerTemp;
    EditText editTextTemp;
    TextView text_b;
    TextView text_B;
    TextView text_Kb;
    TextView text_KB;
    TextView text_Mb;
    TextView text_MB;
    TextView text_Gb;
    TextView text_GB;
    TextView text_Tb;
    TextView text_TB;
    Button buttonCount;
    double valueDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        spinnerView();
    }


    private void findId() {
        spinnerTemp = findViewById(R.id.spinnerCalculation);
        editTextTemp = findViewById(R.id.editTextTemp);
        text_b = findViewById(R.id.text_bit);
        text_B = findViewById(R.id.text_byte);
        text_Kb = findViewById(R.id.text_Kbit);
        text_KB = findViewById(R.id.text_KByte);
        text_Mb = findViewById(R.id.text_Mbit);
        text_MB = findViewById(R.id.text_MByte);
        text_Gb = findViewById(R.id.text_Gbit);
        text_GB = findViewById(R.id.text_GByte);
        text_TB = findViewById(R.id.text_TByte);
        buttonCount = findViewById(R.id.buttonCount);
    }

    private void spinnerView() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.calculationArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTemp.setAdapter(adapter);
        spinnerTemp.setOnItemSelectedListener(this);
    }

    @SuppressLint("SetTextI18n")
    public void bitCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim();
                valueDouble = Double.parseDouble(valueString);
                double bits = valueDouble;
                double Bytes = valueDouble / 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кбит");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБайт");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мбит");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБайт");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гбит");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБайт");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБайт");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void ByteCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim(); //15
                valueDouble = Double.parseDouble(valueString); //Обозначает Bytes
                double bits = valueDouble * 8;
                double Bytes = valueDouble;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void KbCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim(); //15
                valueDouble = Double.parseDouble(valueString); //Обозначает Килобиты
                double bits = valueDouble * 1024;
                double Bytes = bits / 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void KBCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim();
                valueDouble = Double.parseDouble(valueString);
                double Bytes = valueDouble * 1024;
                double bits = Bytes * 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void MbCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim();
                valueDouble = Double.parseDouble(valueString);
                double bits = valueDouble * 1024 * 1024;
                double Bytes = bits / 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void MBCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim();
                valueDouble = Double.parseDouble(valueString);
                double Bytes = valueDouble * 1024 * 1024;
                double bits = Bytes * 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void GbCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim();
                valueDouble = Double.parseDouble(valueString);
                double bits = valueDouble * 1024 * 1024 * 1024;
                double Bytes = bits / 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void GBCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim();
                valueDouble = Double.parseDouble(valueString);
                double Bytes = valueDouble * 1024 * 1024 * 1024;
                double bits = Bytes * 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }
    @SuppressLint("SetTextI18n")
    public void TBCalc() {
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueString = editTextTemp.getText().toString().trim(); //15
                valueDouble = Double.parseDouble(valueString); //Обозначает ТераБайты
                double Bytes = valueDouble * 1024 * 1024 * 1024 * 1024;
                double bits = Bytes * 8;

                text_b.setText((float)bits + " бит");
                text_B.setText((float)Bytes + " Байт");
                bits /= 1024;
                text_Kb.setText((float)bits + " Кб");
                Bytes /= 1024;
                text_KB.setText((float)Bytes + " КБ");
                bits /= 1024;
                text_Mb.setText((float)bits + " Мб");
                Bytes /= 1024;
                text_MB.setText((float)Bytes + " МБ");
                bits /= 1024;
                text_Gb.setText((float)bits + " Гб");
                Bytes /= 1024;
                text_GB.setText((float)Bytes + " ГБ");
                bits /= 1024;
                text_TB.setText((float)Bytes + " TБ");
            }
        });
    }


    // когда в спиннере выбирают величину - запускается if
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long length) {
        String text = parent.getItemAtPosition(position).toString();
        if (text.equals("bit")) {
            bitCalc();
        }
        else if (text.equals("Byte")) {
            ByteCalc();
        }
        else if (text.equals("Kb")) {
            KbCalc();
        }
        else if (text.equals("KB")) {
            KBCalc();
        }
        else if (text.equals("Mb")) {
            MbCalc();
        }
        else if (text.equals("MB")) {
            MBCalc();
        }
        else if (text.equals("Gb")) {
            GbCalc();
        }
        else if (text.equals("GB")) {
            GBCalc();
        }
        else {
            TBCalc();
        }
//        Toast.makeText(parent.getContext(),text , Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}