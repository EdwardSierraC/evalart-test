package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;

import java.util.List;
import java.util.Map;

import static userinterfaces.LoginPageUI.*;

public class Login implements Task {
  private final List<Map<String, String>> userData;

  public Login(List<Map<String, String>> userData) {
    this.userData = userData;
  }

  public static Login withCredentials (List<Map<String, String>> userData) {
    return Tasks.instrumented(Login.class, userData);
  }

  @Override
  public <T extends Actor> void performAs (T actor) {
    actor.attemptsTo(
            Enter.theValue(userData.get(0).get("user")).into(INPUT_USER),
            Enter.theValue(userData.get(0).get("password")).into(INPUT_PASSWORD),
            Click.on(BUTTON_SUBMIT)
    );
  }
}
