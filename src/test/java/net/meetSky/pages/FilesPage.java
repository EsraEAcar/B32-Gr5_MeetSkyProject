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

  //1EC :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

  @FindBy(id="file_upload_start")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr[3]/td[2]/a[@class='name']/span[@class='nametext']//span[@class='innernametext']")
    public WebElement uploadedFile;

    //2EC  :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

  @FindBy(xpath = "//span[@class='icon icon-folder svg']")
  public WebElement newFolderButton;

  @FindBy(xpath = "//input[@id='view11-input-folder']")
  public WebElement newFolderInput;

  @FindBy(xpath = "//span[@class='innernametext'][1]")
  public WebElement uploadedFolder;

  @FindBy(xpath="//table[@id='filestable']")
  public WebElement table;

  //3EC  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  @FindBy(xpath = "//label[starts-with(@for,'select-files-')]")
  public WebElement selectCheckBox;


  @FindBy(xpath = "//a[@ class='actions-selected']/span[@class='icon icon-more']")
  public WebElement threeDotsMenu;

  @FindBy(xpath = "//span[@class='icon icon-delete']")
  public WebElement deleteIcon;

  // 4EC :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  @FindBy(xpath =" //td[@class='filesummary']")
  public WebElement totalNumberOfFilesAndFolders;






}
