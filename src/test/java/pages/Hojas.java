package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class Hojas extends AbstractPageObject {

	public Hojas(WebDriver driver, WebDriverWait driverWait) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	WebDriverWait wait = new WebDriverWait(driver, 30);
	private static final TimeUnit SECONDS = null;

	private static final String String = null;

	private String nombre = "CartaTest";
	private float ancho = 10;
	private float alto = 10;
	String orienHoja = "Horizontal";
	int r = (int) (Math.random() * 10000);

	// String nombreHoja = "HojaMobileF";
	String nombreHoja = "Carta";
	String reg = "papers_length";
	

	public void ingresarAHoja() {
		WebElement hoja = driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[2]/a"));
		hoja.click();
	}
	
	
	public void ingresarCrearHoja() {
		System.out.println("sección ingresarNuevaHoja");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement nuevaHoja = driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[2]/ul/li[1]/a"));
		nuevaHoja.click();	
	}

	public String crearNuevaHoja() {

		System.out.println("metodo ingresarNuevaHoja");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement nuevaHoja = driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[2]/ul/li[1]/a"));
		nuevaHoja.click();

		String nombreHoja = (nombre + (r));
		driver.findElement(By.id("name")).sendKeys(nombreHoja);
			
		driver.findElement(By.id("width")).sendKeys(Float.toString(ancho));
		driver.findElement(By.id("height")).sendKeys(Float.toString(alto));
		new Select(driver.findElement(By.id("cmbOrientation"))).selectByVisibleText(orienHoja);
		driver.findElement(By.id("btnSave")).click();
		new Select(driver.findElement(By.name("papers_length"))).selectByValue("100");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("SE HA CREADO LA HOJA CORRECTAMENTE.");
		
		return nombreHoja;

	}

	
	public void eliminarHoja() {

		int i = 0;
		WebElement verHoja = driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[2]/ul/li[2]/a"));
		verHoja.click();

		mostrarRegistros(reg);
		
		WebElement tdbody = driver.findElement(By.xpath("//*[@id=\"papers\"]/tbody"));

		List<WebElement> trs = tdbody.findElements(By.xpath("tr"));

		for (WebElement td : trs) {

			i++;

			System.out.println("========================");
			System.out.println("    La TR de la Tabla   ");
			System.out.println("========================");

			List<WebElement> tds = td.findElements(By.tagName("td"));

			for (WebElement g : tds) {

				String nomElem = g.getText();

				if (nomElem.equalsIgnoreCase(nombreHoja)) {
					// g.findElement(By.xpath("/td[0]/button")).click();
					nomElem = "BORRADO";
					td.findElement(By.xpath("//*[@id=\"papers\"]/tbody/tr[" + i + "]/td[1]/button")).click();

					WebElement botonConf = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button[1]"));
					wait.until(ExpectedConditions.visibilityOf(botonConf));
					botonConf.click();

				}
				System.out.println(nomElem);
			}

			System.out.println("Contador en :" + i);

		}

	}

	public void mostrarRegistros(String reg) {
		WebElement registro = driver.findElement(By.name(reg));
		new Select(registro).selectByValue("100");
	}
	
	
	public void crearMargenesIncorrectos() throws InterruptedException {
		WebElement nuevaHoja = driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[2]/ul/li[1]/a"));
		nuevaHoja.click();

		driver.findElement(By.id("name")).sendKeys(nombre);
		driver.findElement(By.id("width")).sendKeys(Float.toString(ancho));
		driver.findElement(By.id("height")).sendKeys(Float.toString(alto));
		new Select(driver.findElement(By.id("cmbOrientation"))).selectByVisibleText(orienHoja);

		WebElement titNom = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div[1]/div[1]/div/label"));
		Assert.assertEquals("Nombre",titNom.getText());
		
		
		
		WebElement mtop = driver.findElement(By.id("margin-top"));
		WebElement mbotton = driver.findElement(By.id("margin-bottom"));
		WebElement mleft = driver.findElement(By.id("margin-left"));
		WebElement mright = driver.findElement(By.id("margin-right"));

		mtop.clear();
		mbotton.clear();
		mleft.clear();
		mright.clear();

		mtop.sendKeys("5");
		mbotton.sendKeys("5");
		mleft.sendKeys("5");
		mright.sendKeys("5");

		driver.findElement(By.id("btnSave")).click();

		TimeUnit.SECONDS.sleep(1);

		WebElement messageErr = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"));
		wait.until(ExpectedConditions.visibilityOf(messageErr));
		//String errDesc = messageErr.getText();
		Assert.assertEquals("Conflict: Ya existe una entidad con esas propiedades.", messageErr.getText());
		System.out.println("---SALIO TODO BIEN---");
	}
	

	public void CasosNegativosHojas(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
        
		
		//WebElements
		WebElement wnombre = driver.findElement(By.xpath("//*[@id=\"name\"]"));
	    WebElement wancho = driver.findElement(By.xpath("//*[@id=\"width\"]"));
	    WebElement walto =  driver.findElement(By.xpath("//*[@id=\"height\"]"));
	    WebElement wsuperior = driver.findElement(By.xpath("//*[@id=\"margin-top\"]"));
	    WebElement winferior = driver.findElement(By.xpath("//*[@id=\"margin-bottom\"]"));
	    WebElement wizq = driver.findElement(By.xpath("//*[@id=\"margin-left\"]"));
	    WebElement wderecho = driver.findElement(By.xpath("//*[@id=\"margin-right\"]"));
	    
		//Limpiar campos
	    wnombre.clear();
	    wancho.clear();
	    walto.clear();
	    wsuperior.clear();
	    winferior.clear();
	    wizq.clear();
	    wderecho.clear();
	    	    
		//Ingresando Datos
		wnombre.sendKeys(nombre);
		wancho.sendKeys(ancho);
		walto.sendKeys(alto);
		new Select(driver.findElement(By.id("cmbOrientation"))).selectByVisibleText("Horizontal");
		wsuperior.sendKeys(msuperiro);
		winferior.sendKeys(minferior);
		wizq.sendKeys(mizq);
		wderecho.sendKeys(mderecho);
		
		if (nombre == "Crea y Cancela") {
			driver.findElement(By.xpath("//*[@id=\"btnCancel\"]")).click();	
			WebElement msjhojas = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/h2"));
			Assert.assertEquals(msjhojas.getText(),"Hojas");
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"btnSave\"]/span[1]")).click();
			
			switch(nombre){
			 
			case "4444":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;    
			case "" :
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='toast-container']/div/div[2]"))).click();
				break; 
			case "Ancho Vacio":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div"))).click();
				break;
			case "Alto Vacio":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
			case "MSuperior Vacio":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;
			case "MInferior Vacio":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;
			case "MDerecho Vacio":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;
			case "Ancho con letras":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div"))).click();
				break;
			case "Alto con Letras":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;	
			case "MSuperior con letras":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;	
			case "MInferior con letras":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;	
			case "Mizq":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;		
			case "MDerecho":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;	
			case "Magenes superan hoja":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toast-container\"]/div/div[2]"))).click();
				break;		
				
				
		   }
		  }
		 }
	
	
	
	
	
	
	
	
}