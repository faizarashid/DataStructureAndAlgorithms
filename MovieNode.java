package ProjectBST;

import ProjectBST.BSTActor.BSTActorNode;
import ProjectBST.BSTDIrector.BSTDirectorNode;
import ProjectBST.Genre.GenresSinglyList;
import ProjectBST.Plot.PlotSinglyList;

public class MovieNode {
	String color;
	BSTDirectorNode director;
     int num_critic_for_reviews;
     int duration;
     int director_facebook_likes;
     int actor_1_facebook_likes;
     int actor_2_facebook_likes;
     int actor_3_facebook_likes;
     BSTActorNode Actor1;
       BSTActorNode  Actor2;
       BSTActorNode  Actor3;
     double gross;
     GenresSinglyList genres;
    
     String movie_title;
     int num_voted_users;
     int cast_total_facebook_likes;
    
     int  facenumber_in_poster;
     PlotSinglyList plot_keywords;
     String movie_imdb_link;
     int num_user_for_reviews;
     String language;
     String country;
     String content_rating;
     double budget;
     int title_year;
    
     long imdb_score;
    long aspect_ratio;
     int movie_facebook_likes;

}
