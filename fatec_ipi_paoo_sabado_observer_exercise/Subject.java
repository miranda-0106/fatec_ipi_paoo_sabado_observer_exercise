package fatec_ipi_paoo_sabado_observer_exercise;

public interface Subject {
	
	public void addObserver(Observer o);

	public void removeObserver(Observer o);
	
	public void notifyObserver(Observer o);

}
