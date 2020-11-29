package com.fastloan.model;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fastloan.R;
import com.fastloan.model.CreditOrganization;

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


    public View getView(int position, View convertView, ViewGroup parent) {

        //get the property we are displaying
        CreditOrganization creditOrganization = creditOrganizationList.get(position);

        //get the inflater and inflate the XML layout for each item
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.table, null);

        TextView oneCredit = (TextView) view.findViewById(R.id.one_credit);
        TextView repeatedCredit = (TextView) view.findViewById(R.id.repeated_credit_data);
        TextView oneCreditData = (TextView) view.findViewById(R.id.one_credit_data);
        TextView repeatedCreditData = (TextView) view.findViewById(R.id.repeated_credit_data);
        TextView creditZeroPercent = (TextView) view.findViewById(R.id.creditZeroPercent);
        TextView term = (TextView) view.findViewById(R.id.term_data);
        TextView rate = (TextView) view.findViewById(R.id.rate_data);
        ImageView image = (ImageView) view.findViewById(R.id.image_logo);


        //set address and description
        oneCreditData.setText(creditOrganization.getAmountFrom() + " грн");
        repeatedCredit.setText(creditOrganization.getAmountTo() + " грн");
        term.setText(creditOrganization.getTermFrom() + " - " + creditOrganization.getTermTo() + " дней");
        rate.setText(creditOrganization.getApr() + " в день");



        //display trimmed excerpt for description
//        int descriptionLength = creditOrganizationList.getDescription().length();
//        if(descriptionLength >= 100){
//            String descriptionTrim = creditOrganizationList.getDescription().substring(0, 100) + "...";
//            description.setText(descriptionTrim);
//        }else{
//            description.setText(creditOrganizationList.getDescription());
//        }


        //get the image associated with this property
        int imageID = context.getResources().getIdentifier("logo_credit7", "drawable", context.getPackageName());
        image.setImageResource(imageID);

        return view;
    }
}
