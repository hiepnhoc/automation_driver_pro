package com.tpf.automation.tpf_automation.fpt;

import com.tpf.automation.tpf_automation.AutomationConstant;
import com.tpf.automation.tpf_automation.element.finnone.*;
import com.tpf.automation.tpf_automation.entity.*;
import com.tpf.automation.tpf_automation.error.CustomerErrorResponse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.tpf.automation.tpf_automation.AutomationConstant.driverPath;
import static com.tpf.automation.tpf_automation.AutomationConstant.driverProperty;

public class FptAutoSearchApp {
    public void FptSearch(FptCustomer fptCustomer) throws InterruptedException {

        FptLoanDetail fptLoanDetail = fptCustomer.getLoanDetail();
        List<FptAddress> fptAddresses = fptCustomer.getAddresses();
        List<FptProductDetail> fptProductDetails = fptCustomer.getProductDetails();
        List<FptReference> fptReferences = fptCustomer.getReferences();

        //region OPEN WEB BROWSER
        System.setProperty(driverProperty, driverPath);
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //options.addArguments("window-size=2560x1440");
        WebDriver driver = new ChromeDriver(options);
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();


        driver.get(AutomationConstant.finnOnePROD);


        driver.manage().window().maximize();



        //endregion

        //region LOGIN PAGE
        LoginFptWait loginFptWait = new LoginFptWait(driver,customerErrorResponse);
        loginFptWait.getUsername().sendKeys("autofpt_1");
        loginFptWait.getPassword().sendKeys("Abc@12345*#");
        loginFptWait.getBtnLogin().click();
        //endregion

        //region CHOOSE APPLICATIONS TO SEARCH
        MainFptWait mainFptWait = new MainFptWait(driver,customerErrorResponse);
        mainFptWait.getMenuApplications("CLICK MAIN MENU", "CLICK MAIN MENU").click();
        mainFptWait.getSubmenuApplications("CLICK SUB APP MENU", "CLICK SUB APP MENU").click();
        //endregion


        //region SEARCH APPLICATION ID
        SearchApplicationWait searchApplicationWait = new SearchApplicationWait(driver,customerErrorResponse);
        WebDriverWait wait11 = new WebDriverWait(driver,10);
        searchApplicationWait.getSearchTextBox().sendKeys("APPL00181363");
        searchApplicationWait.getClickSearchResult("APPL00181363").click();

        System.out.println(searchApplicationWait.getAppInfo().getText().trim() + " Quang la day");
        /*WebDriverWait wait1111 = new WebDriverWait(driver,10);
        WebElement test = wait1111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"applicantIdHeader\"]/span")));
        System.out.println(test.getText().trim());*/
        //endregion


        //region CLICK TO VIEW AND EDIT LEAD DETAILS
        LeadDetailsEditViewWait leadDetailsEditViewWait = new LeadDetailsEditViewWait(driver,customerErrorResponse);
        leadDetailsEditViewWait.getEdit_customer_inDetail_0().click();
        //endregion


        //region CLICK LEFT VERTICAL TAB EMPLOYMENT DETAILS
        LeadDetailsAppInfoWait leadDetailsAppInfoWait = new LeadDetailsAppInfoWait(driver,customerErrorResponse);
        leadDetailsAppInfoWait.getCustomerMainChildTabs_employment_tab("EMPOLYMENT DETAILS","DETAILS").click();
        System.out.println("Test Quang");
        //System.out.println(leadDetailsAppInfoWait.getAppInfo().getText().trim());
        //endregion

//        /**
//         * @param List<String> testLeadDetailsAppInfo
//         * @size 8 [0-7]
//         * @detail [0: Branch , 1: Channel, 2: Application Form Number, 3: Loan Application Type,
//         * 4: Product Name, 5: Scheme, 6: Loan Amount Requested, 7: Sales Agent Code]
//         * @fpt_exp_data: ("FPT", "FPT", "2135", "New Application", "CDL_CASH", "product", "loanAmount", "tenure", "OTHER VALUE")
//         * @default: Interest Rate: default based on scheme, Loan Term(months): 12 (should be modified)
//         * Branch: FPT, Channel: FPT, Application Form Number: 2135, Product Name: CDL_CASH, Sales Agent Code: OTHER VALUE
//         */
//        //region LEAD DETAILS -> LOAN DETAILS
//        List<String> testLeadDetailsAppInfo = new ArrayList<>();
//        //testLeadDetailsAppInfo = Arrays.asList("FPT","FPT","2135","New Application","CDL_CASH","CD02_SAMSUNG","17242500","12","OTHER VALUE");
//        String appFormNumber = fptCustomer.getCustId().trim();
//        System.out.println("Loan Amount: " + fptLoanDetail.getLoanAmount());
//        System.out.println("Tenor : " + fptLoanDetail.getTenor());
//        testLeadDetailsAppInfo = Arrays.asList("FPT","FPT",appFormNumber,"New Application","CDL_CASH",fptLoanDetail.getProduct(),fptLoanDetail.getLoanAmount(),fptLoanDetail.getTenor(),"OTHER VALUE");
//        leadDetailsAppInfoWait.btnLoanDetails("LEAD DETAILS", "LOAN DETAILS");
//        LeadDetailsLoanDetailsWait leadDetailsLoanDetailsWait = new LeadDetailsLoanDetailsWait(driver,customerErrorResponse);
//        leadDetailsLoanDetailsWait.inputSourcing("LEAD DETAILS -> LOAN DETAILS",testLeadDetailsAppInfo);
//        //endregion
//        System.out.println("autofpt_1" + " LEAD DETAILS -> LOAN DETAILS DONE");
//
//        /**
//         * @param List<String> test_ref
//         * @size 3 [0-2]
//         * @detail [0: Full Name , 1: Relationship with Borrower, 2: Mobile Phone Number]
//         * @fpt_exp_data: ("fullName", "relation", "phoneNumber")
//         * @default: no default
//         */
//        //region LEAD DETAILS -> REFERENCES
//        List<List> test_ref = new ArrayList<>();
//        //List<String> a6 = Arrays.asList("BÙI VĂN VỆ","Relative","373298133");
//        //List<String> b6 = Arrays.asList("HOÀNG THỊ TỐ NGA","Colleague","335990151");
//        for (FptReference fptReference : fptReferences
//        ) {
//            if(!fptReference.getRelation().equals("Spouse")){
//                test_ref.add(Arrays.asList(fptReference.getFullName(),fptReference.getRelation(),fptReference.getPhoneNumber()));
//            }
//            //test_ref.add(Arrays.asList(fptReference.getFullName(),fptReference.getRelation(),fptReference.getPhoneNumber()));
//        }
//        System.out.println("Ref Size is: " + test_ref.size());
//        //test_ref.add(a6);
//        //test_ref.add(b6);
//        leadDetailsAppInfoWait.btnReferences("LEAD DETAILS", "REFERENCES");
//        LeadDetailsReferencesWait leadDetailsReferencesWait = new LeadDetailsReferencesWait(driver,customerErrorResponse);
//        leadDetailsReferencesWait.inputReferences("LEAD DETAILS -> REFERENCES",test_ref);
//        //endregion
//        System.out.println("autofpt_1" + " LEAD DETAILS -> REFERENCES DONE");
//
//        /**
//         * @param List<String> test_dtl
//         * @size 7 [0-6]
//         * @detail [0: Loan Purpose , 1: Number of dependents, 2: Monthly Rental/Mortgage Payment Cost, 3: House Ownership
//         * 4: New bank Card Number, 5: Sales Agent Code, 6: Max requested interest rate]
//         * @fpt_exp_data: ("Education, sports", "0", "0", "Rented", "1111111111111111", "62")
//         * @default: Max requested interest rate: 62
//         * Number of dependents: 0, Monthly Rental/Mortgage Payment Cost: 0
//         * Loan Purpose: Education, sports, New bank Card Number: 1111111111111111
//         */
//        //region LEAD DETAILS -> MISC - FRMPDAPTL
//        List<String> test_dtl = new ArrayList<>();
//        //test_dtl = Arrays.asList("Education, sports","0","0","Rented","1111111111111111","FPT000001","62");
//        test_dtl = Arrays.asList("Other","0","0","Rented","1111111111111111",fptCustomer.getDsaCode(),"62");
//        leadDetailsAppInfoWait.btnMiscAppDtl("LEAD DETAILS", "MISC - FRMAPPDTL");
//        LeadDetailsAppDtlWait leadDetailsAppDtlWait = new LeadDetailsAppDtlWait(driver,customerErrorResponse);
//        leadDetailsAppDtlWait.inputFrmAppDtl("LEAD DETAILS -> MISC - FRMAPPDTL",test_dtl);
//        System.out.println("autofpt_1" + " LEAD DETAILS -> MISC - FRMPDAPTL DONE");



    }
}
