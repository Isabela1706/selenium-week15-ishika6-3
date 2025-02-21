package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    WebElement yes;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'No')]")
    WebElement no;
}

