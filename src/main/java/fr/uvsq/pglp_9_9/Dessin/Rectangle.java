package fr.uvsq.pglp_9_9.Dessin;

public class Rectangle extends Forme{

	private Point topLeft;
	private int longueur;
	private int largeur;
	
	
	 public Rectangle(String nomVar, Point topLeftPosition,int longueurRectangle, int largeurRectangle)
	   {
		 super(nomVar);
		 try {
			topLeft = topLeftPosition.clone();
	        setLargeur(largeurRectangle);
	        setLongueur(longueurRectangle);
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
	        
	        
	    }
	 
	 
	

	@Override
	public void deplace(int x, int y) {
		topLeft.deplace(x, y);
		
	}
	
	public void affiche() {
        super.affiche();
        System.out.println("Rectangle (longueur = "
                + longueur + ", largeur = " + largeur
                + ", position en haut à gauche = " + topLeft + ")");
    }

	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	
	
	

}
