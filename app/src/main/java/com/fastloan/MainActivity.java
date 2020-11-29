package com.fastloan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.fastloan.model.CreditOrganization;
import com.fastloan.model.CreditOrganizationArrayAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ArrayList<CreditOrganization> creditOrganizationArrayList;
    private ImageButton infoImageButton;
    private RecyclerView recyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        creditOrganizationArrayList = new ArrayList<>();
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());
        creditOrganizationArrayList.add(new CreditOrganization());

        infoImageButton = (ImageButton) findViewById(R.id.info_button_head);

        list();
    }

    private void list() {
        ArrayAdapter<CreditOrganization> adapter = new CreditOrganizationArrayAdapter(this,
                0, creditOrganizationArrayList);

        ListView listView = (ListView) findViewById(R.id.list_of_company_tab);
        listView.setAdapter(adapter);

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


        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // получаем позицию из списка которую выблали
                        int pos = (int) listView.getItemAtPosition(position);
                        Button b = (Button) findViewById(pos);
//                                findViewById(R.id.button);
//                        String val = (String) listView.getItemAtPosition(position);

                        b.setOnClickListener(
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
//
                    }
                }
        );


    }
}