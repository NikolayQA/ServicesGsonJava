package tests;

import ui.HomePage;
import ui.IPage;
import ui.OwnerPage;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {

    public static void main(String[] args) {
        //Created through interface
        IPage homePage = new HomePage();
        //Normal class instance of type HomePage
        HomePage specificHomePage = new HomePage();
        //Created through interface
        IPage ownerPage = new OwnerPage();

        List<IPage> pages = new ArrayList<>();
        pages.add(homePage);
        pages.add(ownerPage);
        pages.forEach(page -> {
            page.goTo();
            System.out.println(page.pageTitle());
            System.out.println(page.h1());
            System.out.println(page.h2());
        });
        specificHomePage.navigateToItemPage();
    }
}
