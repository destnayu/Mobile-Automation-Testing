package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

  public void inputUsername(String username) {
    By locator = MobileBy.id("com.isl.simpleapp:id/username");
    AndroidElement inputUsername = driver.findElement(locator);
    inputUsername.clear();
    inputUsername.sendKeys(username);
  }

  public void inputPassword(String password) {
    By locator = MobileBy.id("com.isl.simpleapp:id/password");
    AndroidElement inputPassword = driver.findElement(locator);
    inputPassword.clear();
    inputPassword.sendKeys(password);
  }

  public void LoginButton() {
    By locator = MobileBy.id("com.isl.simpleapp:id/login");
    AndroidElement btnLogin = driver.findElement(locator);
    btnLogin.click();
  }

}
