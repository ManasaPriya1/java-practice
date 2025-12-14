import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String at =driver.getTitle();
		String url = driver.getCurrentUrl();
		String et = "Google";
		String u = "https://www.google.com";
		if(at.equals(et)&& url.equals(u)){
			System.out.println("Both are same");
		}
		else {
			System.out.println("Not same");
		}
		driver.close();
	}
}
