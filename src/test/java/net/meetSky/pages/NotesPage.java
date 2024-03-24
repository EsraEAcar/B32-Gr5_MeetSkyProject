package net.meetSky.pages;


import net.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.meetSky.utilities.BrowserUtils;
import org.openqa.selenium.By;


public class NotesPage extends BasePage{


    @FindBy(xpath = "//a[@aria-label='Notes'][1]")
    public WebElement NotesModule;

    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement newNoteButton;


    @FindBy(css = "span[role='presentation']")
    public WebElement notesTypeArea;

    @FindBy(xpath = "//span[@title='New note']")
    public WebElement noteTitleTab;

    @FindBy(xpath = "(//button[contains(@aria-controls, 'menu')])[3]")
    public WebElement threeDots;

    @FindBy(xpath = "//span[text()='Add to favorites']")
    public WebElement AddToFavorites;


    @FindBy(xpath = "//li[@data-id='files'][1]")
    public WebElement Files;

    @FindBy(xpath = "//a[text()='Favorites']")
    public WebElement Favorites;

   @FindBy(xpath = "//td[@class='filename']")
   public WebElement fileName;

    @FindBy(xpath = "(//button[contains(@aria-controls, 'menu')])[5]")
    public WebElement threeDots2;

    @FindBy(xpath = "//span[text()='Details']")
    public WebElement Details;

    @FindBy(xpath = "//div[@class='app-sidebar-header__title-container']")
    public WebElement TextDetails;

    // @FindBy(xpath = "(//button[contains(@aria-controls, 'menu')])[3]")
    //public WebElement threeDots3;

    @FindBy(xpath = "//span[text()='Delete note']")
    public WebElement Delete;

    public void clickTextThreeDots() {
        WebElement threeDots = Driver.getDriver().findElement(By.xpath("(//button[contains(@aria-controls, 'menu')])[3]"));
        BrowserUtils.hover(threeDots);
        BrowserUtils.clickWithJS(threeDots);
    }
}
