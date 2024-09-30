package entities;
import java.time.*;
import java.util.*;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Intallment> intallments = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Double getTotalValue() {
		return totalValue;
	}
	
	public List<Intallment> getIntallments() {
		return intallments;
	}
	
}
