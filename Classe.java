package application;

import java.io.IOException;
import java.util.ArrayList;

public class Classe extends ASTNode {
	private String heritage;
	private ArrayList<String> implemente;
	private ArrayList<String> listeClasses;
	private ArrayList<Attribut> listeAttributs;
	
	public Classe(String nom) {
		super(nom);
		heritage="";
		implemente = new ArrayList<>();
		listeClasses=new ArrayList<>();
		listeAttributs=new ArrayList<>(); 
	}

	public String getHeritage() {
		return heritage;
	}

	public void addImplementation(String imp) {
		this.implemente.add(imp);
	}
	
	public void setHeritage(String heritage) {
		this.heritage = heritage;
	}

	public ArrayList<String> getImplemente() {
		return implemente;
	}

	public ArrayList<String> getListeClasses() {
		return listeClasses;
	}

	public ArrayList<Attribut> getListeAttributs() {
		return listeAttributs;
	}

	@Override
	public void addAttribut(Attribut a) {
		listeAttributs.add(a);
	}

	@Override
	public void addClasse(Classe c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMethode(Methode m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addModifier(String m) {
		// TODO Auto-generated method stub
		
	}
}



