package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.RegisterUserFormFill;

public class RegisterUser implements Task {
    public static RegisterUser thePage() {
        return Tasks.instrumented(RegisterUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("test name").into(RegisterUserFormFill.INPUT_FIRS_NAME),
                Enter.theValue("test last name").into(RegisterUserFormFill.INPUT_LAST_NAME),
                Enter.theValue("zxcvasdfd@zxcvasdfd.com").into(RegisterUserFormFill.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("January").from(RegisterUserFormFill.INPUT_MONT),
                SelectFromOptions.byVisibleText("10").from(RegisterUserFormFill.INPUT_DAY),
                SelectFromOptions.byVisibleText("1990").from(RegisterUserFormFill.INPUT_YEAR),
                Enter.theValue("Spanish").into(RegisterUserFormFill.INPUT_LENGUAGES),
                Click.on(RegisterUserFormFill.BTN_NEXT),

                Enter.theValue("Bogota").into(RegisterUserFormFill.INPUT_CITY),
                Enter.theValue("111144").into(RegisterUserFormFill.INPUT_ZIP),
                Click.on(RegisterUserFormFill.CLICK_COUNTRY),
                Enter.theValue("Colombia").into(RegisterUserFormFill.INPUT_COUNTRY),
                Click.on(RegisterUserFormFill.BTN_NEXT_DEVICES),

                Click.on(RegisterUserFormFill.CLICK_COMPUTER),
                Enter.theValue("Linux").into(RegisterUserFormFill.INPUT_COMPUTER),
                Click.on(RegisterUserFormFill.CLICK_VERSION),
                Enter.theValue("openSUSE").into(RegisterUserFormFill.INPUT_VERSION),
                Click.on(RegisterUserFormFill.CLICK_LENGUAGE_SELECT),
                Enter.theValue("Spanish").into(RegisterUserFormFill.INPUT_LENGUAGE_SELECT),

//                Click.on(RegisterUserFormFill.CLICK_MOBILE),
//                Enter.theValue("Motorola").into(RegisterUserFormFill.INPUT_MOBILE),
//                Click.on(RegisterUserFormFill.CLICK_MODEL),
//                Enter.theValue("One (Motorola)").into(RegisterUserFormFill.INPUT_MODEL)
//                Click.on(RegisterUserFormFill.CLICK_OS),
//                Enter.theValue("Android 10").into(RegisterUserFormFill.INPUT_OS),

                Click.on(RegisterUserFormFill.BTN_NEXT_LAST_STEP),

                Enter.theValue("%hC55U4cdA#Vm8").into(RegisterUserFormFill.INPUT_PASSWORD),
                Enter.theValue("%hC55U4cdA#Vm8").into(RegisterUserFormFill.INPUT_PASSWORD_CONFIRM),
                Click.on(RegisterUserFormFill.CHECK_STAY_INFORMED),
                Click.on(RegisterUserFormFill.CHECK_TERMS),
                Click.on(RegisterUserFormFill.CHECK_PRIVACY),
                Click.on(RegisterUserFormFill.BTN_COMPLETE)
        );
    }
}
