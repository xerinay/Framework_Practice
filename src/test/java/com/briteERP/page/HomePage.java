package com.briteERP.page;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='oe_secondary_menu_section active']//span[@class='oe_menu_text'][contains(text(),'Dashboard')]")
    public WebElement dashBoardElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[8]")
    public WebElement ordersOrdersElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[9]")
    public WebElement ordersSessionsElement;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[2]/li[1]/a/span")
    public WebElement catalogProductsElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[11]")
    public WebElement catalogPriceListElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[12]")
    public WebElement reportingOrdersElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[13]")
    public WebElement reportingSalesDetailsElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]")
    public WebElement configPosElement;

    @FindBy(xpath = "//span[contains(text(),'PoS Categories')]")
    public WebElement POSCategoriesElement;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[6]/a/span")
    public WebElement pointOfSaleElement;


    @FindBy(xpath = "//div[@class='o_mail_chat_sidebar']")
    public WebElement sideBarElement;

    @FindBy(xpath  ="/html[1]/body[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
    public WebElement productButton;

    public String currentTitle = "Point of Sale - Odoo";

}
