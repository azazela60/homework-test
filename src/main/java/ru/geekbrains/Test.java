package ru.geekbrains;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test {

    public static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private static final String STUDENT_LOGIN = "Applanatest";
    private static final String STUDENT_PASSWORD = "Student2020!";
    private static final WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-bloking");

    }

    public static void main(String[] args) throws InterruptedException {


        driver.get(LOGIN_PAGE_URL);
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(1000, 1000));
        WebElement LoginTextInput = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        LoginTextInput.sendKeys(STUDENT_LOGIN);
        WebElement passwordTextInput = driver.findElement(By.cssSelector(".span2[name='_password']"));
        passwordTextInput.sendKeys(STUDENT_PASSWORD);
        WebElement LoginButton = driver.findElement(By.xpath(".//button[@name='_submit']"));
        LoginButton.click();
        Thread.sleep(2000);
        By.xpath("//*[@id=\"user-menu\"]/a").findElement(driver).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
