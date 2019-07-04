package UFC.UFC_app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Entity annotation is a marker annotation. By default, this entity will be mapped to the Book table
public class Stats {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @GeneratedValue annotation is to configure the way of increment of the specified column(field). 
	
	Long fid;
	String striking_accuracy;
	String grappling_accuracy;
	Long wins;
	Long losses;
	Long draws;
	
	public Long getfid() {
		return fid;
	}
	public void setId(Long fid) {
		this.fid = fid;
	}
	public String getstriking_accuracy() {
		return striking_accuracy;
	}
	public void setStriking_accuracy(String striking_accuracy) {
		this.striking_accuracy = striking_accuracy;
	}
	public String getgrappling_accuracy() {
		return grappling_accuracy;
	}
	public void setgrappling_accuracy(String grappling_accuracy) {
		this.grappling_accuracy = grappling_accuracy;
	}
	public Long getwins() {
		return wins;
	}
	public void setwins(Long wins) {
		this.wins = wins;
	}
	public Long getlosses() {
		return losses;
	}
	public void setlosses(Long losses) {
		this.losses = losses;
	}
	public Long getdraws() {
		return draws;
	}
	public void setdraws(Long draws) {
		this.draws = draws;
	}
}
