package jeu;

public class Personnage {
		
	protected String nom;
	protected int force;
	protected int agilite;
	protected int endurance;
	protected int intelligence;
	protected int sagesse;
	protected Race race;
	
	
	public  String getNom() {
		return nom;
		
	}
	
	public int  getForce() {
		return force;
		
	}
	public int  getAgilite() {
		return agilite;
		
	}
	public int  getEndurance() {
		return endurance;
		
	}
	public int getIntelligence() {
		return agilite;
		
	}
	public int getSagesse() {
		return sagesse;
		
	}
	
	public void personnage() {
		this.nom="Sans nom";
		this.force=10;
		this.agilite=10;
		this.endurance=10;
		this.intelligence=10;
		this.sagesse=10;
		this.race= new Humain();
	}
	}
}
