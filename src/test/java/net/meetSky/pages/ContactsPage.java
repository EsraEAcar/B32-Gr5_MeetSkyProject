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


    @FindBy (xpath = "(//button[@class = 'icon vue-button action-item__menutoggle action-item__menutoggle--default-icon'])[4]")
    public WebElement menu;

    @FindBy (xpath = "(//button[@class='action-button focusable'])[8]")
    public WebElement deletebutton;


    @FindBy (xpath = "//p[contains(text(),'Select a contact on the list to begin')]")
    public WebElement deletedheader;

    @FindBy (xpath = "//button[@class='icon vue-button action-item__menutoggle icon-picture-force-white']")

    public WebElement imgdawnload;


    @FindBy (xpath = "(//button[@class='action-button focusable'])[8]")
    public WebElement choosefromfile;

    @FindBy (xpath = "//tr[contains(@data-entryname,'.jpg')]")
    public WebElement img;

    @FindBy (xpath = "//button[text()='Choose']")
    public WebElement choose;

    @FindBy (xpath = "//img[contains(@src,'http')]")
    public WebElement contactimg;

}
