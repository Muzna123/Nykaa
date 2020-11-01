package genericLibrary;

import org.openqa.selenium.Dimension;

public class CommonUtils extends BaseClass {

	public void scrollBottomToTop() {
		Dimension dem=driver.manage().window().getSize();
		double x = dem.getWidth();
		double y = dem.getHeight();
		int startx=(int)(x/2);
		int starty=(int)(y*0.8);
		int endx=startx;
		int endy=(int)(y*0.4);
		driver.swipe(startx, starty, endx, endy, 500);
	}

}
