package application;

import java.util.List;

public abstract class ASTNode {
	protected String nom;
	protected String visibilite;
	
	public ASTNode(String nom) {
		this.nom=nom;
	}
	 
	public String getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(String visibilite) {
		this.visibilite = visibilite;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String newNom) {
		nom=newNom;
	}
	
	public abstract void addAttribut(Attribut a);
	public abstract void addClasse(Classe c);
	public abstract void addMethode(Methode m);
	public abstract void addModifier(String m);
}
