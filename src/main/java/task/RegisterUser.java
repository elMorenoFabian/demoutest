package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.RegisterUserFormFill;

public class RegisterUser implements Task {
    private String name, lastName, email, birthMont, birthDay, birthYear, lenguage, city, zip, country, osPc, osVersion, osLenguage, password, passwordConfirm;

    public RegisterUser(
            String name,
            String lastName,
            String email,
            String birthMont,
            String birthDay,
            String birthYear,
            String lenguage,
            String city,
            String zip,
            String country,
            String osPc,
            String osVersion,
            String osLenguage,
            String password,
            String passwordConfirm

    ) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.birthMont = birthMont;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.lenguage = lenguage;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.osPc = osPc;
        this.osVersion = osVersion;
        this.osLenguage = osLenguage;
        this.password = password;
        this.passwordConfirm = passwordConfirm;

    }
    public static RegisterUser thePage(
            String name,
            String lastName,
            String email,
            String birthMont,
            String birthDay,
            String birthYear,
            String lenguage,
            String city,
            String zip,
            String country,
            String osPc,
            String osVersion,
            String osLenguage,
            String password,
            String passwordConfirm
    ) {
        return Tasks.instrumented(
                RegisterUser.class,
                name,
                lastName,
                email,
                birthMont,
                birthDay,
                birthYear,
                lenguage,
                city,
                zip,
                country,
                osPc,
                osVersion,
                osLenguage,
                password,
                passwordConfirm
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(RegisterUserFormFill.INPUT_FIRS_NAME),
                Enter.theValue(lastName).into(RegisterUserFormFill.INPUT_LAST_NAME),
                Enter.theValue(email).into(RegisterUserFormFill.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMont).from(RegisterUserFormFill.INPUT_MONT),
                SelectFromOptions.byVisibleText(birthDay).from(RegisterUserFormFill.INPUT_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(RegisterUserFormFill.INPUT_YEAR),
                Enter.theValue(lenguage).into(RegisterUserFormFill.INPUT_LENGUAGES),
                Click.on(RegisterUserFormFill.BTN_NEXT),

                Enter.theValue(city).into(RegisterUserFormFill.INPUT_CITY),
                Enter.theValue(zip).into(RegisterUserFormFill.INPUT_ZIP),
                Click.on(RegisterUserFormFill.CLICK_COUNTRY),
                Enter.theValue(country).into(RegisterUserFormFill.INPUT_COUNTRY),
                Click.on(RegisterUserFormFill.BTN_NEXT_DEVICES),

                Click.on(RegisterUserFormFill.CLICK_COMPUTER),
                Enter.theValue(osPc).into(RegisterUserFormFill.INPUT_COMPUTER),
                Click.on(RegisterUserFormFill.CLICK_VERSION),
                Enter.theValue(osVersion).into(RegisterUserFormFill.INPUT_VERSION),
                Click.on(RegisterUserFormFill.CLICK_LENGUAGE_SELECT),
                Enter.theValue(osLenguage).into(RegisterUserFormFill.INPUT_LENGUAGE_SELECT),

//                Click.on(RegisterUserFormFill.CLICK_MOBILE),
//                Enter.theValue("Motorola").into(RegisterUserFormFill.INPUT_MOBILE),
//                Click.on(RegisterUserFormFill.CLICK_MODEL),
//                Enter.theValue("One (Motorola)").into(RegisterUserFormFill.INPUT_MODEL)
//                Click.on(RegisterUserFormFill.CLICK_OS),
//                Enter.theValue("Android 10").into(RegisterUserFormFill.INPUT_OS),

                Click.on(RegisterUserFormFill.BTN_NEXT_LAST_STEP),

                Enter.theValue(password).into(RegisterUserFormFill.INPUT_PASSWORD),
                Enter.theValue(passwordConfirm).into(RegisterUserFormFill.INPUT_PASSWORD_CONFIRM),
                Click.on(RegisterUserFormFill.CHECK_STAY_INFORMED),
                Click.on(RegisterUserFormFill.CHECK_TERMS),
                Click.on(RegisterUserFormFill.CHECK_PRIVACY),
                Click.on(RegisterUserFormFill.BTN_COMPLETE)
        );
    }
}
