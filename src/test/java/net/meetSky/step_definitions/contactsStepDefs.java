package net.meetSky.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.Node;
import net.meetSky.pages.ContactsPage;
import net.meetSky.pages.LoginPage;
import net.meetSky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import net.meetSky.utilities.BrowserUtils;
import org.openqa.selenium.interactions.Actions;


import java.util.ArrayList;
import java.util.List;

public class contactsStepDefs {

     LoginPage loginPage=new LoginPage();



    @Given(": User is already logged in with username as {string} and password as {string} and navigates to Contacts Page")
    public void user_is_already_logged_in_with_username_as_and_password_as_and_navigates_to_contacts_page(String username, String password) {
        loginPage.loginFromFeature(username,password);
        Driver.getDriver().get("https://qa.meetsky.net/index.php/apps/contacts/");


    }


    ContactsPage contactspage=new ContactsPage();


    @When("user click on creat contact")
    public void user_click_on_creat_contact() {
        contactspage.newcontact.click();

    }


    @When("user enter the {string} of the new contact")
    public void user_enter_the_of_the_new_contact(String name) {

        contactspage.contactname.click();
        contactspage.contactname.clear();
        contactspage.contactname.sendKeys(name );
    }

    @When("user enter name {string} in the seacrh input")
    public void user_enter_name_in_the_seacrh_input(String name) {

        contactspage.searchcontact.sendKeys(name+Keys.ENTER);    }


    @Then("The {string} name should be created and displayed in the contact list")
    public void the_name_should_be_created_and_displayed_in_the_contact_list(String name) {

        Assert.assertTrue(contactspage.fcontactslist.getText().contains(name));

    }

    @When("user click on All contacts tab")
    public void user_click_on_all_contacts_tab() {

        contactspage.Allcontacts.click();


    }

    @Then("the user should see the same number in the side of Not grouped tab")
    public void the_user_should_see_the_same_number_in_the_side_of_not_grouped_tab() {

        List <String> slist=BrowserUtils.getElementsText(contactspage.list);
        int count= Integer.parseInt(contactspage.counter.getText());
        Assert.assertEquals(slist.size(),count);
    }



    @When("user search for the {string}")
    public void user_search_for_the(String contactname) {
        contactspage.searchcontact.sendKeys(contactname+Keys.ENTER);

    }
    @When("select {string} from the list")
    public void select_from_the_list(String contactname) {
        contactspage.contact.click();


    }
    @When("user click on delete from the menu")
    public void user_click_on_delete_from_the_menu() {

       // BrowserUtils.waitForClickablility(contactspage.menu,2);
        //BrowserUtils.switchToWindow("https://qa.meetsky.net/index.php/apps/contacts/All%20contacts/4b68a6a7-2274-47b0-aa58-5dd41822dfee~contacts");
      // BrowserUtils.hover(contactspage.menu);
        BrowserUtils.clickWithJS(contactspage.menu);
    }



    @Then("{string} wil deleted from the conatct list")
    public void wil_deleted_from_the_conatct_list(String conactname) {

    }




}





