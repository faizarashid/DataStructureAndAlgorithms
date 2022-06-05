package ProjectBST;



import ProjectBST.BSTDIrector.BSTDirectorNode;
import ProjectBST.BSTMovie.BSTMovieNode;
public class BSTDirectedMovie {
	 public static class DirectedMovieslist{
	        BSTMovieNode movie;
	        DirectedMovieslist next;
	    }
	    DirectedMovieslist DMstart;
	    public boolean isempty() {return DMstart==null;}
	    public DirectedMovieslist DirectedM(BSTDirectorNode director,BSTMovieNode movie) {
	           DirectedMovieslist newnode=new DirectedMovieslist();
	          newnode.movie=movie;
	          
	           if(director.movie==null) {
	              return newnode;
	           }
	               else
	               {
	            	   DMstart= director.movie;  
	            	   DirectedMovieslist temp=DMstart;
	                 while(temp.next!=null)
	                     temp=temp.next;
	                 temp.next=newnode;
	                 newnode.next=null;
	                  
	               }
	           return DMstart ;
	           }
}
