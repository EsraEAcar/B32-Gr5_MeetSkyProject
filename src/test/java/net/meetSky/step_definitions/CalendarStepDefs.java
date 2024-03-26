package net.meetSky.step_definitions;

import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetSky.pages.BasePage;
import net.meetSky.pages.CalendarPage;
import net.meetSky.utilities.ConfigurationReader;
import net.meetSky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalendarStepDefs extends BasePage{

    CalendarPage calendarPage = new CalendarPage();

    @Given("User is on the Calendar page")
    public void userIsOnTheCalendarPage() {
        calender.click();

    }

    @When("User is on the Button")
    public void userIsOnTheButton() {
        calendarPage.displayButton.click();
    }

    @When("User selects the daily view")
    public void userSelectsTheDailyView() {
        calendarPage.dayButton.click();
    }

    @Then("User sees the events scheduled for the selected day")
    public void userSeesTheEventsScheduledForTheSelectedDay() {
        calendarPage.allDayButton.click();
    }

    @When("User selects the weekly view")
    public void userSelectsTheWeeklyView() {
        calendarPage.weekButton.click();
    }

    @Then("User sees the events scheduled for the selected week")
    public void userSeesTheEventsScheduledForTheSelectedWeek() {
        assertTrue(calendarPage.seeingWeeklyPlan.isDisplayed());
    }

    @When("User selects the monthly view")
    public void userSelectsTheMonthlyView() {
        calendarPage.monthButton.click();
    }

    @Then("User sees the events scheduled for the selected month")
    public void userSeesTheEventsScheduledForTheSelectedMonth() {
        assertTrue(calendarPage.seeingMonthlyView.isDisplayed());

    }

    @When("User clicks New Event button")
    public void userClicksNewEventButton() {
        calendarPage.newEventButton.click();
    }

    @When("User clicks \"Event Title\" area")
    public void userClicksEventTitleArea() {
        assertTrue(calendarPage.eventTitleButton.isDisplayed());
    }

    @When("User select default \"from\" time beginning of the time")
    public void userSelectDefaultFromTimeBeginningOfTheTime() {
        assertTrue(calendarPage.fromArea.isDisplayed());
    }


    @When("User select default \"to\" time ending of the event")
    public void userSelectDefaultToTimeEndingOfTheEvent() {
        assertTrue(calendarPage.toArea.isDisplayed());
    }



    @When("User clicks the \"Save\" button")
    public void userClicksSaveButton() {
        calendarPage.saveButton.click();
    }


    @Then("User sees the saved event on the monthly calendar view")
    public void userSeesTheSavedEventOnTheMonthlyCalendarView() {
        assertTrue(calendarPage.seeingNewEvent.isDisplayed());

    }
}
