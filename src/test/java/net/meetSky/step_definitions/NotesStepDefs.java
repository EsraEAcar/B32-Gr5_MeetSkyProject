package net.meetSky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.meetSky.utilities.Driver;
import org.junit.Assert;
import net.meetSky.pages.NotesPage;
import net.meetSky.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.time.Duration;

public class NotesStepDefs {

    NotesPage notesPage = new NotesPage();

    @When("the user clicks on the {string} module")
    public void the_user_clicks_on_the_module(String string) {
       notesPage.NotesModule.click();
    }

    @When("the user clicks to {string} button")
    public void the_user_clicks_to_button(String string) {
        notesPage.newNoteButton.click();
    }

    @When("the user types text in the page")
    public void the_user_types_text_in_the_page() {
        BrowserUtils.waitFor(4);
        notesPage.notesTypeArea.sendKeys("Hello World!");

    }

    @Then("note title should be same with first words of text")
    public void note_title_should_be_same_with_first_words_of_text() {

        BrowserUtils.waitFor(4);

        String actualResult = notesPage.notesTypeArea.getText();
        String expectedResult = notesPage.noteTitleTab.getText();

        Assert.assertTrue(expectedResult.contains(actualResult));
    }

    @When("the user navigates to threeDots button")
    public void the_user_navigates_to_three_dots_button() {


       Actions actions = new Actions(Driver.getDriver());

       actions.moveToElement(notesPage.threeDots).perform();

    }

    @When("the user click on the threeDots")
    public void the_user_click_on_the_three_dots() {
        BrowserUtils.waitFor(2);
        notesPage.clickTextThreeDots();
    }

    @When("the user click to {string} tab")
    public void the_user_click_to_tab(String string) {
        notesPage.AddToFavorites.click();
    }

    @When("the user clicks to {string} module")
    public void the_user_clicks_to_module(String string) {
        BrowserUtils.waitFor(4);
        notesPage.Files.click();
    }

    @When("the user clicks on the {string} tab")
    public void the_user_clicks_on_the_tab(String string) {
       notesPage.Favorites.click();
    }

    @When("the user should be able to see the note title")
    public void the_user_should_be_able_to_see_the_note_title() {

        Assert.assertTrue(notesPage.fileName.isDisplayed());
    }

    @Then("the user clicks on the notes module")
    public void the_user_clicks_on_the_notes_module() {
        notesPage.NotesModule.click();
    }

    @Then("the user clicks the threeDots2 button")
    public void the_user_clicks_the_three_dots2_button() {
    notesPage.threeDots2.click();
    }

    @Then("the user clicks the {string} tab")
    public void the_user_clicks_the_tab(String string) {
    notesPage.Details.click();
    }

    @Then("the user should be able to see the text details")
    public void the_user_should_be_able_to_see_the_text_details() {
        Assert.assertTrue(notesPage.TextDetails.isDisplayed());


    }

    /*
    @When("the user clicks the threeDots3 button")
    public void the_user_clicks_the_three_dots3_button() {
        notesPage.threeDots3.click();

        WebElement threeDots3 = Driver.getDriver().findElement(By.xpath("(//button[contains(@aria-controls, 'menu')])[3]"));
        BrowserUtils.hover(threeDots3);
        BrowserUtils.clickWithJS(threeDots3);
    }


     */

    @Then("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {
            notesPage.Delete.click();
    }







}

