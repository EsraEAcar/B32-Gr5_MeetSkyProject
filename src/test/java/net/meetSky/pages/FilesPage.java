package net.meetSky.pages;

import net.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage extends BasePage {
  public FilesPage(){
      PageFactory.initElements(Driver.getDriver(),this);
  }


    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;


    //@FindBy(xpath = "//span[text()='Upload file']")
  @FindBy(id="file_upload_start")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr[3]/td[2]/a[@class='name']/span[@class='nametext']//span[@class='innernametext']")
    public WebElement uploadedFile;

    //:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

  @FindBy(xpath = "//span[@class='icon icon-folder svg']")
  public WebElement newFolderButton;

  @FindBy(xpath = "//input[@id='view11-input-folder']")
  public WebElement newFolderInput;

  @FindBy(xpath = "//span[@class='innernametext'][1]")
  public WebElement uploadedFolder;

  @FindBy(xpath="//table[@id='filestable']")
  public WebElement table;






}
