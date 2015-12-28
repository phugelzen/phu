package facebook;

import org.openqa.selenium.firefox.FirefoxDriver;


public class test2 


     



// worked and sucessfuly compelted
       {
       FirefoxDriver dr = new FirefoxDriver();
       
       void type()
      {
    	dr.findElementByCssSelector("#email").sendKeys("phugelzen"); 
       dr.findElementByXPath(".//*[@id='pass']").sendKeys("sherpa");  
      dr.findElementByXPath(".//*[@id='loginbutton']").click();
       
      }
        }
//test1 worked perfectly with all feature working