package net.meetSky.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetSky.pages.TasksPage;
import io.cucumber.java.en.And;
import net.meetSky.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();

    @And("the user navigates to {string} module")
    public void the_user_navigates_to_module(String moduleName) {
        tasksPage.navigateTo(moduleName);
    }



//    @Then("user clicks on navigation button")
//    public void user_clicks_on_navigation_button() {
//
//        BrowserUtils.sleep(3);
//        tasksPage.navigationButton.click();
//    }



    //==============================AC01=======================================


    @Given("user clicks on Add List Link")
    public void user_clicks_on_add_list_link() {
        tasksPage.addListLink.click();

    }

    @When("user enters a new list name")
    public void userEntersANewListName() {
        tasksPage.listNameBox.sendKeys("School");
    }

    @And("user clicks on save icon")
    public void userClicksOnSaveIcon() {
        tasksPage.saveIcon.click();
    }

    @Then("user sees the created new list in the all lists list")
    public void user_sees_the_created_new_list_in_the_all_lists_list() {
        Assert.assertTrue(tasksPage.newList.isDisplayed());

    }

    //==============================AC02=======================================

    @Given("user clicks on new created list name School")
    public void userClicksOnNewCreatedListNameSchool() {
        tasksPage.newList.click();
    }

    @Then("user clicks to Add a task to School Link")
    public void userClicksToAddATaskToSchoolLink() {
        tasksPage.addTaskBox.click();
    }

    @And("user enters a new task name and pushes enter")
    public void userEntersANewTaskNameAndPushesEnter() {
        tasksPage.addTaskBox.sendKeys("Homeworks"+Keys.ENTER);
    }

    @Then("user sees the created new task below")
    public void userSeesTheCreatedNewTaskBelow() {
        tasksPage.newTask.isDisplayed();
    }


    //==============================AC03=======================================

    @Given("user clicks on School list")
    public void userClicksOnSchoolList() {
        tasksPage.newList.click();
    }


    @Given("user clicks on the checkbox next to task name Homeworks")
    public void userClicksOnTheCheckboxNextToTaskNameHomeworks() {
        tasksPage.checkboxTask.click();

    }

    @And("user sees on the left side Completed list")
    public void userSeesOnTheLeftSideCompletedList() {
        Assert.assertTrue(tasksPage.completedList.isDisplayed());
    }

    @And("the counter next to it is showing the number")
    public void theCounterNextToItIsShowingTheNumber() {
    }


    //==============================AC04=======================================


    @When("user chooses any task and clicks on the star icon next to it")
    public void userChoosesAnyTaskAndClicksOnTheStarIconNextToIt() {
        tasksPage.star.click();
    }

    @Then("user sees that on the left side the new Important list appears")
    public void userSeesThatOnTheLeftSideTheNewImportantListAppears() {
        Assert.assertTrue(tasksPage.importantList.isDisplayed());
    }



    //==============================AC05=======================================

    @When("user clicks on the University link")
    public void userClicksOnTheCurrentTab() {
        tasksPage.newList.click();
    }

    @Then("the counter next to it shows the number of uncompleted tasks")
    public void theCounterNextToItShowsTheNumberOfUncompletedTasks() {
        String uncompletedTasks = tasksPage.counterUncompleted.getText();
        System.out.println("uncompletedTasks = " + uncompletedTasks);
    }
}
