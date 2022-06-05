package ProjectBST;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Algo.Genre.GenresSinglyList;
import Algo.MovieNode.MovieDoublyListNode;
import Algo.Plot.PlotSinglyList;
import ProjectBST.AMovies.ActedMlist;
import ProjectBST.BSTActor.BSTActorNode;
import ProjectBST.BSTDIrector.BSTDirectorNode;
import ProjectBST.BSTDirectedMovie.DirectedMovieslist;





public class BSTMovie {
	BSTMovieNode Movieroot;
	BSTMovieNode ploc;
	BSTMovieNode loc;
	BSTDirectorNode Droot;
	BSTDIrector directorobj=new BSTDIrector();
	  BSTActor  actorobj=new BSTActor();
	  BSTActorNode Aroot;
	public class BSTMovieNode{
		MovieNode data=new MovieNode();
		BSTMovieNode Rchild;
		BSTMovieNode Lchild;
		
	}
	public boolean isEmpty() {return Movieroot==null;}
	 void InsertMovie(){
		 
		 String fileToParse = "/Users/mac/Downloads/IMDB_Top50001.csv";

	        BufferedReader fileReader = null;

	       
	       
	        int i=0;
	       
	        //Delimiter used in CSV file

	        final String DELIMITER = ",";
	           int count=0;
	        try

	        {

	            String line = ",";

	            //Create the file reader

	            fileReader = new BufferedReader(new FileReader(fileToParse));

	           

	            //Read the file line by line

	            while ((line = fileReader.readLine()) != null)

	            {
	                MovieNode newnode=new MovieNode();
	                BSTMovieNode node=new BSTMovieNode();
	           		 node.data=newnode;
	                //Get all tokens available in line

	                String[] column = line.split(DELIMITER);

//	                System.out.println( "||");

	                count++;//count is used to insure that the values are inserted correctly
	                     //because first time when the loop executes
	                    //it will read this:
	                    //color,director_name,num_critic_for_reviews,duration,director_facebook_likes,actor_3_facebook_likes,actor_2_name,actor_1_facebook_likes,gross,genres,actor_1_name,movie_title,num_voted_users,cast_total_facebook_likes,actor_3_name,facenumber_in_poster,plot_keywords,movie_imdb_link,num_user_for_reviews,language,country,content_rating,budget,title_year,actor_2_facebook_likes,imdb_score,aspect_ratio,movie_facebook_likes
	                    // which is the titles of every fields
	                for(String token : column)

	                {   i++;// i will help in inserting the values properly
	                    if(count>1)
	                {  
	                       if(i==1) //token contains the color
	                          node.data.color=token;
	                       else if(i==2)
	                       {  //token contains the director's name
	                          
	                    	   //System.out.println("INsert movie method director :"+token);
	                           node.data.director=directorobj.InsertDirector(token,node);
	                           Droot= directorobj.Directorroot;
	                       }
	                       else if(i==3&&!(token.equals("")))
	                       {  //token contains the number of critics for reviews
	                    	   
	                    	   node.data.num_critic_for_reviews=Integer.parseInt(token);
	                          
	                       }
	                       else if(i==4&&!(token.equals("")))
	                       {  
	                         //token contains the duration of movie
	                    	   
	                    	   node.data.duration=Integer.parseInt(token);
	                          
	                       }
	                       else if(i==5&&!(token.equals("")))
	                       {
	                         ////token contains director facebook likes
	                          node.data.director_facebook_likes=Integer.parseInt(token);
	                       }
	                   
	                       else if(i==6&&!(token.equals("")))
	                       {
	                         //token contains actors facebook likes
	                          node.data.actor_2_facebook_likes=Integer.parseInt(token);
	                       }
	                       else if(i==7)
	                       {
	                         //token contains actors name
	                           
	                           node.data.Actor1=actorobj.InsertActor(token,node);
	                           this.Aroot=actorobj.Actorroot;
	                       }
	                       else if(i==8&&!(token.equals("")))
	                       {
	                         //token contains actors facebook likes
	                    	  node.data.actor_1_facebook_likes =Integer.parseInt(token);
	                       }
	                       else if(i==9&&!(token.equals("")))
	                       {   //token contains the gross of movie
	                    	   
	                    	   node.data.gross=Double.parseDouble(token);
	                       }
	                       else if(i==10)
	                       {   //token contains the genres of the movie
	                          
	                           Genre objk=new Genre();
	                           node.data.genres=objk.ListCreate(token);
	                       }
	                       else if(i==11)
	                       {
	                         //token contains actors name
	                           
	                    	   node.data.Actor2=actorobj.InsertActor(token,node);
	                           this.Aroot=actorobj.Actorroot;
	                       }
	                       else if(i==12)
	                       {    //token contains the title of the movie
	                    	   node.data.movie_title=token;
	                           
	                           //System.out.println(" /////"+newnode.movie_title+"count="+count);
	                       }
	                       else if(i==13&&!(token.equals("")))
	                       {
	                         //token contains the number of voted users
	                    	   
	                    	   node.data.num_voted_users=Integer.parseInt(token);
	                       }
	                       else if(i==14&&!(token.equals("")))
	                       {    //token contains the cast's total facebook likes
	                    	   
	                    	   node.data.cast_total_facebook_likes=Integer.parseInt(token);
	                       }
	                       else if(i==15)
	                       {
	                         //token contains actors name
	                           
	                    	   node.data.Actor3=actorobj.InsertActor(token,node);
	                           this.Aroot=actorobj.Actorroot;
	                       }     
	                       else if(i==16&&!(token.equals("")))
	                       {   //token contains the No of faces in the poster
	                    	   
	                    	   node.data.facenumber_in_poster=Integer.parseInt(token);
	                       }
	                       else if(i==17)
	                       {     //token contains the plot keywords
	                    	   Plot objk=new Plot();
	                    	   node.data.plot_keywords=objk.ListCreate(token);
	                          
	                       }
	                       else if(i==18)
	                       {   //token contains the imdb link
	                    	   
	                    	   node.data.movie_imdb_link=token;
	                       }
	                       else if(i==19&&!(token.equals("")))
	                       {   //token contains the number of user for reviews
	                    	   
	                    	   node.data.num_user_for_reviews=Integer.parseInt(token);
	                       }
	                       else if(i==20)
	                       {   //token contains the language of the movie
	                    	   node.data.language=token;
	                       }
	                       else if(i==21)
	                       {   //token contains the country
	                    	   node.data.country=token;
	                          
	                       }
	                       else if(i==22)
	                       {   //token contains the rating of the movie
	                    	   node.data.content_rating=token;
	                       }
	                       else if(i==23&&!(token.equals("")))
	                       {   //token contains the budget of the movie
	                    	   node.data.budget=Double.parseDouble(token);
	                       }
	                       else if(i==24&&!(token.equals("")))
	                       {   //token contains the year
	                    	   node.data.title_year=Integer.parseInt(token);
	                       }
	                       else if(i==25&&!(token.equals("")))
	                       {
	                          node.data.actor_3_facebook_likes=Integer.parseInt(token); 
	                       }
	                       else if(i==26&&!(token.equals("")))
	                       {  //token contains the imdb score of the movie
	                    	   node.data.imdb_score=(long) Double.parseDouble(token); 
	                       }
	                       else if(i==27&&!(token.equals("")))
	                       {   //token contains the aspect ratio of the movie
	                    	   node.data.aspect_ratio=(long) Double.parseDouble(token); 
	                       }
	                       else if(i==28&&!(token.equals("")))
	                       {   //token contains the facebook likes of the movie
	                    	   node.data.movie_facebook_likes=Integer.parseInt(token);
	                       }
	                       
	                       
	                      
	                }
	                    //Print all tokens

	                            

	                   // System.out.print(token+" ,");
//	                    System.out.println("   ,");
	                    

	                }
	                if(count>1)
	                {
	               	 
	           		
	           		 
	                    if(isEmpty()){
	                
	                   	 Movieroot=node;
	                 
	                 }
	                 
	                 else{
	                 loc=Movieroot; ploc=null;
	                 
	                 while(loc!=null){
	               	 
	                 if(newnode.movie_title.compareTo(loc.data.movie_title)<-1)
	                 { ploc=loc;
	                 loc=loc.Lchild;}
	                 else {
	                 ploc=loc;
	                 loc=loc.Rchild;
	                 }   }
	                 
	                 if(newnode.movie_title.compareTo(ploc.data.movie_title)<-1){
	                 ploc.Lchild=node;}
	                 else{
	                  ploc.Rchild=node;
	                 }
	                 }
	                }
	                           i=0;
	            }
	           
	          

	        }

	        catch (Exception e) {

	            e.printStackTrace();

	        }

	        finally

	        {

	            try {

	                fileReader.close();

	            } catch (IOException e) {

	                e.printStackTrace();

	            }
			
			
			
	        }
		 
  }
	
	 
	 public void search(String movie) {
		    ploc=null; loc=Movieroot;
		    while(loc!=null&&(movie.compareTo(loc.data.movie_title)!=0))
		    {  System.out.println(loc.data.movie_title);
		    	if(movie.compareTo(loc.data.movie_title)<-1)
		      {ploc=loc; loc=loc.Lchild;

		      }
		    else 
		    {ploc=loc; loc=loc.Rchild;
		    
		    }
		    
		    }
		    if(loc==null)
		        System.out.println("Movie not found");
		        else
		        	System.out.println("Movie found "+loc.data.movie_title);
		   
		} 
     public void printDirectors( BSTDirectorNode node) {
		 
    	 if(node==null)
 			return;
 		else
 		{
 	    System.out.println("Director Name ::"+node.Director_name);
 	    for(DirectedMovieslist temp=node.movie;temp!=null;temp=temp.next)
 	    System.out.print("\t "+temp.movie.data.movie_title+"");
 	    System.out.println("");
 		printDirectors(node.Lchild);
 		printDirectors(node.Rchild);
 		}
 	
 
		 
		 
	 }
     public void printMovie(BSTMovieNode temp) {
         System.out.print("Color:"+temp.data.color+"\t");
            System.out.print("Director :"+temp.data.director.Director_name+"\t");
            System.out.print("No of critics :"+temp.data.num_critic_for_reviews+"\t");
            System.out.print("Duration :"+temp.data.duration+"\t");
            //actors names
           System.out.print("Gross :"+temp.data.gross+"\t");
           for(ProjectBST.Genre.GenresSinglyList temp1=temp.data.genres;temp1!=null;temp1=temp1.next)
           System.out.print("Genres :"+temp1.data+"\t");
           System.out.print("Movie :"+temp.data.movie_title+"\t");
           System.out.print("No of voted users :"+temp.data.num_voted_users+"\t");
           System.out.print("Total fb likes :"+temp.data.cast_total_facebook_likes+"\t");
           System.out.print("Face no in poster :"+temp.data.facenumber_in_poster+"\t");
           for(ProjectBST.Plot.PlotSinglyList temp1=temp.data.plot_keywords;temp1!=null;temp1=temp1.next)
               System.out.print("Plot :"+temp1.data+"\t");
           System.out.print("Actor1 :"+temp.data.Actor1.Actor_name+"\t");
           System.out.print("Actor2 :"+temp.data.Actor2.Actor_name+"\t");
           System.out.print("Actor3 :"+temp.data.Actor3.Actor_name+"\t");
           System.out.print("Imdb link :"+temp.data.movie_imdb_link+"\t");
           System.out.print("No of user for reviews"+temp.data.num_user_for_reviews+"\t");
           System.out.print("Laguage: "+temp.data.language+"\t");
           System.out.print("Country :"+temp.data.country+"\t");
           System.out.print("Rating :"+temp.data.content_rating+"\t");
           System.out.print("Budget :"+temp.data.budget+"\t");
           System.out.print("Year :"+temp.data.title_year+"\t");
           System.out.print("Imdb score :"+temp.data.imdb_score+"\t");
           System.out.print("Aspect Ratio :"+temp.data.aspect_ratio+"\t");
           System.out.print("Movies FB Likes"+temp.data.movie_facebook_likes+"\t");
           System.out.println("______");
        
     }
     public void printActors(BSTActorNode node) {
    	 if(node==null)
    		 return;
    	 else
    	 {
    		 System.out.println("Actor Name ::"+node.Actor_name);
    		 printActors(node.Lchild);
    		 printActors(node.Rchild);
    	 }
    	 
    	 
     }
	public void printMovies(BSTMovieNode node) {
		if(node==null)
			return;
		else
		{
	    System.out.println("Movie Title ::"+node.data.movie_title);
		
	    
		printMovies(node.Lchild);
		printMovies(node.Rchild);
		}
	
	
	}
	
	
	public static void main(String[] args) {
		BSTMovie obj=new BSTMovie();
        obj.InsertMovie();
       obj.printMovies(obj.Movieroot);
       //obj.printActors(obj.Aroot);
       // obj.search("Without Limits ");
//        obj.printDirectors(obj.Droot);
       obj.actorobj.search("Chris Evans");
        for(ActedMlist temp=obj.actorobj.loc.movie;temp!=null;temp=temp.next)
        obj.printMovie(temp.movie);
	
	}
	
       


}



