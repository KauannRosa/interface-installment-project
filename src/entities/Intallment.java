package entities;
import java.time.*;
import java.time.format.*;
import java.text.*;

public class Intallment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	private Double amount;

	public Intallment(){
	}
	
	public Intallment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	public void setDueDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return date.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
}
