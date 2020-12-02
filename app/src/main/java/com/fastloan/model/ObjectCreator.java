package com.fastloan.model;

import java.util.ArrayList;




public class ObjectCreator {

    public ArrayList<CreditOrganization> createObjects(String inString) {
        ArrayList<CreditOrganization> arrayList = new ArrayList<>();
        String[] strings = inString.split(",\\\"list\":");
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        String[] objectsArr = strings[1].split("\\},\\{");
        System.out.println("" + objectsArr.length);
//
        for (String string : objectsArr) {
            arrayList.add(parseAndCreatedObject(string));
        }

        return arrayList;
    }



    private CreditOrganization parseAndCreatedObject(String in) {
        CreditOrganization creditOrganization = new CreditOrganization();
        String[] strings = in.split("\\},");
        setPercent(creditOrganization, strings[0]);
        setAmount(creditOrganization, strings[1]);
        setTerm(creditOrganization, strings[2]);
        setDetail(creditOrganization, strings[3]);
        setAnother(creditOrganization, strings[4]);


//        strings
//        [{"percent":{"from":0, "to":1},
//        "amount":{"from":15000, "to":80000},
//        "term":{"from":5, "to":126},
//        "detail":{"site":"https://moneyman.ru/", "phone":"+7 (495) 744-78-78","email":"support@moneyman.ru",
//        "address":"г. Москва, ул. Василисы Кожиной, д.1, офис Д13", "license":"№ 2110177000478", "apr":"24%"},

//        "_id":"5fc4e8e73f459f1e6efc96ed", "offer_name":"MoneyMan", "offer_id":"5024",
//        "top":true,
//        "img":"https://all-credits.com.ua/offers/moneyman.png",
//        "url":"https://go.leadgid.ru/aff_c?offer_id=5024&aff_id=64832&aff_sub=dengidozp",
//        "cpa":"leadgid",
//        "categories":[]

        String percentFrom;
        String percentTo;
        String amountFrom;
        String amountTo;
        String termFrom;
        String termTo;
        // detail
        String site = "https://moneyman.ru/";
        String phone = "+7 (495) 744-78-78";
        String email = "support@moneyman.ru";
        String address = "г. Москва, ул. Василисы Кожиной, д.1, офис Д13";
        String license = "№ 2110177000478";
        String apr = "24%";

        String id = "5fb2e270b8f4ea3006c364be";
        String offer_name = "MoneyMan";
        String offer_id = "5024";
//        String top = "true";
        String img = "https://all-credits.com.ua/offers/moneyman.png";
        String url = "https://go.leadgid.ru/aff_c?offer_id=5024&aff_id=64832";
        String cpa = "leadgid";
        // categories
        String all = "true";
        String zero = "true";
        String badCreditHistory = "false";
        String allCredits = "true";
        String noCalls = "true";


        return creditOrganization;
    }

    private void setAnother(CreditOrganization creditOrganization, String in) {
        // "_id":"5fc4e8e73f459f1e6efc96ed",
        // "offer_name":"MoneyMan",
        // "offer_id":"5024",
        // "top":true,
        // "img":"https://all-credits.com.ua/offers/moneyman.png",
        // "url":"https://go.leadgid.ru/aff_c?offer_id=5024&aff_id=64832&aff_sub=dengidozp",
        // "cpa":"leadgid",
        // "categories":[]
        String[] strings = in.split(",");
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i].substring(1);
            if (s.startsWith("_id")) {
                creditOrganization.setId(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("offer_name")) {
                creditOrganization.setOffer_name(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("top")) {
                creditOrganization.setTop(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("offer_id")) {
                creditOrganization.setOffer_id(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("img")) {
                creditOrganization.setImg(s.replaceAll("\"", "").replaceAll("img:",""));
            } else if (s.startsWith("url")) {
                creditOrganization.setUrl(s.replaceAll("\"", "").replaceAll("img:",""));
            } else if (s.startsWith("cpa")) {
                creditOrganization.setCpa(s.replaceAll("\"","").split(":")[1]);
            }
        }
    }


    private void setDetail(CreditOrganization creditOrganization, String in) {
        // "detail":{"site":"https://moneyman.ru/",
        // "phone":"+7 (495) 744-78-78",
        // "email":"support@moneyman.ru",
        // "address":"г. Москва, ул. Василисы Кожиной, д.1, офис Д13",
        // "license":"№ 2110177000478", "apr":"24%"},
        String[] strings = in.replaceAll("\\{", "").split("\",\"");
        creditOrganization.setSite(strings[0].replaceAll("\"", "").split("site:")[1]);
        creditOrganization.setPhone(strings[1].replaceAll("\"", "").split(":")[1]);
        creditOrganization.setEmail(strings[2].replaceAll("\"", "").split(":")[1]);
        creditOrganization.setAddress(strings[3].replaceAll("\"", "").split(":")[1]);
        creditOrganization.setLicense(strings[4].replaceAll("\"", "").split(":")[1]);
        creditOrganization.setApr(strings[5].replaceAll("\"", "")
                .replaceAll("\\}", "").split(":")[1]);
    }


    private void setTerm(CreditOrganization creditOrganization, String in) {
        // "term":{"from":5, "to":126},
        String[] strings = in.replaceAll("\\{", "")
                .replaceAll("\"", "").split(",");
        creditOrganization.setTermFrom(strings[0].split(":")[2]);
        creditOrganization.setTermTo(strings[1].split(":")[1]);
    }


    private void setAmount(CreditOrganization creditOrganization, String in) {
        // "amount":{"from":15000, "to":80000},
        String[] strings = in.replaceAll("\\{", "")
                .replaceAll("\"", "").split(",");
        creditOrganization.setAmountFrom(strings[0].split(":")[2]);
        creditOrganization.setAmountTo(strings[1].split(":")[1]);

    }


    private void setPercent(CreditOrganization creditOrganization, String in) {
        // [{"percent":{"from":0, "to":1},
        String[] strings = in.replaceAll("\\[", "")
                .replaceAll("\\{", "").replaceAll("\"", "")
                .split(",");
        creditOrganization.setPercentFrom(strings[0].split(":")[2]);
        creditOrganization.setPercentTo(strings[1].split(":")[1]);
    }
}
