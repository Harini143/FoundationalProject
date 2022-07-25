package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Kindledao1;
import model.Author1;


	

	public class Authortable1 extends Kindledao1{
		private static Connection con;

	    public Authortable1() throws ClassNotFoundException, SQLException {
	    	con = Kindledao1.getCon();
	    	
	    	
	    }
	    public static boolean insertauthordetails(Author1 author) {
			boolean f = false;
			try {
				PreparedStatement ps = con.prepareStatement(
	                    "insert into author(authorid,authorname,bookid,userid)values(?,?,?,?)");
				
	            ps.setInt(1, author.getAuthorid());
	            ps.setString(2, author.getAuthorname());
	            ps.setInt(3, author.getBookid());
	            ps.setInt(4, author.getUserid());
	           
	            
	           

	            int i=ps.executeUpdate();
	            
	            if(i>0) {

	            //System.out.println("Inserted record successfully...");
	            return true;
				
			}}
				catch (Exception e) {
					e.printStackTrace();
				}
			
				// TODO: handle exceptio
			return f;
		}
	    public static boolean deleteauthorrecord(int authorid) {
			// TODO Auto-generated method stub
			boolean f = false;
			try {
				String query = "delete from author where authorid=?";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1, authorid);
				
				//execute..
				pstmt.executeUpdate();
				
				f = true;
			} catch (Exception e) {
				// TODO: handle exception
			}
			return f;
			
		
		}
	    public static void showAllauthorrecords() { 
			
		
			try {
				String query = "select * from author";
				Statement st = con.createStatement();
				ResultSet set = st.executeQuery(query);
				
				while(set.next()) {
					int authorid = set.getInt(1);
					String authorname = set.getString(2);
					int bookid  = set.getInt(3);
					int userid = set.getInt(4);
					   
					System.out.println("Author ID: " + authorid + " \n Author Name: " + authorname + " \nBook id: " + bookid+ " \nUser id: " + userid);
					
					System.out.println("----------------------------------------------");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		

	public static boolean updateAuthorRecord(int val,String toUpdate,int authorid,Author1 author) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			 
			 if(val == 1) {
					
					
						String query = "update author set authorname=? where authorid=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, authorid);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
				
					String query = "update author set bookid=? where authorid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, authorid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
				
					String query = "update author set userid=? where authorid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, authorid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else{
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	}
	public static void showauthorrecords(int i) {
		
		
	}
	

	}




