package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageUI {
  public static final Target INPUT_USER = Target.the("INPUT USER")
          .located(By.xpath("//input[@placeholder='Usuario ']"));
  public static final Target INPUT_PASSWORD = Target.the("INPUT PASSWORD")
          .located(By.xpath("//input[@placeholder='Contraseña ']"));

  public static final Target BUTTON_SUBMIT = Target.the("BUTTON SUBMIT")
          .located(By.xpath("//button[@type='submit']"));

  public static final Target TITLE_TEST = Target.the("TEST TITLE")
          .located(By.xpath("//h1[contains(.,'Prueba de automatización')]"));
}
