package com.pablomonteserin.paraquesirveunainterfaz;

public class ImplementacionITraducir implements ITraducir {

	@Override
	public String traduceAlSpanish(String txt) {
		//TraductorPaco traductor = new TraductorPaco();
		//String traduccion = traductor.convierteAIngles(txt);
		
		MasterTraducer mt = new MasterTraducer();
		String traduccion = mt.traducePlease(txt);
		return traduccion;
	}

}
