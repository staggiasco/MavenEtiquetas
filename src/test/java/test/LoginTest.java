package test;




import java.io.IOException;

import org.apache.xalan.xsltc.compiler.Template;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import pageFactory.AbstractPageObject;
import pages.DashBoard;
import pages.Hojas;
import pages.HomePage;
import pages.Impresion;
import pages.Marcos;
import pages.Reglas;
import pages.Templates;

public class LoginTest extends BaseTest {
	
	//CONSTRUCTOR
	
	public LoginTest() {
		super.setup();
		}	
	
//================================================================= INICIO ================================================================		
	
	public void LTIngresarEtiq(String perfil) {
		HomePage homePage = new HomePage(driver, driverWait);
		homePage.ingresarEtiquetas(perfil);
		}
	
	public void LTVerNuevasActualizaciones() {
		DashBoard dashboard = new DashBoard(driver, driverWait);
		dashboard.verNuevasActualizaciones();
	}
	
//================================================================= HOJAS ================================================================	

	public String crearHoja() {
		Hojas hojas = new Hojas(driver, driverWait);
		hojas.ingresarAHoja();
		//hojas.crearNuevaHoja(); // Version 1.0
		String nombreHoja = hojas.crearNuevaHoja();
	
		return nombreHoja;
	}
	
	
	public void tIngresarCrearHoja() {
		Hojas hojas = new Hojas(driver, driverWait);
		hojas.ingresarAHoja();
		hojas.ingresarCrearHoja();
	}

	public void eliminarHoja() {
		Hojas hojas = new Hojas(driver, driverWait);
		hojas.ingresarAHoja();
		hojas.eliminarHoja();
	}

	
	
	public void crearHojaIncorrecta() throws InterruptedException {
		Hojas hojas = new Hojas(driver, driverWait);
		hojas.ingresarAHoja();
		hojas.crearMargenesIncorrectos();
	}
	
	
	//--------------------------------------------- CASOS NEGATIVOS HOJAS ---------------------------------------------------------------------------------------
	
	
		public void tIngresarNumerosEnNombre(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.ingresarCrearHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tNombreVacio(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.ingresarCrearHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tAnchoVacio(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.ingresarCrearHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tAltoVacio(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tMargenSuperiorVacio(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);	
		}
		
		public void tMargenInferiorVacio(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tMargenIzqVacio(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tMargenDerechoVacio(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
	    }
		
		public void tCrearHojaVacia(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tCrearHojaCancelar(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tCrearHojaAnchoConLetras(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		public void tCrearHojaAltoConLetras(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho);
		}
		
		  public void tCrearHojaMargenSupConLetras(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
			Hojas hojas = new Hojas(driver, driverWait);
			hojas.ingresarAHoja();
			hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho); 
		}
		  
		    public void tCrearHojaMargenInfConLetras(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
		    	Hojas hojas = new Hojas(driver, driverWait);
				hojas.ingresarAHoja();
				hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho); 	
		}
		    
		    public void tCrearHojaMargenIzqConLetras(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
		    	Hojas hojas = new Hojas(driver, driverWait);
				hojas.ingresarAHoja();
				hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho); 
		}
		
		    public void tCrearHojaMargenDerechoConLetras(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
		    	Hojas hojas = new Hojas(driver, driverWait);
				hojas.ingresarAHoja();
				hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho); 
		}
		 
		    public void tCrearHojaMargenesSuperanHoja(String nombre, String ancho, String alto, String msuperiro, String minferior, String mizq, String mderecho) {
		    	Hojas hojas = new Hojas(driver, driverWait);
				hojas.ingresarAHoja();
				hojas.CasosNegativosHojas(nombre,ancho,alto,msuperiro,minferior,mizq,mderecho); 
		}
	
	
	
//================================================================= MARCOS ================================================================		
	
	public String crearMarco(String hojaCreada) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		//marcos.crearNuevoMarco(hojaCreada); // Version1.0
		String nombreMarco = marcos.crearNuevoMarco(hojaCreada);
		
		return nombreMarco;		
	}
	
	
	public void LTCrearMarco() {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CrearNuevoMarcoUnitrio();
	}
	
	
	public void eliminarMarco( ) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.eliminarMarco();
	}
	
	
//-------------------------------------------------------------- CASOS NEGATIVOS MARCOS -----------------------------------------------------
	
	
		// CREA MARCO - VACIO
		public void tCrearMarcoVacio(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
			
		// CREA MARCO - NOMBRE VACIO
		public void tCrearMarcoNombreVacio(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
			
		// CREA MARCO - ANCHO VACIO
		public void tCrearMarcoAnchoVacio(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
		
		// CREA MARCO - ALTO VACIO
		public void tCrearMarcoAltoVacio(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
			
		// CREA MARCO - NOMBRE SUPERA LIMITE
		public void tCrearMarcoNombreSuperaLimite(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
		
		// CREA MARCO - ANCHO SUPERA LIMITE
		public void tCrearMarcoAnchoeSuperaLimite(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}

		
		// CREA MARCO - ALTO SUPERA LIMITE
		public void tCrearMarcoAltoSuperaLimite(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
		
		// CREA MARCO - CANCELA
		public void tCrearMarcoYCancela(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
		
		// CREA MARCO - ALTO INGRESA LETRAS
		public void tCrearMarcoAltoIngresaLetras(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
		
		// CREA MARCO - ANCHO INGRESA LETRAS
		public void tCrearMarcoAnchoIngresaLetras(String hojaCreada2, String nombre, String ancho, String alto) {
		Marcos marcos = new Marcos(driver, driverWait);
		marcos.ingresarAMarco();
		marcos.CasosNegativosMarcos(hojaCreada2,nombre,ancho,alto);
		}
		
	
	
	
//================================================================= TEMPLATE ================================================================		
	
	public String crearTempl(String marcoCreado) {
		Templates templ = new Templates(driver, driverWait);
		templ.ingresarATemplate();
		String nombreTempl = templ.crearNuevoTempl(marcoCreado);
				
		return nombreTempl;
		
	}
	
	public void LTCrearTempl() {
		Templates templ = new Templates(driver, driverWait);
		templ.ingresarATemplate();
		templ.CrearNuevoTemplUnitario();
	}
	
	
	
	public void eliminarTempl(String nombreT) {
		Templates templ = new Templates (driver, driverWait);
		templ.ingresarATemplate();
		templ.borrarTemplate(nombreT);
	}
	
//================================================================= REGLAS ================================================================	
	
	public String crearRegla(String templCreado) throws IOException, InterruptedException {
		Reglas regla = new Reglas(driver, driverWait);
		regla.ingresarAReglas();
		//regla.crearNuevaRegla(templCreado);
		String prodRegla = regla.crearNuevaRegla(templCreado);
		
		return prodRegla;
	}
	
	
	public void LTCrearRegla() throws InterruptedException {
		Reglas regla = new Reglas(driver, driverWait);
		regla.ingresarAReglas();
		regla.crearNuevaReglaUnitaria();

	}
	
	
	public void eliminarRegla() {
		Reglas regla = new Reglas(driver, driverWait);
		regla.ingresarAReglas();
		regla.eliminarRegla();
	}

//================================================================= IMPRESION ================================================================	
	
	public void imprimirProducto (String prodRegla) throws InterruptedException {
		Impresion impresion = new Impresion (driver, driverWait);
		impresion.ingresoAImpresion();
		impresion.crearNuevaImpresion();
		impresion.seleccionarFiltro(prodRegla);
		impresion.seleccionProducto();
		impresion.imprimirEtiquetas();
	}
	
	
	public void LTImprimirProducto () throws InterruptedException {
		Impresion impresion = new Impresion (driver, driverWait);
		impresion.ingresoAImpresion();
		impresion.crearNuevaImpresion();
		impresion.seleccionarFiltroUnitario();
		impresion.seleccionProducto();
		impresion.imprimirEtiquetas();
	}
	
	

	
	public void buscarImpr () {
		Impresion impresion = new Impresion (driver, driverWait);
		impresion.ingresoAImpresion();
		impresion.buscarImpresion(null);
	}

}