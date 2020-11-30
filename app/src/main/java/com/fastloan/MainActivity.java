package com.fastloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.fastloan.model.CreditOrganization;
import com.fastloan.model.CreditOrganizationArrayAdapter;
import com.fastloan.model.DataExchange;

import java.util.ArrayList;




public class MainActivity extends AppCompatActivity {
    private ArrayList<CreditOrganization> creditOrganizationArrayList;
    private ImageButton infoImageButton;
    private String networkCountry;
    private ListView listView;
    private int countryCode;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataExchange.setMainActivity(this);

        // узнаем страну оператора
        // по буквам украина ua
        TelephonyManager tManager = (TelephonyManager) getBaseContext()
                .getSystemService(Context.TELEPHONY_SERVICE);
        networkCountry = tManager.getNetworkCountryIso();
        // по цифрам 255
        Configuration config = getResources().getConfiguration();
        countryCode = config.mcc;


        creditOrganizationArrayList = new ArrayList<>();
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());

        infoImageButton = (ImageButton) findViewById(R.id.info_button_head);
        listView = (ListView) findViewById(R.id.list_of_company_tab);

        ArrayAdapter<CreditOrganization> adapter = new CreditOrganizationArrayAdapter(this,
                0, creditOrganizationArrayList);
        listView.setAdapter(adapter);
        // для того чтобы лист показывался сверху вниз
        listView.setSelection(0);
        infoImageButton.setOnClickListener(
                // Окна с вопросом и действиями
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // класс для перехода на другую страницу
                        Intent intent = new Intent(".InfoPage");
                        startActivity(intent);
                    }
                }
        );

        Toast.makeText(
                MainActivity.this,
                "networkCountry: " + networkCountry + ", countryCode: " + countryCode,
                Toast.LENGTH_LONG
        ).show();

    }


    public void showInfoThisTable(int index) {
        DataExchange.setCreditOrganization(creditOrganizationArrayList.get(index));
        Intent intent = new Intent(".InfoCreditPage");
        startActivity(intent);
    }



}