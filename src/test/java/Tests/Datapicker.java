package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Datapicker extends MainChrome{

    @Test
    public void Data()
    {
        // Navigate to the URL
        chromeDriver.get("https://jqueryui.com/datepicker/");
        // Maximize the browser window
        chromeDriver.manage().window().maximize();

        // Switch to the iframe containing the datepicker
        chromeDriver.switchTo().frame(chromeDriver.findElement(By.className("demo-frame")));

        //click dateInput field

        WebElement dateInput = chromeDriver.findElement(By.xpath("//input[@id='datepicker']"));
        dateInput.click();

        // Click the button to navigate to the next month

        WebElement nextmonth = chromeDriver.findElement(By.cssSelector(".ui-datepicker-next"));
        nextmonth.click();

      // Select the date "22" from the datepicker
        WebElement datetoselect =chromeDriver.findElement(By.xpath("//a[text()='22']"));
        datetoselect.click();

        // Get the selected date value and print it to the console
        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected date: " + selectedDate);

        // Close the browser window and quit the WebDriver instance
       // chromeDriver.quit();









    }






}
