package fr.uvsq.pglp_9_9.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import fr.uvsq.pglp_9_9.Dessin.Carre;
import fr.uvsq.pglp_9_9.Dessin.Point;

public class RectangleDaoTest {

	public Connection connect = null;
	Statement statement;
	
	public void setUp() {
	
		 
		 try {
		      String sql = "CREATE TABLE Groupe(groupeid varchar(30) primary key not null)";
		      statement = connect.createStatement();
		      statement.execute(sql);
		      sql = "CREATE TABLE Carre(nom varchar(20) PRIMARY KEY NOT NULL, " 
				         + " cote int, x int, y int, "   
				         + "groupeid varchar(30) references groupe(groupeid))";
			  statement.execute(sql);
			  statement.close();
			  
			
		      
		     
		    } catch (SQLException e) {

		      e.printStackTrace();
		    }
		 
	}
	
	@Test
    public void GetterTest() throws Exception {
        Carre r = new Carre("carre1", new Point(0,0), 50);
        assertEquals(r.getNomVar(), "carre1");
        assertTrue(r.getTopLeft().toString().equals("(0,0)"));
        assertTrue(r.getLongueur() == 10);
    }
	
    @Test
    public void ShowTest() throws Exception {
        Carre r = new Carre("carre1", new Point(0,0), 50);
        r.affiche();
    }
    
    @Test
    public void MoveTest() throws Exception {
        Carre r = new Carre("carre1", new Point(0,0), 50);
        r.deplace(10, 20);
        assertTrue(r.getTopLeft().toString().equals("(10,20)"));
    }

}
