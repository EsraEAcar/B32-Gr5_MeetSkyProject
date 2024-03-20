package net.meetSky.pages;

import net.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage {

    public DeckPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//==============================AC01=======================================

    @FindBy(xpath = "(//button[@rel = 'nofollow noreferrer noopener'])[1]")
    public WebElement navigationButton;
    @FindBy(xpath = "//div[@class = 'app-navigation-entry-icon icon-add']")
    public WebElement addBoardIcon;

    @FindBy(xpath = "//input[@placeholder = 'Board name']")
    public WebElement boardNameBox;

    @FindBy(xpath = "//input[@class = 'icon-confirm']")
    public WebElement confirmIcon;

    @FindBy(css = "span[title = 'SDET']")
    public WebElement newBoard;


//==============================AC02=======================================

    @FindBy(css = "span[title = 'SDET']")
    public WebElement SDETBoard;

    @FindBy(xpath = "(//button[@rel = 'nofollow noreferrer noopener'])[2]")
    public WebElement addListIcon;

    @FindBy(id = "new-stack-input-main")
    public WebElement listNameBox;

    @FindBy(xpath = "(//input[@class = 'icon-confirm has-tooltip'])[1]")
    public WebElement addListConfirmIcon;

    @FindBy(xpath = "//h3[@class = 'stack__title has-tooltip']")
    public WebElement javaList;


//==============================AC03=======================================

    @FindBy(xpath = "(//button[@rel = 'nofollow noreferrer noopener'])[5]")
    public WebElement addCardIcon;

    @FindBy(css = "input[placeholder = 'Card name']")
    public WebElement cardName;

    @FindBy(xpath = "//input[@class = 'icon-confirm']")
    public WebElement addCardConfirmIcon;

    @FindBy(xpath = "//span [.='String']")
    public WebElement stringCard;


//==============================AC04=======================================

    @FindBy(xpath = "//div[@class = 'card-menu']//button")
    public WebElement threeDotsIcon;

    @FindBy(xpath = "(//button[@class = 'action-button focusable'])[6]")
    public WebElement assignToMeButton;

    @FindBy(xpath = "(//div[@aria-label = 'Avatar of Employee145, online'])[2]")
    public WebElement userProfile;

    //==============================AC05=======================================
    @FindBy(xpath = "(//button[@class = 'icon vue-button action-item__menutoggle action-item__menutoggle--default-icon'])[2]")
    public WebElement school3Dots;

    @FindBy(xpath = "//span[.='Edit board']/..")
    public WebElement editBoardButton;

    @FindBy(xpath = "//div[@class='board-edit']//input[1]")
    public WebElement boardRenameBox;

    @FindBy(xpath = "//div[@class='board-edit']//input[2]")
    public WebElement boardRenameConfirmIcon;

    @FindBy(css = "span[title = 'Work']")
    public WebElement workBoard;

//==============================AC06=======================================
    @FindBy(xpath = "(//button[@class = 'icon vue-button action-item__menutoggle action-item__menutoggle--default-icon'])[1]")
    public WebElement personal3Dots;

    @FindBy(xpath = "//span[.='Delete board']/..")
    public WebElement deleteBoardButton;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "//button[@aria-label='Undo changes']")
    public WebElement undoButton;


}
