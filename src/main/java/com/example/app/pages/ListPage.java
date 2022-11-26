package com.example.app.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class ListPage extends BasePage {

  public void HamburgerButton(){
    click(MobileBy.AccessibilityId("Buka panel navigasi"));
  }

  public void ListMenu(){
    click(MobileBy.id("nav_list"));
  }
  public void scrollList() {
    TouchAction action = new TouchAction(getDriver());
    AndroidElement containerList = find(MobileBy.id("recycler_view"));
    Point coordinate = containerList.getCenter();
    PointOption start = PointOption.point(coordinate);
    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
    //builder
    action
        .press(start)
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(end)
        .release()
        .perform();

  }

  public void longPressObject() {
    TouchAction action = new TouchAction(getDriver());
    AndroidElement elementToPress = find(MobileBy.id("recycler_view"));
    action.longPress(PointOption.point(elementToPress.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
            .release()
            .perform();
    By locatorListOfText = MobileBy.id("com.isl.simpleapp:id/text_view");
    AndroidElement longPress = driver.findElements(locatorListOfText).get(4);
    longPress.isDisplayed();
  }

  public void tapMultipleTimes() {
    TouchAction action = new TouchAction(getDriver());
    AndroidElement elementToTap = find(MobileBy.id("recycler_view"));
    action.tap(TapOptions.tapOptions().withTapsCount(5)
                    .withElement(ElementOption.element(elementToTap)))
            .perform();
    By locatorListOfText = MobileBy.id("com.isl.simpleapp:id/text_view");
    AndroidElement tapMultiple = driver.findElements(locatorListOfText).get(4);
    tapMultiple.isDisplayed();
  }

  public void scrollToText() {
    AndroidElement element = find(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true))" +
                    ".scrollIntoView(new UiSelector().text(\"List ke-68\"))"));
  }
}
