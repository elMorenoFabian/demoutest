package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class Utest extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("button show register form").located(By.className("unauthenticated-nav-bar__sign-up"));

}
