package testsFront;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageHome {
	@Test
	public void testNavegarPaginaHome() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.get("http://localhost:3000/");

		driver.findElement(By.cssSelector("a[heref='/cadastro]")).click();
		driver.findElement(By.cssSelector("input[id='nome")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='senha]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button [id='enviar]")).click();
		driver.findElement(By.cssSelector("button [id='mostracadastros']")).click();
	}
}
