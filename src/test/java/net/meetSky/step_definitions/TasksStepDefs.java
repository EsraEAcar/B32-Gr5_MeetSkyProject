package net.meetSky.step_definitions;

import io.cucumber.java.en.Then;
import net.meetSky.pages.TasksPage;
import io.cucumber.java.en.And;
import net.meetSky.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();

    @And("the user navigates to {string} module")
    public void the_user_navigates_to_module(String moduleName) {
        tasksPage.navigateTo(moduleName);

        BrowserUtils.sleep(3);

    }

    @Then("click to Add List link")
    public void clickToLink() {

        tasksPage.addListLink.click();

    }

    @Then("enter a New List name and push enter")
    public void enterANewListNameAndClickEnter() {
        tasksPage.newListInputBox.sendKeys("School"+Keys.ENTER);
    }


    @Then("click to Add a task input box")
    public void clickToAddATaskInputBox() {
        tasksPage.addTaskInputBox.click();
    }

    @And("enter a new task and push enter")
    public void enterANewTaskAndPushEnter() {
        tasksPage.addTaskInputBox.sendKeys("Homeworks"+Keys.ENTER);
    }
}
