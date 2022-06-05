package ProjectBST;


import ProjectBST.BSTDirectedMovie.DirectedMovieslist;
import ProjectBST.BSTMovie.BSTMovieNode;

public class BSTDIrector {
	BSTDirectorNode Directorroot;
	BSTDirectorNode ploc,loc;
	class BSTDirectorNode{
		String Director_name;
		DirectedMovieslist movie;
		BSTDirectorNode Rchild;
		BSTDirectorNode Lchild;
	}
	public boolean isEmpty() {return Directorroot==null;}
	public void search(String name) {
		 ploc=null; loc=Directorroot;
		    while(loc!=null&&(name.compareTo(loc.Director_name)!=0))
		    {  
		    	if(name.compareTo(loc.Director_name)<-1)
		      {ploc=loc; loc=loc.Lchild;

		      }
		    else 
		    {ploc=loc; loc=loc.Rchild;
		    
		    }
		    
		    }
		    
		
		
	}
	public BSTDirectorNode InsertDirector(String name,BSTMovieNode newmovie){
		 
		 BSTDirectorNode node=new BSTDirectorNode();
		 node.Director_name=name;
		 this.search(name);// it will search the director name and if it already exists in director tree then loc will have that reference
		 BSTDirectedMovie obj=new BSTDirectedMovie ();
		 node.movie=obj.DirectedM(node, newmovie);
        if(isEmpty()){
        	
       	 Directorroot=node;
         
     }
     
     else if(loc==null){
     BSTDirectorNode tloc=Directorroot, tploc=null;
     
     while(tloc!=null){ //the director name does not exist in the tree
   	 
     if(name.compareTo(tloc.Director_name)<-1)
     { tploc=tloc;
     tloc=tloc.Lchild;}
     else {
     tploc=tloc;
     tloc=tloc.Rchild;
     }   }
     if(name.compareTo(tploc.Director_name)<-1){
         tploc.Lchild=node;}
         else{
          tploc.Rchild=node;
         }return node;
         }
        
        
     else //loc is not equal to null that means director exists in the tree loc containts the reference of that director 
    	 // it will update that director and add movie in that director node
    	 loc.movie=obj.DirectedM(loc,newmovie);
    	 return loc;
    	 
     


        
}
	






}