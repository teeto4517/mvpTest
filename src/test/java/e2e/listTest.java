package e2e;

import org.testng.annotations.Test;
import pages.homePage;
import pages.listPage;
import utility.baseClass;

public class listTest extends baseClass {
    homePage home;
    listPage list;

    @Test
    public void setListMethod ()  {
        home = baseClass.visitSite();
        list = home.listView();
        list.countList("b");
    }
}
