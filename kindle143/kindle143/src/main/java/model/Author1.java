package model;
 import java.sql.SQLException;

import dao.Admintable1;
import dao.Authortable1;
public class Author1 {


	
		private int authorid;
		private String authorname;
		private int userid; 
		private int bookid;
		
		public Author1(int authorid, String authorname, int userid, int bookid) {
			super();
			this.authorid = authorid;
			this.authorname = authorname;
			this.userid = userid;
			this.bookid = bookid;
		}
		
		
		public int getAuthorid() {
			return authorid;
		}
		public void setAuthorid(int authorid) {
			this.authorid = authorid;
		}
		public String getAuthorname() {
			return authorname;
		}
		public void setAuthorname(String authorname) {
			this.authorname = authorname;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		
		public static boolean insertauthordetails(Author1 author) {
			// TODO Auto-generated method stub
			boolean b=false;
			Authortable1 dt;
			try {
				dt = new Authortable1();
				b=dt.insertauthordetails(author);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return b;
			
		}
		
		public static boolean updateAuthorRecord(int val,String toUpdate,int authorid,Author1 author) {
			// TODO Auto-generated method stub
			return false;
		}
		
		public static void showAllauthorrecords() {
			// TODO Auto-generated method stub
			
		}

		public Author1() {
			super();
			// TODO Auto-generated constructor stub
		}



		public static boolean deleteauthorrecord(int bookid) {
			// TODO Auto-generated method stub
			return false;
		}

	}


