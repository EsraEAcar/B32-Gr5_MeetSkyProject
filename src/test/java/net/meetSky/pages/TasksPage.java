package net.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage{



    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addListLink;
    @FindBy(xpath= "//input[@id= 'newListInput']")
    public WebElement newListInputBox;

    @FindBy(css= "input[class='transparent reactive']")
    public WebElement addTaskInputBox;





}
