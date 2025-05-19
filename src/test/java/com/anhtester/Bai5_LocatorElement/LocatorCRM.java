package com.anhtester.Bai5_LocatorElement;

public class LocatorCRM {

    //Login page
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String buttonLogin = "//button[@type='submit']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alertErrorMessage = "//div[@id='alerts']/div";

    //Dashboard page
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuCustomer = "//span[normalize-space()='Customer']";
    public static String iconProfile = "//li[contains(@class,'header-user-profile')]";

    //Customer page
    public static String totalInvoicesAwaitingPayment = "(//span[normalize-space()='Invoices Awaiting Payment']/parent::div)/following-sibling::span";
    public static String totalConvertedLeads = "(//span[normalize-space()='Converted Leads']/parent::div)/following-sibling::span";
    public static String totalProjectsInProgress = "(//span[normalize-space()='Projects In Progress']/parent::div)/following-sibling::span";
    public static String totalTasksNotFinished = "(//span[normalize-space()='Tasks Not Finished']/parent::div)/following-sibling::span";
}
