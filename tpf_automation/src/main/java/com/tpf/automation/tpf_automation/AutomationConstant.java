package com.tpf.automation.tpf_automation;

import com.tpf.automation.tpf_automation.entity.FptCustomer;
import com.tpf.automation.tpf_automation.entity.momo.MomoData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutomationConstant {
    public static String driverProperty = "webdriver.chrome.driver";
    public static String driverPath = "c:\\driver\\chromedriver.exe";

    public static String cicUsername = "h01358001trinh";
    public static String cicPassword = "Datacheck2018";

    public static String finnOneUAT = "http://10.1.66.20:4141/finnone-webapp/app/auth/login";
    public static String finnOnePROD = "http://10.1.64.22:4141/finnone-webapp/app/auth/login";
    public static String driverWindowSize = "window-size=1366x768";
    public static String driverWindowSizeFpt = "window-size=1800x3000";

    public static int globalWait = 180;

    public static String pathCapture = "C:/logpic/error_time_.png";

    public static List<List> userId = new ArrayList<>();
    private static List<String> user1 = Arrays.asList("fpt_auto1","Fpt@12345","false");
    private static List<String> user2 = Arrays.asList("fpt_auto2","Fpt@12345","false");
    private static List<String> user3 = Arrays.asList("fpt_auto3","Fpt@12345","false");
    private static List<String> user4 = Arrays.asList("fpt_auto4","Fpt@12345","false");
    private static List<String> user5 = Arrays.asList("fpt_auto5","Fpt@12345","false");
    private static List<String> user6 = Arrays.asList("fpt_auto6","Fpt@12345","false");
    private static List<String> user7 = Arrays.asList("fpt_auto7","Fpt@12345","false");
    private static List<String> user8 = Arrays.asList("fpt_auto8","Fpt@12345","false");
    private static List<String> user9 = Arrays.asList("fpt_auto9","Fpt@12345","false");
    private static List<String> user10 = Arrays.asList("fpt_auto10","Fpt@12345","false");


    public static List<FptCustomer> customerQueue = new ArrayList<>();

    //--------------------- MOMO ------------------//
    public static List<List> userIdMomo = new ArrayList<>();
    public static List<MomoData> customerMomoQueue = new ArrayList<>();
    private static List<String> userMomo1 = Arrays.asList("momo_auto1","Fpt@12345","false");
    private static List<String> userMomo2 = Arrays.asList("momo_auto2","Fpt@12345","false");
    private static List<String> userMomo3 = Arrays.asList("momo_auto3","Fpt@12345","false");
    private static List<String> userMomo4 = Arrays.asList("momo_auto4","Fpt@12345","false");
    private static List<String> userMomo5 = Arrays.asList("momo_auto5","Fpt@12345","false");
    private static List<String> userMomo6 = Arrays.asList("momo_auto6","Fpt@12345","false");
    private static List<String> userMomo7 = Arrays.asList("momo_auto7","Fpt@12345","false");
    private static List<String> userMomo8 = Arrays.asList("momo_auto8","Fpt@12345","false");
    private static List<String> userMomo9 = Arrays.asList("momo_auto9","Fpt@12345","false");
    private static List<String> userMomo10 = Arrays.asList("momo_auto10","Fpt@12345","false");

    public static void initUserMomo () {
        userIdMomo.add(userMomo1);
        userIdMomo.add(userMomo2);
        userIdMomo.add(userMomo3);
        userIdMomo.add(userMomo4);
        userIdMomo.add(userMomo5);
        userIdMomo.add(userMomo6);
        userIdMomo.add(userMomo7);
        userIdMomo.add(userMomo8);
        userIdMomo.add(userMomo9);
        userIdMomo.add(userMomo10);
    }

    public static void
    initUser () {
        userId.add(user1);
        userId.add(user2);
        userId.add(user3);
        userId.add(user4);
        userId.add(user5);
        userId.add(user6);
        userId.add(user7);
        userId.add(user8);
        userId.add(user9);
        userId.add(user10);
    }

    public static List<List> userId1 = new ArrayList<>();
    private static List<String> user11 = Arrays.asList("auto_11","Hcm@12345","false");
    /*private static List<String> user21 = Arrays.asList("auto_21","Hcm@12345","false");
    private static List<String> user31 = Arrays.asList("auto_31","Hcm@12345","false");
    private static List<String> user41 = Arrays.asList("auto_41","Hcm@12345","false");
    private static List<String> user51 = Arrays.asList("auto_51","Hcm@12345","false");*/

    //public static List<FptCustomer> customerQueue = new ArrayList<>();

    public static void initUser1 () {
        userId1.add(user11);
       /* userId1.add(user21);
        userId1.add(user31);
        userId1.add(user41);
        userId1.add(user51);*/
    }






}
