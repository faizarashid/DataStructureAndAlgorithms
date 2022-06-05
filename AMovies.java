package ProjectBST;


import ProjectBST.BSTActor.BSTActorNode;
import ProjectBST.BSTMovie.BSTMovieNode;

public class AMovies {
	public class ActedMlist{
		BSTMovieNode movie;
		ActedMlist next;
		
	}
	ActedMlist AMstart;

	public ActedMlist ActedM(BSTActorNode actor, BSTMovieNode newmovie) {
		ActedMlist newnode=new ActedMlist();
	       newnode.movie=newmovie;
	       newnode.next=null;
	        if(actor.movie==null) {
	           return newnode;
	        }
	            else
	            {
	         	   AMstart= actor.movie;  
	         	  ActedMlist temp=AMstart;
	              while(temp.next!=null)
	                  temp=temp.next;
	              temp.next=newnode;
	              newnode.next=null;
	               
	            }
	        return AMstart ;
	}
}
