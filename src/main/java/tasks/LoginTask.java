package tasks;

import com.sun.javafx.tk.Toolkit;
import models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginUserInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    LoginModel loginModel;

    public LoginTask(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(loginModel.getUsername()).into(LoginUserInterface.USERNAME));
        actor.attemptsTo(Enter.keyValues(loginModel.getPassword()).into(LoginUserInterface.PASSWORD));
        actor.attemptsTo(Click.on(LoginUserInterface.LOGIN));
    }
    public static LoginTask loginTask(LoginModel loginModel){
        return instrumented(LoginTask.class,loginModel);
}
}
