package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Deposit {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	//

    private String depositDate;


    private double depositAmount;
 
    public Deposit() {
    	
    }

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(String depositDate) {
		this.depositDate = depositDate;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Deposit( String depositDate, double depositAmount) {
		super();
		this.depositDate = depositDate;
		this.depositAmount = depositAmount;
	}
    
    
    
}
