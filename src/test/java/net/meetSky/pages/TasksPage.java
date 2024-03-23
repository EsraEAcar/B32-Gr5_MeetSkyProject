package net.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage{


    //==============================AC01=======================================
    @FindBy(xpath = "(//button[@rel = 'nofollow noreferrer noopener'])[1]")
    public WebElement navigationButton;

    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addListLink;
    @FindBy(xpath= "//input[@id= 'newListInput']")
    public WebElement listNameBox;

    @FindBy(xpath = " (//input[@title='Save'])[2]")
    public WebElement saveIcon;





    //==============================AC02=======================================
    @FindBy(xpath = "//span[@title='School']")
    public WebElement newList;

    @FindBy(css= "input[class='transparent reactive']")
    public WebElement addTaskBox;

    @FindBy(xpath = "//span[text()='Homeworks']")
    public WebElement newTask;

    //==============================AC03=======================================
    @FindBy(css = "span[class='material-design-icon checkbox-blank-outline-icon']")
    public WebElement checkboxTask;

    @FindBy(css = "span[title='Completed']")
    public WebElement completedList;

    @FindBy()
    public WebElement counterCompleted;

    //==============================AC04=======================================

    @FindBy(xpath = "(//span[@class='material-design-icon star-icon'])[1]")
    public WebElement star;

    @FindBy(css = "span[title='Important']")
    public WebElement importantList;

    @FindBy()
    public WebElement counterImportant;


    //==============================AC05=======================================

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[8]")
    public WebElement counterUncompleted;

}
