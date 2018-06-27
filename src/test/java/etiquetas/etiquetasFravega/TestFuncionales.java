package etiquetas.etiquetasFravega;

import java.io.IOException;

import test.Controlador;
import org.junit.Test;



/**
 * Unit test for simple App.
 */



public class TestFuncionales
	
{
	
//============ TEST FUNCIONALES ==========================================================================================================
	
	
	@Test
   public void Caso01CrearHoja () {
	   Controlador pruebaUnitaria = new Controlador();
	   pruebaUnitaria.cCreaHojaEtiquetas();
   }

	@Test
   public void Caso02CrearMarco() {
	   Controlador pruebaUnitaria = new Controlador();
	   pruebaUnitaria.CCreaMarcoEtiquetas();
   }
   
	@Test
	public void Caso03CrearTemlp() {
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
		
	
}
