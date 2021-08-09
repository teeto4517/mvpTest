package e2e;

import org.testng.annotations.Test;
import pages.alertsAndModalPage;
import pages.homePage;
import utility.baseClass;

public class modalTest extends baseClass {
    homePage home;
    alertsAndModalPage alerts;

    @Test
    public void setModal () throws InterruptedException {
        home = baseClass.visitSite();
        alerts = home.navigateAlertsAndModal();
        alerts.clickModal();
        alerts.checkModalDisplay();
    }
}
