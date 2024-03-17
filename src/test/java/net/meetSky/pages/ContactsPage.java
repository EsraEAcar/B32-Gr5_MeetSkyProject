package net.meetSky.pages;

import net.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage {

    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (id="new-contact-button")
    public WebElement newcontact;


    @FindBy (id = "contact-fullname")
    public WebElement contactname;

    @FindBy (xpath = "//input[@placeholder='Search contacts …']")
    public WebElement searchcontact;


    @FindBy (id = "OTFjZDMxNWEtODZjZS00YjlkLWExOTItOWMzZjdiYTNmYzJhfmNvbnRhY3")
    public WebElement contactnamesearch;

    @FindBy (xpath = "//span[@class='option__lineone']")
    public WebElement fcontactslist;

    @FindBy (id = "everyone")
    public WebElement Allcontacts;

    @FindBy (xpath = "//div[@class='app-navigation-entry__counter']")
    public WebElement counter;

    @FindBy (xpath = "//div[@role='listitem']")
    public List <WebElement> list;

    @FindBy (xpath = "//div[@role='listitem']")
    public WebElement contact;

    @FindBy (xpath = "//button[@class='icon vue-button action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement menu;

    @FindBy (xpath = "//div[@id='popover_ti240x9p82']")
    public WebElement menu2;

    @FindBy (xpath = "//button[@class='action-button focusable']")
    public WebElement deletebutton;


}
