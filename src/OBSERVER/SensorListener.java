package OBSERVER;

public interface SensorListener {

	public void temperaturaInteriorModificada(ComplexSensorListener sensor, int nuevoValor);
	public void temperaturaExteriorModificada(ComplexSensorListener sensor, int nuevoValor);
	public void humedadModificada(ComplexSensorListener sensor, int nuevoValor);
	
}
