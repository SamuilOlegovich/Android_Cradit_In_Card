package com.fastloan.model;




public class CreditOrganization {
    private String percentFrom;
    private String amountFrom;
    private String percentTo;
    private String amountTo;
    private String termFrom;
    private String termTo;
    // detail
    private String address;
    private String license;
    private String phone;
    private String email;
    private String site;
    private String apr;

    private String offer_name;
    private String offer_id;
    private String top;
    private String img;
    private String url;
    private String cpa;
    private String id;
    // categories
    private String badCreditHistory;
    private String allCredits;
    private String noCalls;
    private String zero;
    private String all;



    public CreditOrganization() {
        this.percentFrom = "0.01";
        this.amountFrom = "3000";
        this.percentTo = "0.05";
        this.amountTo = "7000";
        this.termFrom = "6";
        this.termTo = "9";
        // detail
        this.address = "г. Москва, ул. Василисы Кожиной, д.1, офис Д13";
        this.site = "https://moneyman.ru/";
        this.email = "support@moneyman.ru";
        this.phone = "+7 (495) 744-78-78";
        this.license = "№ 2110177000478";
        this.apr = "24%";
        //
        this.url = "https://go.leadgid.ru/aff_c?offer_id=5024&aff_id=64832";
        this.img = "https://all-credits.com.ua/offers/moneyman.png";
        this.id = "5fb2e270b8f4ea3006c364be";
        this.offer_name = "MoneyMan";
        this.offer_id = "5024";
        this.cpa = "leadgid";
        this.top = "true";
        // categories
        this.badCreditHistory = "false";
        this.allCredits = "true";
        this.noCalls = "true";
        this.zero = "true";
        this.all = "true";
    }





    public String getPercentFrom() {
        return percentFrom;
    }

    public void setPercentFrom(String percentFrom) {
        this.percentFrom = percentFrom;
    }

    public String getPercentTo() {
        return percentTo;
    }

    public void setPercentTo(String percentTo) {
        this.percentTo = percentTo;
    }

    public String getAmountFrom() {
        return amountFrom;
    }

    public void setAmountFrom(String amountFrom) {
        this.amountFrom = amountFrom;
    }

    public String getAmountTo() {
        return amountTo;
    }

    public void setAmountTo(String amountTo) {
        this.amountTo = amountTo;
    }

    public String getTermFrom() {
        return termFrom;
    }

    public void setTermFrom(String termFrom) {
        this.termFrom = termFrom;
    }

    public String getTermTo() {
        return termTo;
    }

    public void setTermTo(String termTo) {
        this.termTo = termTo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getApr() {
        return apr;
    }

    public void setApr(String apr) {
        this.apr = apr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOffer_name() {
        return offer_name;
    }

    public void setOffer_name(String offer_name) {
        this.offer_name = offer_name;
    }

    public String getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCpa() {
        return cpa;
    }

    public void setCpa(String cpa) {
        this.cpa = cpa;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getZero() {
        return zero;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }

    public String getBadCreditHistory() {
        return badCreditHistory;
    }

    public void setBadCreditHistory(String badCreditHistory) {
        this.badCreditHistory = badCreditHistory;
    }

    public String getAllCredits() {
        return allCredits;
    }

    public void setAllCredits(String allCredits) {
        this.allCredits = allCredits;
    }

    public String getNoCalls() {
        return noCalls;
    }

    public void setNoCalls(String noCalls) {
        this.noCalls = noCalls;
    }
}
