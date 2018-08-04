package device.ios;

public class DeviceActionsIOS implements interfaces.DeviceActionsInterface {

	@Override
	public String pressBack(){
		return "navigationBar().buttons.element(boundBy: 0).tap()";
	}
	
	@Override
	public String screenshot() {
		return "\n\n\toverride func tearDown() { \n" +
				"\t\tif let failureCount = testRun?.failureCount, failureCount > 0 { \n" +
				"\t\t\tlet screenshot = XCUIScreen.main.screenshot()\n" +
				"\t\t\tlet attach = XCTAttachment(screenshot: screenshot)\n" +
				"\t\t\tadd(attach)\n\t\t}" +
				"\n\t\tsuper.tearDown()\n\t}";
	}
	
}
