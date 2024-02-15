package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestPageUI {

  public static final Target SELECT_INPUT = Target.the("SELECT")
          .located(By.name("select"));
  public static final Target INPUT_TEXT = Target.the("INPUT TEXT")
          .located(By.xpath("//textarea[@placeholder='Texto']"));
  public static final Target BUTTON_SEND = Target.the("BUTTON SEND")
          .located(By.xpath("//button[@type='submit']"));
  public static final Target SUCCESS_MSG = Target.the("SUCCESS MESSAGE")
          .located(By.xpath("//h1[contains(.,'Felicidades, has terminado la prueba exitosamente')]"));
}
