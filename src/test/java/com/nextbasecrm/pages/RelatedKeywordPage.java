package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelatedKeywordPage {
    public RelatedKeywordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

  /* @FindBy(css = "a[href=\"/company/leaders.php\"]")
    public WebElement relatedKeyword1;
    //Employees -> Honored Employees*/
  @FindBy(xpath = "//a[@href='/company/leaders.php']")
  public WebElement relatedKeyword1;

   /* @FindBy(css = "div[title=\"/Employees -> Find Employee\"]")
    public WebElement relatedKeyword2;*/

    @FindBy(xpath = "//div[@title='Employees -> Find Employee']")
    public WebElement relatedKeyword2;

   // <a href="/company/vis_structure.php" class="search-title-top-item-link"><span class="search-title-top-item-text"><span>Employees</span></span></a>

   /* @FindBy(css = "div[title=\"Employees\"]")
    public WebElement relatedKeyword3;*/
   @FindBy(xpath = "//div[@title='Employees']")
   public WebElement relatedKeyword3;

}
