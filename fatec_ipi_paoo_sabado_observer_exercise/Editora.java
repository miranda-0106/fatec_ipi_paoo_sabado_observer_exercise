package fatec_ipi_paoo_sabado_observer_exercise;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;	

public class Editora implements Subject {
	
	public Entregavel e = new Entregavel();
	
	private List<Observer> observers = new LinkedList<>();
	
	private double cancelamento;
	
	public void iniciar() {
		Calendar rightNow = Calendar.getInstance();
		int dayOfWeek = rightNow.get(Calendar.DAY_OF_WEEK);
		
		while (observers.size() != 0) { //Utilizamos o while para podermos visualizar o funcionamento até a editora falir. 
			
			for (Observer o : observers) {
				
				this.cancelamento = Math.round((new Random().nextDouble() * 1)*100);
				this.cancelamento = cancelamento/100;
				if (o.getAssinatura() == "diario") {
					e.conteudo = "Estadão";
					notifyObserver(o);
					cancelar(this.cancelamento, o);
				}
				
				if (o.getAssinatura() == "semanal" & dayOfWeek == 7) { //Dia definido para recebimento semanal.
					e.conteudo = "Marie Claire";
					notifyObserver(o);
					cancelar(this.cancelamento, o);				
				} 
				
				if (o.getAssinatura() == "fds" & ((dayOfWeek == 7) || (dayOfWeek == 1))) {
					e.conteudo = "Estadão Fds!";
					notifyObserver(o);
					cancelar(this.cancelamento, o);				
				}	
			}
		} 
		System.out.println("Faliu!");
	}
	
	public void cancelar (double x, Observer o) {
		if (x == 0.1) {
			removeObserver(o);
			System.out.println("Tivemos um Cancelamento!");
		} 
	}

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObserver(Observer o) {
		o.update(e);
	}

}


