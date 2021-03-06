package com.fastloan.model;

import com.fastloan.MainActivity;

public class DataExchange {
    // private static String stringDataApi = "{\"_id\":\"5fad192b3284308fe4ba22c7\",\"appId\":\"com.orkotkreditru\",\"__v\":0,\"categories\":[{\"label\":\"Все кредиты\",\"value\":\"allCredits\"},{\"label\":\"Без звонков\",\"value\":\"noCalls\"},{\"label\":\"С плохой К.И.\",\"value\":\"badHistory\"}],\"list\":[{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":15000,\"to\":80000},\"term\":{\"from\":5,\"to\":126},\"detail\":{\"site\":\"https://moneyman.ru/\",\"phone\":\"+7 (495) 744-78-78\",\"email\":\"support@moneyman.ru\",\"address\":\"г. Москва, ул. Василисы Кожиной, д.1, офис Д13\",\"license\":\"№ 2110177000478\",\"apr\":\"24%\"},\"_id\":\"5fb2e270b8f4ea3006c364be\",\"offer_name\":\"MoneyMan\",\"offer_id\":\"5024\",\"top\":true,\"img\":\"https://all-credits.com.ua/offers/moneyman.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=5024&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true,\"noCalls\":true}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":15000,\"to\":100000},\"term\":{\"from\":5,\"to\":181},\"detail\":{\"site\":\"https://lk.denga.ru/lp/\",\"phone\":\"8 800 700 08 08\",\"email\":\"help@dengabank.ru\",\"address\":\"г.Новосибирск, ул. Октябрьская магистраль д. 3, оф.906\",\"license\":\"ОГРН: 1134205019189 / Свидетельство №651303532004088\",\"apr\":\"24%\"},\"_id\":\"5fb2e270b8f4ea3006c364bf\",\"offer_name\":\"Деньга\",\"offer_id\":\"5158\",\"img\":\"https://all-credits.com.ua/offers/denga.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=5158&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true,\"badHistory\":true},\"isHidden\":true},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":30000,\"to\":30000},\"term\":{\"from\":7,\"to\":30},\"detail\":{\"site\":\"https://www.zaymer.ru/\",\"phone\":\"8-800-7070-24-7\",\"email\":\"support@zaymer.ru\",\"address\":\"г.Новосибирск, ул. Октябрьская магистраль д. 3, оф.906\",\"license\":\"ОГРН: 1134205019189 / Свидетельство №651303532004088\",\"apr\":\"24%\"},\"_id\":\"5fb2e270b8f4ea3006c364c0\",\"offer_name\":\"Займер\",\"offer_id\":\"1621\",\"img\":\"https://all-credits.com.ua/offers/zaymer.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=1621&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true,\"noCalls\":true}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":20000,\"to\":100000},\"term\":{\"from\":1,\"to\":365},\"detail\":{\"site\":\"https://dozarplati.com/\",\"phone\":\"8 (812) 777-78-72\",\"email\":\"support@dozarplati.ru\",\"address\":\"190031, г. Санкт-Петербург, пер. Спасский, д. 14/35, лит. А, пом. 38 Н.\",\"license\":\"№651403140005467\",\"apr\":\"24%\"},\"_id\":\"5fb2e270b8f4ea3006c364c1\",\"offer_name\":\"До Зарплаты\",\"offer_id\":\"2323\",\"img\":\"https://all-credits.com.ua/offers/dozarplati.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=2323&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true,\"noCalls\":true}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":30000,\"to\":30000},\"term\":{\"from\":7,\"to\":30},\"detail\":{\"site\":\"https://creditseven.ru/\",\"phone\":\"8 (800) 222-80-22\",\"email\":\"info@mishkamoney.ru\",\"address\":\"г. Самара, ул. Авроры, д. 150, помещение №н4, офис 306.3\",\"license\":\"№ 1903475009492\",\"apr\":\"24%\"},\"_id\":\"5fb2e270b8f4ea3006c364c2\",\"offer_name\":\"Credit7\",\"offer_id\":\"4470\",\"img\":\"https://all-credits.com.ua/offers/logo-credit7.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=4470&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true,\"noCalls\":true}},{\"percent\":{\"from\":0.1,\"to\":1},\"amount\":{\"from\":15000,\"to\":50000},\"term\":{\"from\":7,\"to\":168},\"detail\":{\"site\":\"https://turbozaim.ru/\",\"phone\":\"8-499-951-9180\",\"email\":\"support@turbozaim.com\",\"address\":\"123290, г. Москва, тупик Магистральный 1-й, д. 11, стр.10\",\"license\":\"№651303045003951\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364c3\",\"offer_name\":\"Турбозайм\",\"offer_id\":\"2577\",\"img\":\"https://all-credits.com.ua/offers/turbozaym.png\",\"top\":false,\"url\":\"https://go.leadgid.ru/aff_c?offer_id=2577&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":10000,\"to\":100000},\"term\":{\"from\":1,\"to\":30},\"detail\":{\"site\":\"https://www.payps.ru/landings/r/#calc\",\"phone\":\"8 800 555 2435\",\"email\":\"support@payps.ru\",\"address\":\"127083, г. Москва, ул. 8 Марта, д. 1, стр. 12, этаж 10, пом. LVI, ком. 2-7\",\"license\":\"1187958478551\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364c4\",\"offer_name\":\"Pay P.S.\",\"offer_id\":\"4412\",\"img\":\"https://all-credits.com.ua/offers/payps.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=4412&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true,\"noCalls\":true}},{\"percent\":{\"from\":0.1,\"to\":1},\"amount\":{\"from\":20000,\"to\":30000},\"term\":{\"from\":16,\"to\":30},\"detail\":{\"site\":\"https://web-zaim.ru/\",\"phone\":\"8-800-700-8706\",\"email\":\"info@web-zaim.ru\",\"address\":\"630091, г. Новосибирск, ул. Державина, д. 28, офис 302\",\"license\":\"№ 2110827000326\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364c5\",\"top\":false,\"offer_name\":\"Веб-займ\",\"offer_id\":\"2973\",\"img\":\"https://all-credits.com.ua/offers/webzaym.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=2973&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true,\"noCalls\":true,\"badHistory\":true}},{\"percent\":{\"from\":0.1,\"to\":1},\"amount\":{\"from\":30000,\"to\":30000},\"term\":{\"from\":7,\"to\":30},\"detail\":{\"site\":\"https://fastmoney.ru/\",\"phone\":\"8 (812)383-11-17\",\"email\":\"info@fastmoney.ru\",\"address\":\"г. Москва, 1-й Магистральный туп., д.21 стр.10.\",\"license\":\"1187847178551\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364c6\",\"offer_name\":\"FastMoney\",\"offer_id\":\"4029\",\"img\":\"https://all-credits.com.ua/offers/fastmoneyru.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=4029&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"allCredits\":true}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":15000,\"to\":30000},\"term\":{\"from\":5,\"to\":30},\"detail\":{\"site\":\"https://www.moneza.ru/\",\"phone\":\"+7(495) 968-7654\",\"email\":\"info@moneza.ru\",\"address\":\"115114, г. Москва, Улица Летниковская, Дом 10c4, Пом. I Ком. 15.\",\"license\":\"№ 1167746181790\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364c7\",\"offer_name\":\"Moneza\",\"offer_id\":\"1983\",\"img\":\"https://all-credits.com.ua/offers/moneza.png\",\"top\":false,\"url\":\"https://go.leadgid.ru/aff_c?offer_id=1983&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":30000,\"to\":100000},\"term\":{\"from\":16,\"to\":30},\"detail\":{\"site\":\"https://www.robotmoney.ru/\",\"phone\":\"8 (495) 968-50-58\",\"email\":\"info@mishkamoney.ru\",\"address\":\"г. Москва, ул. Тверская 28 корпус 2 офис 1\",\"license\":\"№ 1803045008992\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364c8\",\"offer_name\":\"Robotmoney\",\"offer_id\":\"5046\",\"img\":\"https://all-credits.com.ua/offers/robotmoney.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=5046&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"badHistory\":true}},{\"percent\":{\"from\":0,\"to\":9.9e+51},\"amount\":{\"from\":20000,\"to\":70000},\"term\":{\"from\":10,\"to\":168},\"detail\":{\"site\":\"https://www.lime-zaim.ru/\",\"phone\":\"+7 (383) 207-98-89\",\"email\":\"\u200Esupport@lime-zaim.ru\",\"address\":\"Новосибирская область, г. Новосибирск, ул. Кирова, д. 48, оф. 1401\",\"license\":\"№ 651303045004102\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364c9\",\"offer_name\":\"Lime\",\"offer_id\":\"5178\",\"img\":\"https://all-credits.com.ua/offers/lime.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=5178&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"noCalls\":true,\"badHistory\":true}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":50000,\"to\":100000},\"term\":{\"from\":1,\"to\":50},\"detail\":{\"site\":\"https://kometazaim.ru/\",\"phone\":\"+74959685058\",\"email\":\"kometazaim@inbox.ru\",\"address\":\"г. Москва, ул. Тверская 28 корпус 2 1/III/3\",\"license\":\"№ 1207700188189\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364ca\",\"offer_name\":\"Комета Займ\",\"offer_id\":\"5175\",\"img\":\"https://all-credits.com.ua/offers/kometazaym.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=5175&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false,\"badHistory\":true}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":15000,\"to\":30000},\"term\":{\"from\":7,\"to\":30},\"detail\":{\"site\":\"https://www.ezaem.ru/\",\"phone\":\"8 (800) 600-5500\",\"email\":\"info@ezaem.ru\",\"address\":\"115114, г. Москва, Улица Летниковская, дом 10c4, пом. I, часть ком. 15.\",\"license\":\"№ 651303045003161\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364cb\",\"offer_name\":\"Е заем\",\"offer_id\":\"2175\",\"img\":\"https://all-credits.com.ua/offers/ezaem.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=2175&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":15000,\"to\":30000},\"term\":{\"from\":5,\"to\":31},\"detail\":{\"site\":\"https://webbankir.com/\",\"phone\":\"8 800 775-54-54\",\"email\":\"info@webbankir.com\",\"address\":\"125466, г. Москва, ул. Соколово-Мещерская, д. 29, оф. 308\",\"license\":\"№ 2120177002077\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364cc\",\"offer_name\":\"Webbankir\",\"offer_id\":\"3127\",\"img\":\"https://all-credits.com.ua/offers/webbankir.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=3127&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false}},{\"percent\":{\"from\":0,\"to\":1},\"amount\":{\"from\":30000,\"to\":80000},\"term\":{\"from\":5,\"to\":30},\"detail\":{\"site\":\"https://www.otlnal.ru/\",\"phone\":\"8 800 600 7000\",\"email\":\"info@otlnal.ru\",\"address\":\"г. Москва, ул. Тверская 28 корпус 2 офис 1\",\"license\":\"№ 1803045008992\",\"apr\":\"24%\"},\"_id\":\"5fb2e271b8f4ea3006c364cd\",\"offer_name\":\"Отличные Наличные\",\"offer_id\":\"4644\",\"img\":\"https://all-credits.com.ua/offers/onlichnienalichnie.png\",\"url\":\"https://go.leadgid.ru/aff_c?offer_id=4644&aff_id=64832\",\"cpa\":\"leadgid\",\"categories\":{\"all\":true,\"zero\":true,\"badCreditHistory\":false}}]}";
    private static String urlApi = "https://api.orbitrush.com/offers?appId=com.orkotkreditru";
    private static CreditOrganization creditOrganization;
    private static MainActivity mainActivity;
    private static String networkCountry;
    private static String stringDataApi;
    private static String androidID;
    private static int countryCode;
    private static String stringReplace = "https://go.leadgid.ru/aff_c?aff_id=64832&offer_id={offer_id}aff_sub={client_id}&aff_sub2={adv ertising_id}&aff_sub3={app}&aff_sub4={source}&aff_sub={campaign}";

    private static final String PERCENT_IN_DAY = "% в день";
    private static final String READ_MORE = "ПОДРОБНЕЕ";
    private static final String TERM = "61 - 365 дней";
    private static final String DAY = "  дней";
    private static final String GRN = " грн";




    public static String getAndroidID() {
        return androidID;
    }

    public static void setAndroidID(String androidID) {
        DataExchange.androidID = androidID;
    }

    public static String getPERCENT_IN_DAY() {
        return PERCENT_IN_DAY;
    }

    public static String getREAD_MORE() {
        return READ_MORE;
    }

    public static String getTERM() {
        return TERM;
    }

    public static String getDAY() {
        return DAY;
    }

    public static String getGRN() {
        return GRN;
    }

    public static String getUrlApi() {
        return urlApi;
    }

    public static void setUrlApi(String urlApi) {
        DataExchange.urlApi = urlApi;
    }

    public static String getStringDataApi() {
        return stringDataApi;
    }

    public static void setStringDataApi(String stringDataApi) {
        DataExchange.stringDataApi = stringDataApi;
    }

    public static String getNetworkCountry() {
        return networkCountry;
    }

    public static void setNetworkCountry(String networkCountry) {
        DataExchange.networkCountry = networkCountry;
    }

    public static int getCountryCode() {
        return countryCode;
    }

    public static void setCountryCode(int countryCode) {
        DataExchange.countryCode = countryCode;
    }

    public static CreditOrganization getCreditOrganization() {
        return creditOrganization;
    }

    public static void setCreditOrganization(CreditOrganization creditOrganization) {
        DataExchange.creditOrganization = creditOrganization;
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        DataExchange.mainActivity = mainActivity;
    }
}
