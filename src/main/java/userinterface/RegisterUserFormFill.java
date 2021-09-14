package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUserFormFill {

    public static final Target INPUT_FIRS_NAME = Target.the("input field first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("input field last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("input field email").located(By.id("email"));
    public static final Target INPUT_MONT = Target.the("input field birth mont").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("input field birth day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("input field birth year").located(By.id("birthYear"));
    public static final Target INPUT_LENGUAGES = Target.the("input field lenguages").located(By.className("ui-select-search"));
    public static final Target BTN_NEXT = Target.the("button next page").located(By.xpath("//a[@class='btn btn-blue']"));

    public static final Target INPUT_CITY = Target.the("input field city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("input field postal code").located(By.id("zip"));
    public static final Target CLICK_COUNTRY = Target.the("country click").located(By.xpath("//div[@name='countryId']"));
    public static final Target INPUT_COUNTRY = Target.the("input field country").located(By.xpath("//div[@name='countryId']/input[@type='search']"));
    public static final Target BTN_NEXT_DEVICES = Target.the("button next page").located(By.xpath("//div[@class='pull-right next-step']/a"));

    public static final Target CLICK_COMPUTER = Target.the("computer os click").located(By.xpath("//div[@name='osId']"));
    public static final Target INPUT_COMPUTER = Target.the("input field computer os").located(By.xpath("//div[@name='osId']/input[@type='search']"));
    public static final Target CLICK_VERSION = Target.the("computer os version click").located(By.xpath("//div[@name='osVersionId']"));
    public static final Target INPUT_VERSION = Target.the("input field computer os").located(By.xpath("//div[@name='osVersionId']/input[@type='search']"));
    public static final Target CLICK_LENGUAGE_SELECT = Target.the("computer os lenguage click").located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target INPUT_LENGUAGE_SELECT = Target.the("input field computer os lenguage").located(By.xpath("//div[@name='osLanguageId']/input[@type='search']"));

//    public static final Target CLICK_MOBILE = Target.the("mobile device click").located(By.xpath("//div[@name='handsetMakerId']"));
//    public static final Target INPUT_MOBILE = Target.the("input field mobile device").located(By.xpath("//div[@name='handsetMakerId']/input[@type='search']"));
//    public static final Target CLICK_MODEL = Target.the("mobile device model click").located(By.xpath("//div[@name='handsetModelId']"));
//    public static final Target INPUT_MODEL = Target.the("input field mobile device model").located(By.xpath("//div[@name='handsetModelId']/input[@type='search']"));
//    public static final Target CLICK_OS = Target.the("mobile device os click").located(By.xpath("//div[@name='handsetOSId']"));
//    public static final Target INPUT_OS = Target.the("input field mobile device os").located(By.xpath("//div[@name='handsetOSId']/input[@type='search']"));

    public static final Target BTN_NEXT_LAST_STEP = Target.the("button next page").located(By.xpath("//div[@class='pull-right next-step']/a"));

    public static final Target INPUT_PASSWORD = Target.the("input field password").located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("input field password confirm").located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("input field checkbox stay informed ").located(By.xpath("//input[@name='newsletterOptIn']"));
    public static final Target CHECK_TERMS = Target.the("input field checkbox terms and conditions").located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("input field checkbox privacy policy").located(By.id("privacySetting"));

    public static final Target BTN_COMPLETE = Target.the("button next page").located(By.xpath("//div[@class='pull-right next-step']/a"));

    public static final Target HEADER_TITLE_PAGE = Target.the("title header page").located(By.xpath("//h1[contains(text(), 'Welcome to the world's largest community of freelance software testers!')]"));
}
