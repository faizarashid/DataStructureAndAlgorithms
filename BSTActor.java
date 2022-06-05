package ProjectBST;



import ProjectBST.AMovies.ActedMlist;

import ProjectBST.BSTMovie.BSTMovieNode;

public class BSTActor {
	BSTActorNode Actorroot;
	BSTActorNode ploc,loc;
	public class BSTActorNode{
		String Actor_name;
		ActedMlist movie;
		BSTActorNode Rchild;
		BSTActorNode Lchild;
	}
	public boolean isEmpty() {return Actorroot==null;}
	public void search(String name) {
		 ploc=null; loc=Actorroot;
		    while(loc!=null&&(name.compareTo(loc.Actor_name)!=0))
		    {  
		    	if(name.compareTo(loc.Actor_name)<-1)
		      {ploc=loc; loc=loc.Lchild;

		      }
		    else 
		    {ploc=loc; loc=loc.Rchild;
		    
		    }
		    
		    }
		    
		
		
	}
	public BSTActorNode InsertActor(String name,BSTMovieNode newmovie){
		 
		 BSTActorNode node=new BSTActorNode();
		 node.Actor_name=name;
		 this.search(name);// it will search the director name and if it already exists in director tree then loc will have that reference
		 AMovies obj=new AMovies ();
		 node.movie=obj.ActedM(node, newmovie);
        if(isEmpty()){
        	
       	 Actorroot=node;
         
     }
     
     else if(loc==null){
     BSTActorNode tloc=Actorroot, tploc=null;
     
     while(tloc!=null){ //the director name does not exist in the tree
   	 
     if(name.compareTo(tloc.Actor_name)<-1)
     { tploc=tloc;
     tloc=tloc.Lchild;}
     else {
     tploc=tloc;
     tloc=tloc.Rchild;
     }   }
     if(name.compareTo(tploc.Actor_name)<-1){
         tploc.Lchild=node;}
         else{
          tploc.Rchild=node;
         }return node;
         }
        
        
     else //loc is not equal to null that means director exists in the tree loc containts the reference of that director 
    	 // it will update that director and add movie in that director node
    	 loc.movie=obj.ActedM(loc,newmovie);
    	 return loc;
    	 
     


        
}
}
