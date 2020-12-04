package com.fastloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

import com.fastloan.model.CreditOrganizationArrayAdapter;
import com.fastloan.model.ObjectCreator;
import com.google.android.material.tabs.TabItem;
import com.fastloan.model.CreditOrganization;
import com.fastloan.model.DataExchange;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    private ArrayList<CreditOrganization> creditOrganizationArrayList1;
    private ArrayList<CreditOrganization> creditOrganizationArrayList2;
    private ArrayList<CreditOrganization> creditOrganizationArrayList3;
    private ArrayList<CreditOrganization> creditOrganizationArrayList4;
    private ArrayList<CreditOrganization> creditOrganizationArrayList;
    private ImageButton infoImageButton;
    private TabItem badCreditButton;
    private TabItem noCallsButton;
    private String networkCountry;
    private TabLayout tabLayout;
    private TabItem zeroButton;
    private ListView listView;
    private TabItem allButton;
    private int countryCode;
    private int list;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataExchange.setMainActivity(this);
        // узнаем страну оператора
        getInfoYouPhone();
        createObjects();
        setButtons();
        setStartList();
        listeners();

//        Toast.makeText(
//                MainActivity.this,
//                "networkCountry: " + networkCountry + ", countryCode: " + countryCode,
//                Toast.LENGTH_LONG
//        ).show();
    }





    private void setStartList() {
        ArrayAdapter<CreditOrganization> adapter = new CreditOrganizationArrayAdapter(this,
                0, creditOrganizationArrayList1);
        listView.setAdapter(adapter);
        // для того чтобы лист показывался сверху вниз
        listView.setSelection(0);
    }



    private void listeners() {
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switchTabs(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }
            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });

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
    }



    private void switchTabs(int in) {
        switch (in) {
            case 0 :
                selectTabButton(creditOrganizationArrayList1);
                list = 1;
                break;
            case 1 :
                selectTabButton(creditOrganizationArrayList2);
                list = 2;
                break;
            case 2 :
                selectTabButton(creditOrganizationArrayList3);
                list = 3;
                break;
            case 3 :
                selectTabButton(creditOrganizationArrayList4);
                list = 4;
                break;
        }
    }


    private void setButtons() {
        infoImageButton = (ImageButton) findViewById(R.id.info_button_head);
        badCreditButton = (TabItem) findViewById(R.id.badCreditHistory);
        noCallsButton = (TabItem) findViewById(R.id.no_calls_button);
        listView = (ListView) findViewById(R.id.list_of_company_tab);
        zeroButton = (TabItem) findViewById(R.id.creditZeroPercent);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        allButton = (TabItem) findViewById(R.id.all);
    }


    private void createObjects() {
        ObjectCreator objectCreator = new ObjectCreator();
        creditOrganizationArrayList
                = new ArrayList<>(objectCreator.createObjects(DataExchange.getString()));
        ArrayList<CreditOrganization> top = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (CreditOrganization creditOrganization : creditOrganizationArrayList) {
            if (creditOrganization.getTop().equals("true")) {
                top.add(creditOrganization);
                integers.add(creditOrganizationArrayList.indexOf(creditOrganization));
            }
        }
        Collections.reverse(integers);
        for (Integer integer : integers) {
            creditOrganizationArrayList.remove(integer);
        }

        creditOrganizationArrayList1 = new ArrayList<>();
        creditOrganizationArrayList2 = new ArrayList<>();
        creditOrganizationArrayList3 = new ArrayList<>();
        creditOrganizationArrayList4 = new ArrayList<>();

        for (CreditOrganization creditOrganization : top) {
            if (creditOrganization.getAll().equalsIgnoreCase("true")) {
                creditOrganizationArrayList1.add(creditOrganization);
            }
            if (creditOrganization.getZero().equalsIgnoreCase("true")) {
                creditOrganizationArrayList2.add(creditOrganization);
            }
            if (creditOrganization.getBadCreditHistory().equalsIgnoreCase("true")) {
                creditOrganizationArrayList3.add(creditOrganization);
            }
            if (creditOrganization.getNoCalls().equalsIgnoreCase("true")) {
                creditOrganizationArrayList4.add(creditOrganization);
            }
        }
        
        for (CreditOrganization creditOrganization : creditOrganizationArrayList) {
            if (creditOrganization.getAll().equalsIgnoreCase("true")) {
                creditOrganizationArrayList1.add(creditOrganization);
            }
            if (creditOrganization.getZero().equalsIgnoreCase("true")) {
                creditOrganizationArrayList2.add(creditOrganization);
            }
            if (creditOrganization.getBadCreditHistory().equalsIgnoreCase("true")) {
                creditOrganizationArrayList3.add(creditOrganization);
            }
            if (creditOrganization.getNoCalls().equalsIgnoreCase("true")) {
                creditOrganizationArrayList4.add(creditOrganization);
            }
        }
        creditOrganizationArrayList.clear();
        integers.clear();
        top.clear();
        list = 1;
    }



    private void getInfoYouPhone() {
        // узнаем страну оператора
        // по буквам украина ua
        TelephonyManager tManager = (TelephonyManager) getBaseContext()
                .getSystemService(Context.TELEPHONY_SERVICE);
        networkCountry = tManager.getNetworkCountryIso();
        DataExchange.setNetworkCountry(networkCountry);
        // по цифрам 255
        Configuration config = getResources().getConfiguration();
        countryCode = config.mcc;
        DataExchange.setCountryCode(countryCode);
//        DataExchange.setCountryCode(255);
    }



    private void selectTabButton(ArrayList<CreditOrganization> in) {
        ArrayAdapter<CreditOrganization> adapter = new CreditOrganizationArrayAdapter(this,
                0, in);
        listView.setAdapter(adapter);
        // для того чтобы лист показывался сверху вниз
        listView.setSelection(0);
    }



    public void showInfoThisTable(int index) {
        if (list == 1) {
            DataExchange.setCreditOrganization(creditOrganizationArrayList1.get(index));
        } else if (list == 2) {
            DataExchange.setCreditOrganization(creditOrganizationArrayList2.get(index));
        } else if (list == 3) {
            DataExchange.setCreditOrganization(creditOrganizationArrayList3.get(index));
        } else if (list == 4) {
            DataExchange.setCreditOrganization(creditOrganizationArrayList4.get(index));
        }

        if (DataExchange.getCountryCode() != 255 || !DataExchange.getNetworkCountry().equals("ua")) {
            Intent intent = new Intent(".InfoCreditPage");
            startActivity(intent);
        } else {
            Intent intent = new Intent(".WebPage");
            startActivity(intent);
        }
    }
}