package ui;

public class HomePage implements IPage {
    @Override
    public void goTo() {
        System.out.println("Going to HomePage");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing the page");
    }

    @Override
    public String pageTitle() {
        return "Home page";
    }

    @Override
    public String h1() {
        return "Home h1 text";
    }

    @Override
    public String h2() {
        return "Home h2 text";
    }

    public void navigateToItemPage(){
        System.out.println("Navigating to Item page");
    }
}
