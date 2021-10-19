package com.Gillette.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Gillette.UiStore.GilletteHomePageUi;

public class Gillette {
	WebDriver driver;
	GilletteHomePageUi hpui=new GilletteHomePageUi();
	public Gillette(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickingSearchBox()
	{
		return driver.findElement(hpui.clicksearchBox);
	}
	
	public WebElement searchingShavingcream()
	{
		return driver.findElement(hpui.itemsearch);
	}
	
	public WebElement verifyTitle()
	{
		return driver.findElement(hpui.itemtitle);
	}
	
	public WebElement ShopallProducts()
	{
		return driver.findElement(hpui.shopall);
	}
	
	public WebElement RasorsAndTrimmers()
	{
		return driver.findElement(hpui.randt);
	}
		

	public WebElement TermasAndConditions()
	{
		return driver.findElement(hpui.tc);
	}
	public WebElement CodeOfConduct()
	{
		return driver.findElement(hpui.cc);
	}
		
		
}
