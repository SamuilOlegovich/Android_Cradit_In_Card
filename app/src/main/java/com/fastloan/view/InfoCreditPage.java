package com.fastloan.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fastloan.R;
import com.fastloan.model.CreditOrganization;
import com.fastloan.model.DataExchange;
import com.fastloan.model.DownloadImageTask;


public class InfoCreditPage extends AppCompatActivity {
    private ImageButton imageButtonBack;
    private TextView link_footer_info;
    private ImageView imageCreditInfo;
    private CheckedTextView address;
    private CheckedTextView licence;
    private CheckedTextView phone;
    private CheckedTextView email;
    private CheckedTextView term;
    private CheckedTextView rate;
    private CheckedTextView web;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_credit_page);

        licence = (CheckedTextView) findViewById(R.id.license_checked_text_view);
        address = (CheckedTextView) findViewById(R.id.address_checked_text_view);
        rate = (CheckedTextView) findViewById(R.id.rate_yea_checked_text_view);
        imageButtonBack = (ImageButton) findViewById(R.id.back_image_button2);
        phone = (CheckedTextView) findViewById(R.id.phone_checked_text_view);
        email = (CheckedTextView) findViewById(R.id.email_checked_text_view);
        imageCreditInfo = (ImageView) findViewById(R.id.image_credit_info);
        term = (CheckedTextView) findViewById(R.id.term_checked_text_view);
        link_footer_info = (TextView) findViewById(R.id.link_footer_info);
        web = (CheckedTextView) findViewById(R.id.web_checked_text_view);
        setData();

        new DownloadImageTask(imageCreditInfo).execute(DataExchange.getCreditOrganization().getImg());

        imageButtonBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                    }
                }
        );

        link_footer_info.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".InfoPage");
                        startActivity(intent);
                    }
                }
        );
    }

    public void setData() {
        CreditOrganization creditOrganization = DataExchange.getCreditOrganization();
        licence.setText("Лицензия " + creditOrganization.getLicense());
        address.setText("\n" + creditOrganization.getAddress());
        phone.setText("+" + creditOrganization.getPhone().replaceAll("\\(", "")
                .replaceAll("\\)", "").replaceAll("-", "")
                .replaceAll(" ", "").replaceAll("\\+", ""));
        email.setText(creditOrganization.getEmail());
        web.setText(creditOrganization.getSite() + "\n");
        licence.setText("\nЛицензия " + creditOrganization.getLicense() + "\n");
        term.setText("\nот " + creditOrganization.getTermFrom() + " - "
                + creditOrganization.getTermTo() + " дней\n");
        rate.setText("\n" + creditOrganization.getApr() + "\n");
    }


    // при нажатии на кнопку назад будем возвращаться назад
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
