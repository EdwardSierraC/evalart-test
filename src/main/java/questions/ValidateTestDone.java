package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.TestPageUI.SUCCESS_MSG;

public class ValidateTestDone implements Question<Boolean> {
  private String doneValidation;

  public ValidateTestDone (String doneValidation) {
    this.doneValidation = doneValidation;
  }

  public static ValidateTestDone onWeb (String doneValidation) {

    return new ValidateTestDone(doneValidation);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean result;
    String msgSuccess = SUCCESS_MSG.resolveFor(actor).getText();

    if (msgSuccess.equalsIgnoreCase("Felicidades, has terminado la prueba exitosamente")) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}
