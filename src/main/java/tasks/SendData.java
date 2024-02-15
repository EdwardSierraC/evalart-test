package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;

import java.util.List;
import java.util.Map;

import static userinterfaces.LoginPageUI.*;
import static userinterfaces.TestPageUI.*;

public class SendData implements Task {
  private final List<Map<String, String>> userData;
  public SendData(List<Map<String, String>> userData)
  {
    this.userData = userData;
  }
  public static SendData required (List<Map<String, String>> userData) {
    return Tasks.instrumented(SendData.class, userData);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            SelectFromOptions.byVisibleText(userData.get(0).get("op1")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t1")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op2")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t2")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op3")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t3")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op4")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t4")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op5")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t5")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op6")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t6")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op7")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t7")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op8")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t8")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op9")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t9")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND),
            SelectFromOptions.byVisibleText(userData.get(0).get("op10")).from(SELECT_INPUT),
            Enter.theValue(userData.get(0).get("t10")).into(INPUT_TEXT),
            Click.on(BUTTON_SEND)
    );
  }
}
