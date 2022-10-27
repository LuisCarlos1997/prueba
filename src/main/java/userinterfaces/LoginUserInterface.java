package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterface {
    public static final Target USERNAME = Target.the("Escriba su usuario").
            locatedBy("//*[@id='user-name']");

    public static final Target PASSWORD= Target.the("Escriba su contraseña").
            locatedBy("//*[@id='password']");

    public static final Target LOGIN= Target.the("Da clic en el boton Login").
            locatedBy("//*[@id='login-button']");
}
