package ui;

public class OwnerPage implements IPage{
    @Override
    public void goTo() {
        System.out.println("Going to Owner page");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing Owner page");
    }

    @Override
    public String pageTitle() {
        return "Owner page";
    }

    @Override
    public String h1() {
        return "Owner page h1 text";
    }

    @Override
    public String h2() {
        return "Owner page h1 text";
    }
}
