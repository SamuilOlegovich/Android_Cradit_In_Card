package com.fastloan.model;

import java.util.ArrayList;




public class ObjectCreator {

    public ArrayList<CreditOrganization> createObjects(String inString) {
        ArrayList<CreditOrganization> arrayList = new ArrayList<>();
        String[] strings = inString.split(",\\\"list\":");
        String[] objectsArr = strings[1].split("\\},\\{");
        for (String string : objectsArr) {
            arrayList.add(parseAndCreatedObject(string));
        }
        return arrayList;
    }


    private CreditOrganization parseAndCreatedObject(String in) {
        CreditOrganization creditOrganization = new CreditOrganization();
        String[] strings = in.split("\\},");
        setPercent(creditOrganization, strings[0]);
        setAnother(creditOrganization, strings[4]);
        setAmount(creditOrganization, strings[1]);
        setDetail(creditOrganization, strings[3]);
        setTerm(creditOrganization, strings[2]);
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
        // "license":"№ 2110177000478",
        // "apr":"24%"},
        String[] strings = in.replaceAll("\\{", "").split("\",\"");
//        creditOrganization.setSite(strings[0].replaceAll("\"", "").split("site:")[1]);
//        creditOrganization.setPhone(strings[1].replaceAll("\"", "").split(":")[1]);
//
//        creditOrganization.setEmail(strings[2].replaceAll("\"", "").split(":")[1]);
//        creditOrganization.setAddress(strings[3].replaceAll("\"", "").split(":")[1]);
//        creditOrganization.setLicense(strings[4].replaceAll("\"", "").split(":")[1]);
//        creditOrganization.setApr(strings[5].replaceAll("\"", "")
//                .replaceAll("\\}", "").split(":")[1]);

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i].substring(1);
            if (s.startsWith("detail")) {
                creditOrganization.setSite(s.replaceAll("\"", "").split("site:")[1]);
            } else if (s.startsWith("phone")) {
                creditOrganization.setPhone(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("email")) {
                creditOrganization.setEmail(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("address")) {
                creditOrganization.setAddress(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("license")) {
                creditOrganization.setLicense(s.replaceAll("\"","").split(":")[1]);
            } else if (s.startsWith("apr")) {
                creditOrganization.setApr(s.replaceAll("\"","")
                        .replaceAll("\\}", "").split(":")[1]);
            }
        }
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
