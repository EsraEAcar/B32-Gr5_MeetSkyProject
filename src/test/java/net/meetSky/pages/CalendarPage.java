package net.meetSky.pages;

import io.cucumber.java.zh_cn.假如;
import net.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;
import java.util.logging.XMLFormatter;

public class CalendarPage implements WebDriver {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//header[@class='app-navigation-header']//button[@aria-label='Actions']\n")
    public WebElement displayButton;

    @FindBy(xpath = "//button[contains(., 'Day')]")
    public WebElement dayButton;

    @FindBy(xpath = "//table[@class='fc-scrollgrid  fc-scrollgrid-liquid']")
    public WebElement allDayButton;


    @FindBy(xpath = "//span[contains(text(), 'Week')]")
    public WebElement weekButton;

    @FindBy (xpath = "//tr[@class='fc-scrollgrid-section fc-scrollgrid-section-body  fc-scrollgrid-section-liquid']")
    public WebElement seeingWeeklyPlan;


    @FindBy(xpath = "//span[contains(text(), 'Month')]")
    public WebElement monthButton;

    @FindBy (xpath = "//div[@class='fc-scroller fc-scroller-liquid-absolute']")
    public WebElement seeingMonthlyView;


    @FindBy (xpath = "//table//tbody//tr[4]//td[6]")
    public WebElement datesOfTheMonthTable;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//div[@class='property-title__input']")
    public WebElement eventTitleButton;

    @FindBy(xpath = "//div[@class='property-title-time-picker__time-pickers']/div[1]//input[@name='date']\n")
    public WebElement fromArea;

    @FindBy(xpath = "//div[@class='property-title-time-picker__time-pickers']/div[2]//input[@name='date']\n")
    public WebElement toArea;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;

    @FindBy (xpath = "//span[@title='Personal']")
    public WebElement seeingNewEvent;

    //++++++++++++++++++++++++++++++++
    ////table[@class='fc-scrollgrid  fc-scrollgrid-liquid']  month table + Assert





    @Override
    public void get(String url) {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}
