package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.LoginPageUI.TITLE_TEST;

public class validateTitle implements Question<Boolean> {
  private String titleValidation;

  public validateTitle (String titleValidation) {
    this.titleValidation = titleValidation;
  }

  public static validateTitle onWeb (String titleValidation) {

    return new validateTitle(titleValidation);
  }

  @Override
  public Boolean answeredBy (Actor actor) {
    boolean result;
    String getTitle = TITLE_TEST.resolveFor(actor).getText();

    if (getTitle.equalsIgnoreCase("Prueba de automatización")) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}
