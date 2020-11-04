package com.dataflair.scientificcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*semua metode bisa baca di developer.android.com belajarnya dari situ*/
/* public supaya bisa diakses method apapun*/
public class MainActivity extends AppCompatActivity {
    /*user input buat show nomer dibagian atas, klo sign box untuk show operator yg dipencet user
     dibawahnya kotak user input*/
    TextView user_input, sign_Box;

    Double num1, num2, answer;
    String sign, val_1, val_2;
    boolean has_Dot;

    /* protected untuk diakses tertentu, on create untuk pembuatan aktivitas variabelnya savedinstancestate
    *baca dari developer.android.com/guide/components/activities/activity-lifecycle*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*user input buat show nomer dibagian atas (nama id attributenya input_user),
         klo sign box untuk show operator yg dipencet user, dibawahnya kotak user input (nama id attributenya sign_user)*/
        user_input = (TextView) findViewById(R.id.input_user);
        sign_Box = (TextView) findViewById(R.id.sign_user);

        has_Dot = false;

    }
/* @suppresslint unutk nekan error pada lint
* tentang lint bisa baca di developer.android.com/studio/write/lint
* intinya buat code scanning tool
* nyusun button 0-9 klo di klik angkanya nanti muncul pake gettext*/

    @SuppressLint("SetTextI18n")
    public void btn_0(View view) {
        user_input.setText(user_input.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btn_1(View view) {
        user_input.setText(user_input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btn_2(View view) {
        user_input.setText(user_input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btn_3(View view) {
        user_input.setText(user_input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btn_4(View view) {
        user_input.setText(user_input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btn_5(View view) {
        user_input.setText(user_input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btn_6(View view) {
        user_input.setText(user_input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btn_7(View view) {
        user_input.setText(user_input.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btn_8(View view) {
        user_input.setText(user_input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btn_9(View view) {
        user_input.setText(user_input.getText() + "9");
    }

    /*btn dot untuk koma */
    @SuppressLint("SetTextI18n")
    public void btn_dot(View view) {
        if (!has_Dot) {
            if (user_input.getText().equals("")) {

                user_input.setText("0.");
            } else {

                user_input.setText(user_input.getText() + ".");
            }

            has_Dot = true;
        }

    }

    /*untuk button tambah*/
    public void btn_add(View view) {
        sign = "+";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("+");
        has_Dot = false;
    }

    /*untuk button kurang*/
    public void btn_subtract(View view) {
        sign = "-";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("-");
        has_Dot = false;
    }

    /*untuk button kali*/
    public void btn_multiply(View view) {
        sign = "*";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("×");
        has_Dot = false;
    }

    /*untuk button bagi*/
    public void btn_divide(View view) {
        sign = "/";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        sign_Box.setText("÷");
        has_Dot = false;
    }

    /*untuk button log*/
    @SuppressLint("SetTextI18n")
    public void btn_log(View view) {
        sign = "log";
        user_input.setText(null);
        sign_Box.setText("log");
        has_Dot = false;
    }

    /*untuk button len*/
    @SuppressLint("SetTextI18n")
    public void btn_ln(View view) {
        sign = "ln";
        user_input.setText(null);
        sign_Box.setText("ln");
        has_Dot = false;
    }

    /*untuk button pangkat*/
    public void btn_power(View view) {
        sign = "power";
        val_1 = user_input.getText().toString();
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("xⁿ");
    }

    /*untuk button faktorial*/
    public void btn_factorial(View view) {
        sign = "factorial";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("!");
    }

    /*untuk button sin*/
    @SuppressLint("SetTextI18n")
    public void btn_sin(View view) {
        sign = "sin";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("sin");
    }

    /*untuk button kos*/
    @SuppressLint("SetTextI18n")
    public void btn_cos(View view) {
        sign = "cos";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("cos");
    }

    /*untuk button tan*/
    @SuppressLint("SetTextI18n")
    public void btn_tan(View view) {
        sign = "tan";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("tan");
    }

    /*untuk button akar*/
    public void btn_root(View view) {
        sign = "root";
        user_input.setText(null);
        has_Dot = false;
        sign_Box.setText("√");
    }

    /*untuk tanda sama dengan
    * diisi codingan sesuai dari button2 tadi*/
    /*kalo kosong atau operator nya dipencet trs tombol sama dengannya dipencet nanti eror*/
    @SuppressLint("SetTextI18n")
    public void btn_equal(View view) {
        if (sign == null) {
            sign_Box.setText("Error!");
        } else if (user_input.getText().equals("")) {
            sign_Box.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
            sign_Box.setText("Error!");
        } else {
            /*untuk perhitungan log, len, akar, pangkat pake math*/
            switch (sign) {
                default:
                    break;
                case "log":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    user_input.setText(Math.log10(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "ln":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    user_input.setText(Math.log(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((val_1));
                    val_2 = user_input.getText().toString();
                    num2 = Double.parseDouble(val_2);
                    user_input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "root":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;

                /*untuk faktorial pake perulangan i sesuai dr angka yg di input nanti dikurangi 1*/
                case "factorial":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    int i = Integer.parseInt(val_1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    user_input.setText(num1 + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                /*untuk perhitungan sin, cos, tan pake math*/
                case "sin":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.sin(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "cos":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.cos(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "tan":
                    val_1 = user_input.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    user_input.setText(Math.tan(num1) + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;

                /*untuk perhitungan kali, bagi, tambah, kurang
                * pake variabel num1 utk angka pertama, num2 buat angka kedua
                * answer untuk ngitung sesuai operatornya*/
                case "+":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 + num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "-":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 - num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "*":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 * num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
                case "/":
                    val_2 = user_input.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 / num2;
                    user_input.setText(answer + "");
                    sign = null;
                    sign_Box.setText(null);
                    break;
            }

        }
    }

    /*untuk button hapus yang ada gambar x nya, pake function if*/
    public void btn_delete(View view) {
        if (user_input.getText().equals("")) {
            user_input.setText(null);
        } else {
            int len = user_input.getText().length();
            String s = user_input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                has_Dot = false;
                user_input.setText(user_input.getText().subSequence(0, user_input.getText().length() - 1));

            } else {
                user_input.setText(user_input.getText().subSequence(0, user_input.getText().length() - 1));
            }
        }
    }

    /*untuk button clear hapus semua yg simbol C tinggal di set null semua*/
    public void btn_clear(View view) {

        user_input.setText(null);
        sign_Box.setText(null);
        val_1 = null;
        val_2 = null;
        sign = null;
        has_Dot = false;
    }


}
