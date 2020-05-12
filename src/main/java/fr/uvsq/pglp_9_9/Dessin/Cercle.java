package fr.uvsq.pglp_9_9.Dessin;

public class Cercle extends Forme{

	private Point centre;
	private int rayon;
	
	public Cercle(String nomVar) {
		super(nomVar);
		// TODO Auto-generated constructor stub
	}

	
	public void deplace(int x, int y) {
		centre.deplace(x, y);
		
	}
	
	
	 //Afficher le cercle
    public void affiche() {
        super.affiche();
        System.out.println("Cercle ("
                + "centre = " + centre + ", rayon = " + rayon + ")");
    }


	public int getRayon() {
		return rayon;
	}


	public void setRayon(int rayon) {
		this.rayon = rayon;
	}


	public Point getCentre() {
		return centre;
	}


	public void setCentre(Point centre) {
		this.centre = centre;
	}
    
    
    

}