package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage;
    DesktopsPage desktopsPage;

    @BeforeMethod
    public void inIT() {
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        sleep(2000);
        computerPage.clickOnComputer();
        verifyText(computerPage.getComputerText(), "Computers");

    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        sleep(2000);
        computerPage.clickOnComputer();
        desktopsPage.clickOnDesktop();

        verifyText(desktopsPage.getDesktops(), "Desktops");
    }

    @Test(dataProvider = "data-provider")
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {

        computerPage.clickOnComputer();
        desktopsPage.clickOnDesktop();
        desktopsPage.clickOnProductName();
        desktopsPage.selectProcessorFromDropDown(processor, ram);
        desktopsPage.clickOnHDD(hdd);
        System.out.println(processor);
        desktopsPage.clickOnOS(os);
        desktopsPage.clickOnSoftware(software);
        desktopsPage.clickOnAddToCart();
        verifyText(desktopsPage.getProductAdded(), "The product has been added to your shopping cart");


    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        Object[][] desktopDetails =
                {{"2.2 GHz Intel Pentium Dual-Core E2200", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00]"},
                        {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00]", "400 GB [+$100.00]", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00]"},
                        {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]", "320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00]"}
                };
        return desktopDetails;
    }


}
