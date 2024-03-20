package net.meetSky.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.meetSky.pages.DeckPage;
import net.meetSky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeckStepDefs {

    DeckPage deckPage = new DeckPage();

    @Given("user clicks navigation button")
    public void user_clicks_navigation_button() {
        deckPage.navigationButton.click();
    }

    //==============================AC01=======================================

    @When("user clicks add board icon")
    public void user_clicks_add_board_icon() {
        deckPage.addBoardIcon.click();
    }

    @When("user enters board name as SDET")
    public void user_enters_board_name() {
        deckPage.boardNameBox.sendKeys("SDET");
    }

    @When("user clicks confirm icon")
    public void user_clicks_confirm_icon() {
        deckPage.confirmIcon.click();
    }

    @Then("user sees the created new board in the all boards list")
    public void user_sees_the_created_new_board_in_the_all_boards_list() {
        Assert.assertTrue(deckPage.newBoard.isDisplayed());
    }


//==============================AC2=======================================

    @Given("user selects and clicks SDET board")
    public void user_selects_and_clicks_sdet_board() {
        deckPage.SDETBoard.click();
    }
    @When("user clicks add list icon")
    public void user_clicks_add_list_icon() {
        deckPage.addListIcon.click();
    }
    @When("user enters list name as Java")
    public void user_enters_list_name_as_Java() {
        deckPage.listNameBox.sendKeys("Java");
    }
    @When("user clicks add list confirm icon")
    public void user_clicks_add_list_confirm_icon() {
        deckPage.addListConfirmIcon.click();
    }
    @Then("user sees the created new list under the selected board")
    public void user_sees_the_created_new_list_under_the_selected_board() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(deckPage.javaList));

        Assert.assertTrue(deckPage.javaList.isDisplayed());
    }

//==============================AC3=======================================

    @Given("user clicks add card icon")
    public void user_clicks_add_card_icon() {
        deckPage.addCardIcon.click();
    }
    @When("user enters card name as String")
    public void user_enters_card_name_as_String() {
        deckPage.cardName.sendKeys("String");
    }
    @When("user clicks add card confirm icon")
    public void user_clicks_add_card_confirm_icon() {
        deckPage.addCardConfirmIcon.click();
    }
    @Then("user sees the created new card")
    public void user_sees_the_created_new_card() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(deckPage.javaList));

        Assert.assertTrue(deckPage.stringCard.isDisplayed());
    }


//==============================AC4=======================================

    @When("user clicks three-dots icon of the card")
    public void user_clicks_three_dots_icon_of_the_card() {
        deckPage.threeDotsIcon.click();
    }
    @When("user clicks assign to me selection")
    public void user_clicks_assign_to_me_selection() {
        deckPage.assignToMeButton.click();
    }
    @Then("user sees the user profile near the three-dots icon")
    public void user_sees_the_user_profile_near_the_three_dots_icon() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(deckPage.userProfile));

        Assert.assertTrue(deckPage.userProfile.isDisplayed());
    }

//==============================AC05=======================================

    @Given("user clicks three-dots icon near School board")
    public void user_clicks_three_dots_icon_near_School_board() {
        deckPage.school3Dots.click();
    }
    @When("user selects edit board")
    public void user_selects_edit_board() {
        deckPage.editBoardButton.click();
    }
    @When("user deletes the old name")
    public void user_deletes_the_old_name() {
        deckPage. boardRenameBox.clear();
    }
    @When("user enters a new name as Work and click confirm icon")
    public void user_enters_a_new_name_as_Work_and_click_confirm_icon() {
        deckPage.boardRenameBox.sendKeys("Work");
        deckPage.boardRenameConfirmIcon.click();
    }
    @Then("user sees the  board name as Work instead of School")
    public void user_sees_the_board_name_as_work_instead_of_school() {
        Assert.assertEquals("Work", deckPage.workBoard.getText());
    }

//==============================AC06=======================================

    @Given("user clicks three-dots icon near Personal board")
    public void user_clicks_three_dots_icon_near_personal_board() {
        deckPage.personal3Dots.click();
    }
    @When("user clicks delete board option")
    public void user_clicks_delete_board_option() {
        deckPage.deleteBoardButton.click();
    }
    @When("user clicks delete on the warning message")
    public void user_clicks_delete_on_the_warning_message() {
        deckPage.deleteConfirmButton.click();
    }

    @When("user clicks undo button immediately")
    public void user_clicks_undo_button_immediately() {
        deckPage.undoButton.click();
    }
    @Then("user can see previously deleted board again")
    public void user_can_see_previously_deleted_board_again() {
        Assert.assertTrue(deckPage.personal3Dots.isDisplayed());
    }
}
