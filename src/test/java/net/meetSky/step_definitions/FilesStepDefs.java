package net.meetSky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetSky.pages.FilesPage;
import net.meetSky.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;

public class FilesStepDefs {
   FilesPage filesPage=new FilesPage();

   //1EC :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

  private String filepath = System.getProperty("user.dir") + "/src/test/resources/UploadFilesTestData/text.txt" ;
  @Given("User is on the Files page")
   public void user_is_on_the_files_page() {

   }
   @When("User clicks Add icon")
   public void user_clicks_add_icon() {
       filesPage.addIcon.click();
       BrowserUtils.sleep(4);

   }
   @Then("User clicks upload file icon")
   public void user_clicks_upload_file_icon() {
   }

   @Then("User uploads the file.")
   public void user_uploads_the_file() {
           filesPage.uploadFileButton.sendKeys(filepath);
       BrowserUtils.waitFor(4);
       }


    @Then("User should see  uploaded file on the page.")
    public void userShouldSeeUploadedFileOnThePage() {
        String expectedName="text";
        List<WebElement> rows = filesPage.table.findElements(By.tagName("tr"));
        WebElement lastRow = rows.get(rows.size() - 2);
        String lastRowData = lastRow.getText();
        Assert.assertTrue(lastRowData.contains(expectedName));

    }
   //2EC :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    @Then("User clicks New Folder icon")
    public void userClicksNewFolderIcon() {
    filesPage.newFolderButton.click();
    }


    @And("User  writes {string} on the window and enters")
    public void userWritesOnTheWindowAndEnters(String fileName) {
        filesPage.newFolderInput.sendKeys(fileName+Keys.ENTER);
        BrowserUtils.waitFor(3);
   }
   @Then("User should see {string} on the page.")
    public void userShouldSeeOnThePage(String uploadedFileName) {

        Assert.assertEquals(filesPage.uploadedFolder.getText(),uploadedFileName);
   }

   //3EC ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @When("User clicks on first uploaded file's selectCheckBox")
    public void userClicksOnFirstUploadedFileSSelectCheckBox() {
       filesPage.selectCheckBox.click();
    }

    @Then("User navigates to three dots menu and clicks on it")
    public void userNavigatesToThreeDotsMenuAndClicksOnIt() {
       filesPage.threeDotsMenu.click();
    }

    @And("User selects the delete option and clicks")
    public void userSelectsTheDeleteOptionAndClicks() {
       filesPage.deleteIcon.click();
    }

    //4EC :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    @Then("User sees the total number of files and folders under the files list table")
    public void userSeesTheTotalNumberOfFilesAndFoldersUnderTheFilesListTable() {
   String expectedTitle="1 folder";
       //Assert.assertTrue(filesPage.totalNumberOfFilesAndFolders.isDisplayed());
        Assert.assertTrue(filesPage.totalNumberOfFilesAndFolders.getText().contains(expectedTitle));
    }






}
