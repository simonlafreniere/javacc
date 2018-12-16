package application;

public class Attribut extends ASTNode{
	private String visibilite;
	private String type;
	
	public Attribut(String nom) {
		super(nom);
	}

	public String getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(String visibilite) {
		this.visibilite = visibilite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void addAttribut(Attribut a) {
		// popup error we are all going to die!!
		// or do nothing..
		
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
