package com.example.implementasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView keluaran;
    EditText masukan1;
    EditText masukan2;
    Button tombol;

    char tekschar;
    int angka;
    long angkabanyak;
    float desimal;
    double desimalbanyak;
    String kata,kata1,kata2;
    boolean benersalah;
    Integer angkaobjek1;
    Integer angkaobjek2;
    final int kons=7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keluaran=(TextView)findViewById(R.id.tv_output);
        masukan1=(EditText)findViewById(R.id.et_input1);
        masukan2=(EditText) findViewById(R.id.et_input2);
        tombol=(Button)findViewById(R.id.btn_eksekusi);

        tekschar=65;
        angka=10;

        angkabanyak=10L;
        desimal=0.5f;
        desimalbanyak=0.5;
        kata="ABCD";
        benersalah=true;

        angkaobjek1=10;
        angkaobjek2=angkaobjek1;
        angkaobjek2=5;

        angka=Integer.parseInt("10");
        kata=String.valueOf(100+20);
        desimalbanyak=Double.valueOf("0.05");

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kata1=masukan1.getText().toString();
                kata2=masukan2.getText().toString();
//                int tambah=Integer.parseInt(kata1)+Integer.parseInt(kata2);
//                if(kata1==kata2){
//                    keluaran.setText("SAMA");
//                }else{
//                    keluaran.setText("BEDA");
//                }
//                if(kata1.equals(kata2)){
//                    keluaran.setText("SAMA");
//                }else{
//                    keluaran.setText("BEDA");
//                }

//                switch(kata1){
//                    case "merah":
//                        keluaran.setText("Berhenti");
//                        break;
//                    case "kuning":
//                        keluaran.setText("Bersiap");
//                        break;
//                    case "hijau":
//                        keluaran.setText("Jalan");
//                        break;
//                    default:
//                        keluaran.setText("Tidak Diketahui");
//                        break;
//                }

//                for(int i=0;i<5;i++){
//                    keluaran.setText(keluaran.getText().toString()+"\n"+String.valueOf(i));
//                }
//                int i=0;
//                while(i<5){
//                    keluaran.setText(keluaran.getText().toString()+"\n"+String.valueOf(i));
//                    i++;
//                }
//                int i=0;
//                do{
//                    keluaran.setText(keluaran.getText().toString()+"\n"+String.valueOf(i));
//                    i++;
//                }while(i<5);
//                int i=0;
//                do{
//                    keluaran.setText(keluaran.getText().toString()+"\n"+String.valueOf(i));
//                    i++;
//                }while(i<0);
                keluaran.setText(String.valueOf(pangkatpositif(Double.parseDouble(kata1),Integer.parseInt(kata2))));
            }
        });

    }

    private void fungsibiasa(){
        keluaran.setText("Ini dari void");
    }

    private void fungsidgnparameter(String str1, String str2){
        keluaran.setText(str1+" "+str2);
    }

    private void fungsidgnparameter(String str1){
        keluaran.setText("Ini namanya overloading "+str1);
    }

    private String fungsikembali(){
        return "ABC";
    }

    private String fungsikembaliparam(String str1, String str2){
        return str1+"\n"+str2;
    }

    private double pangkatpositif(double angka,int n){
        return (n<2)?angka:(angka*pangkatpositif(angka,n-1));
    }
}
