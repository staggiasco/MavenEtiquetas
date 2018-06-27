package etiquetas.etiquetasFravega;

import java.io.IOException;

import test.Controlador;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;



/**
 * Unit test for simple App.
 */



public class AppTest
{
	
//============ TEST FUNCIONALES ==========================================================================================================
	

	@Test
   public void Caso1CrearHoja () {
	   Controlador pruebaUnitaria = new Controlador();
	   pruebaUnitaria.cCreaHojaEtiquetas();
   }

	@Test
   public void Caso2CrearMarco() {
	   Controlador pruebaUnitaria = new Controlador();
	   pruebaUnitaria.CCreaMarcoEtiquetas();
   }
   
	@Test
	public void Caso3CrearTemlp() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCreaTemplateEtiquetas();
	}
   
	@Test
	public void Caso04CrearReglas() throws IOException, InterruptedException {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCreaReglaEtiquetas();
	}
  
	@Test
	public void Caso05ImprimirEtiqueta() throws InterruptedException {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cImprimirEtiqueta();
	}
   
	@Test
	public void Caso06EjecutarCircuitoImpresion() throws InterruptedException, IOException {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cEjecutarCircuitoCompleto();
	}
	
//============================ CASOS NEGATIVOS ==============================================================================	
//	

//	HOJAS
	@Test
	public void Caso07NombresConNumeros() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cNombrConNumeros();
	}
	
	@Test
	public void Caso08NombreVacio() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cNombrConNumeros();
	}
	
	@Test
	public void Caso09AnchoVacio() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cAnchoVacio();
	}
	
	@Test
	public void Caso10AltoVacio() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cAltoVacio();
	}
	
	@Test
	public void Caso11MargenSuperiorVacio() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cMargenSuperiorVacio();
	}
	
	@Test
	public void Caso12MargenInferiorVacio() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cMargenInfeiorIzqVacio();
	}
	
	@Test
	public void Caso13MargenIzquieroVacio() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cMargenInfeiorIzqVacio();
	}
	
	@Test
	public void Caso14MargenDerechoVacio() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cMargenDerechoVacio();
	}
	
	@Test
	public void Caso15CrearHojaVacia() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaVacia();
	}
	
	@Test
	public void Caso16CrearHojaCancelar() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaCancelar();
	}
	
	@Test
	public void Caso17CrearHojaAnchoConLetras() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaAnchoConLetras();
	}
	
	@Test
	public void Caso18CrearHojaAltoConLetras() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaAltoConLetras();
	}
	
	@Test
	public void Caso19CrearHojaMargenSupConLetras() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenSupConLetras();
	}
	
	@Test
	public void Caso20CrearHojaMargenInfConLetras() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenInfConLetras();
	}
	
	@Test
	public void Caso21CrearHojaMargenIzqConLetras() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenIzqConLetras();
	}
	
	
	@Test
	public void Caso22CrearHojaMargenDerechoConLetras() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenDerechoConLetras();
	}
	
	
	@Test
	public void Caso23CrearHojaMargenesSuperanHoja() {
		Controlador pruebaUnitaria = new Controlador();
		pruebaUnitaria.cCrearHojaMargenesSuperanHoja();
	}

	
	
}
