package com.itexps.app.gradereportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void onbtnClick(View view){
        // get numbers from components
    //find 3 editText component that we have on form
    EditText edtNum1= (EditText)findViewById(R.id.edtNum1);
    EditText edtNum2= (EditText)findViewById(R.id.edtNum2);
    EditText edtNum3= (EditText)findViewById(R.id.edtNum3);

    //get the integer number of string
    int num1=Integer.parseInt(edtNum1.getText().toString());
    int num2=Integer.parseInt(edtNum2.getText().toString());
    int num3=Integer.parseInt(edtNum3.getText().toString());

    //calculate the result

    //calculate the total of three numbers and assign to TOTAL variable
    int total=num1+num2+num3;

    //calculate the average of three numbers and assign to AVERAGE variable
    float average=total/3;

    //call getFinalGrade
    char finalGrade=getFinalGrade(average);

    //assign the result to the result components

    //find txtTotal, txtAverage, txtFinalGrade
    TextView txtTotal=(TextView)findViewById(R.id.txtTotal);
    TextView txtAverage=(TextView)findViewById(R.id.txtAverage);
    TextView txtFinalGrade=
            (TextView)findViewById(R.id.txtFinalGrade);

    //assign the total, average, final grade variables to txtTotal, txtAverage, txtFinalGrade
    txtTotal.setText(Integer.toString(total));
    txtAverage.setText(Float.toString(average));
    txtFinalGrade.setText(Character.toString(finalGrade));

}
public char getFinalGrade(float average){
        char finalGrade=' ';

        //get the grade based on the average
    if(average>= 95)
        finalGrade='A';
    else if(average>=85 && average<95)
        finalGrade='B';
    else if (average>=70 && average<85)
        finalGrade='C';
    else if (average>=50 && average<70)
        finalGrade='D';
    else if (average<50)
        finalGrade='F';

    //return the grade
    return finalGrade;

}
}
