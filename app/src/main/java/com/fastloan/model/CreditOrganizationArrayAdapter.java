package com.fastloan.model;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fastloan.R;

import java.util.ArrayList;
import java.util.List;



public class CreditOrganizationArrayAdapter extends ArrayAdapter<CreditOrganization> {
    private List<CreditOrganization> creditOrganizationList;
    private Context context;

    public CreditOrganizationArrayAdapter(Context context, int resource, ArrayList<CreditOrganization> creditOrganizationList) {
        super(context, resource, creditOrganizationList);
        this.creditOrganizationList = creditOrganizationList;
        this.context = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //get the property we are displaying
        CreditOrganization creditOrganization = creditOrganizationList.get(position);

        //get the inflater and inflate the XML layout for each item
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.table, null);

        TextView repeatedCredit = (TextView) view.findViewById(R.id.repeated_credit_data);
        TextView oneCreditData = (TextView) view.findViewById(R.id.one_credit_data);
        TextView term = (TextView) view.findViewById(R.id.term_data);
        TextView rate = (TextView) view.findViewById(R.id.rate_data);
        ImageView image = (ImageView) view.findViewById(R.id.image_logo);
        Button button = (Button) view.findViewById(R.id.button_table);
        View buttonView = view.findViewById(R.id.button_table);

        //set address and description
        oneCreditData.setText(creditOrganization.getAmountFrom() + DataExchange.getGRN());
        repeatedCredit.setText(creditOrganization.getAmountTo() + DataExchange.getGRN());
        term.setText(creditOrganization.getTermFrom() + " - " + creditOrganization.getTermTo() + DataExchange.getDAY());
        rate.setText(((Integer.parseInt(creditOrganization.getApr().replaceAll("%", ""))
                * 100) / 365) / 100.0 + DataExchange.getPERCENT_IN_DAY());

        new DownloadImageTask(image).execute(creditOrganization.getImg());

        if (DataExchange.getCountryCode() != 255 || !DataExchange.getNetworkCountry().equals("ua")) {
            term.setText(DataExchange.getTERM());
            button.setText(DataExchange.getREAD_MORE());
        }

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // класс для перехода на другую страницу

                DataExchange.getMainActivity().showInfoThisTable(position);
            }
        });

        return view;
    }
}
