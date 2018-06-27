package test;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Controlador {
	
String perfil = "admin";

String nombreT = "Default pcs";	


//================================================================= INICIO ================================================================			

	
	public void loginEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		
		if (perfil.equalsIgnoreCase("admin")) {
			etiquetas.LTVerNuevasActualizaciones();
		}
		
	}

//================================================================= HOJAS ================================================================		
	
	// CREAR HOJAS
	@Test
	public void CreaHojaEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		System.out.println("==================================================================");
		System.out.println("==================== CREAR UNA HOJA ==============================");
		System.out.println("==================================================================");
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.crearHoja();
	}
	
	
	public void cCreaHojaEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.crearHoja();
	}
	
	
	
     //ELIMINAR HOJAS
	
	public void eliminarHojaEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.eliminarHoja();
	}
	

	public void creaHojaIncorrecta() throws InterruptedException {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.crearHojaIncorrecta();
		
	}
	
	//------------------------------------------ CASOS NEGATIVOS HOJAS  ---------------------------------------------------------------------------------------------------
	
		//INTENTAR CREAR HOJA - NOMBRE INGRESANDO NUMEROS 07
		
		@Test
		public void cNombrConNumeros() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tIngresarNumerosEnNombre("4444","5","5","5","5","5","5");
		}
		
		//INTENTAR CREAR HOJA - NOMBRE "VACIO". 08
		
		public void cNombreVacio() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tNombreVacio("","5","5","5","5","5","5");
		}
		
		//INTENTAR CREAR HOJA - ANCHO "VACIO" 09
		
		public void cAnchoVacio() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tAnchoVacio("Ancho Vacio","","5","5","5","5","5");
		}
		
		//INTENTAR CREAR HOJA - ALTO "VACIO" 10
		
		public void cAltoVacio() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tAltoVacio("Alto vacio","5","","5","5","5","5");
	    }
		
		//INTENTAR CREAR HOJA - MARGEN SUPERIOR "VACIO" 11
		
		public void cMargenSuperiorVacio() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
		    etiquetas.tMargenSuperiorVacio("MSuperior Vacio","5","5","","5","5","5");
		}
		
		//INTENTAR CREAR HOJA - MARGEN INFERIOR "VACIO" 12
		
		public void cMargenInferiorVacio() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tMargenInferiorVacio("MInferior Vacio","5","5","5","","5","5");
		}
		
		//INTENTAR CREAR HOJA - MARGEN IZQ "VACIO" 13
		
	    public void cMargenInfeiorIzqVacio() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tMargenIzqVacio("MIzq Vacio","5","5","5","5","","5");
	    }
	    
	    //INTENTAR CREAR HOJA - MARGEN DERECHO "VACIO" 14
	   
		public void cMargenDerechoVacio() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tMargenDerechoVacio("MDerecho Vacio","5","5","5","5","5","");
		}
		
		//INTENTAR CREAR HOJA - TODOS LOS DATOS "VACIOS" 15
		
	    public void cCrearHojaVacia() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaVacia("","","","","","","");
	    }
	   	//INTENTAR CREAR HOJA - CANCELAR 16
	    
		public void cCrearHojaCancelar() {
		    	LoginTest etiquetas = new LoginTest();
				etiquetas.LTIngresarEtiq(perfil);
				etiquetas.tIngresarCrearHoja();
				etiquetas.tCrearHojaCancelar("Crea y Cancela","5","5","5","5","5","5");
	    }
	    
	    //INTENTAR CREAR HOJA - ANCHO INGRESAR LETRAS 17
		
	    public void cCrearHojaAnchoConLetras() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaAnchoConLetras("Ancho con letras","Ancho","5","5","5","5","5");
	    }
		
		//INTENTAR CREAR HOJA - ALTO INGRESAR LETRAS 18
	    
		public void cCrearHojaAltoConLetras() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaAltoConLetras("Alto con Letras","5","Alto","5","5","5","5");
		}
	    
	    //INTENTAR CREAR HOJA - MARGEN SUPERIOR CON LETRAS 19
		
	    public void cCrearHojaMargenSupConLetras() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaMargenSupConLetras("MSuperior con letras","5","5","Msuperior","5","5","5");
	    }
	    
	  //INTENTAR CREAR HOJA - MARGEN INFERIOR CON LETRAS 20
	    
	    public void cCrearHojaMargenInfConLetras() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaMargenInfConLetras("MInferior con letras","5","5","5","Minferior","5","5");
	    }
		
	    //INTENTAR CREAR HOJA - MARGEN IZQ CON LETRAS 21
	    
	    public void cCrearHojaMargenIzqConLetras() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaMargenIzqConLetras("Mizq con letras","5","5","5","5","Mizq","5");
	    }
		
	    //INTENTAR CREAR HOJA - MARGEN DERECHO CON LETRAS 22
	    
	    public void cCrearHojaMargenDerechoConLetras() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaMargenDerechoConLetras("Mizq con letras","5","5","5","5","5","MDerecho");
	    }
	    
	    //INTENTAR CREAR HOJA - MARGENES SUPERAN HOJA 23
	    @Test
	    public void cCrearHojaMargenesSuperanHoja() {
	    	LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.tIngresarCrearHoja();
			etiquetas.tCrearHojaMargenesSuperanHoja("Magenes superan hoja","5","5","50","50","50","50");
	    }
	  
	//================================================================= MARCOS ================================================================	

		// CREAR MARCOS

		public void cCreaMarcoEtiquetas() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil); //Login

		//etiquetas.crearMarco(hojaCreada);
	}
		// ELIMINAR MARCO

		public void cEliminarMarcoEtiquetas() {
			LoginTest etiquetas = new LoginTest();
			etiquetas.LTIngresarEtiq(perfil);
			etiquetas.eliminarMarco();
		}
	
	
	
	
	
	
//================================================================= MARCOS ================================================================	

	// CREAR MARCOS

	public void CCreaMarcoEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil); //Login
		etiquetas.LTCrearMarco();
}
	
	// ELIMINAR MARCO

	public void eliminarMarcoEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.eliminarMarco();
	}

	
	// ----------------------------------------------- CASOS NEGATIVOS MARCOS -------------------------------------------------------------------
	
		// TODOS LOS DATOS "VACIOS"
		
		public void cCreaMarcoCamposVacios() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoVacio(hojaCreada2, "", "", "");
		}
		
		// CREA MARCO - NOMBRE VACIO
		
		public void cCreaMarcoNombreVacio() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoNombreVacio(hojaCreada2, "", "25", "25");
		}
		
		// CREA MARCO - ANCHO VACIO
		
		public void cCreaMarcoAnchoVacio() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoAnchoVacio(hojaCreada2, "Ancho Vacio", "", "25");
		}
		
		// CREA MARCO - ALTO VACIO
		
		public void cCreaMarcoAltoVacio() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoAltoVacio(hojaCreada2, "Alto Vacio", "25", "");
		}
		
		// CREA MARCO - NOMBRE SUPERA LIMITE
		@Test
		public void cCreaMarcoNombreSuperaLimite() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoNombreSuperaLimite(hojaCreada2, "Nombreeeeeeeeeee Superaaaaaaaaaaaaaaa Limiteeeeeeeeeeeeeeee", "25", "25");
		}
		
		// CREA MARCO - ANCHO SUPERA LIMITE
		
		public void cCreaMarcoAnchoSuperaLimite() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoAnchoeSuperaLimite(hojaCreada2, "Ancho supera limite", "255555555555555555555555555", "25");
		}
		
		// CREA MARCO - ALTO SUPERA LIMITE
		
		public void cCreaMarcoAltoSuperaLimite() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoAltoSuperaLimite(hojaCreada2, "Alto supera limite", "25", "255555555555555555555555555555");
		}
		
		// CREA MARCO - CANCELA
		
		public void cCreaMarcoYCancela() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoYCancela(hojaCreada2, "Crea y Cancela", "25", "25");
		}
		
		// CREA MARCO - ALTO INGRESA LETRAS
		
		public void cCreaMarcoAltoIngresaLetras() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoAltoIngresaLetras(hojaCreada2, "Alto con letras", "25", "Alto");
		}
		
		// CREA MARCO - ANCHO INGRESA LETRAS
		
		public void cCreaMarcoAnchoIngresaLetras() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		String hojaCreada2 = etiquetas.crearHoja();
		etiquetas.tCrearMarcoAnchoIngresaLetras(hojaCreada2, "Ancho con letras", "Ancho", "25");
		}
	
	
//================================================================= TEMPLATE ================================================================	
	
	// CREAR TEMPLATES

	public void cCreaTemplateEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.LTCrearTempl();
	}
	

	// ELIMINAR TEMPLATES
	
	public void eliminarTemplateEtiqueta() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.eliminarTempl(nombreT);
	}

//================================================================= REGLAS ================================================================		

	// CREAR REGLA

	public void creaReglaEtiquetas() throws IOException, InterruptedException  {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.crearRegla(null);
	}
	
	
	public void cCreaReglaEtiquetas() throws IOException, InterruptedException  {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.LTCrearRegla();
	}
	
	
	//
	public void eliminarReglaEtiquetas() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.eliminarRegla();
	}

	
//================================================================= IMPRESION ================================================================	
	 


	public void cImprimirEtiqueta() throws InterruptedException {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.LTImprimirProducto();	
	}
	

	public void buscarImpr() {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		etiquetas.buscarImpr();
	}
	
	
//================================================================= PUNTA A PUNTA ================================================================		

	
	// CREAR HOJAS

	public void cEjecutarCircuitoCompleto() throws InterruptedException, IOException {
		LoginTest etiquetas = new LoginTest();
		etiquetas.LTIngresarEtiq(perfil);
		
		String hojaCreada = etiquetas.crearHoja();
		System.out.println("====================================================");
		System.out.println("LA HOJA CREADA ES: " + hojaCreada);
		System.out.println("====================================================");
		TimeUnit.SECONDS.sleep(2);
		
		String marcoCreado = (String) etiquetas.crearMarco(hojaCreada);
		System.out.println("====================================================");
		System.out.println("EL MARCO CREADO ES: " + marcoCreado);
		System.out.println("====================================================");
		TimeUnit.SECONDS.sleep(2);
		
		String templCreado = etiquetas.crearTempl(marcoCreado);
		System.out.println("====================================================");
		System.out.println("EL TEMPLATE CREADO ES: " + templCreado);
		System.out.println("====================================================");
		TimeUnit.SECONDS.sleep(2);
		
		String prodRegla = etiquetas.crearRegla(templCreado);
		System.out.println("====================================================");
		System.out.println("EL PRODUCTO DE LA REGLA CREADA ES: " + prodRegla);
		System.out.println("====================================================");
		TimeUnit.SECONDS.sleep(2);
		
		etiquetas.imprimirProducto(prodRegla);
		System.out.println("====================================================");
		System.out.println("EL PRODUCTO A IMPRIMIR ES EL: " + prodRegla);
		System.out.println("====================================================");
		TimeUnit.SECONDS.sleep(2);
		
	}
	
	
	
	
	
	
	
	
}
