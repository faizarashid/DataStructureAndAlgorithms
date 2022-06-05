package ProjectBST;

import java.util.StringTokenizer;


public class Genre {
    public GenresSinglyList Genresstart;
     public class GenresSinglyList{
         String data;
         GenresSinglyList next;
         
     }
     public GenresSinglyList ListCreate(String token) {
          StringTokenizer stk=new StringTokenizer(token,"|");
          System.out.println("The total tokens ="+stk.countTokens());
          String t;
         while(stk.hasMoreTokens())
         {  
          
            this.insert(stk.nextToken());
             
             
         }
         return Genresstart;
         
     }
    public boolean isEmpty() {
        return Genresstart==null;
    }
    public void insert(String t) {
        GenresSinglyList newnode=new GenresSinglyList();
        newnode.data=t;
        GenresSinglyList temp=Genresstart;   
        if(isEmpty())
            {newnode.next=null;
            Genresstart=newnode;
            }
        else
        {while(temp.next!=null)
            temp=temp.next;
        temp.next=newnode;
        newnode.next=null;}
       
    }
   
    public void printList(){
        GenresSinglyList temp=Genresstart;
        while(temp!=null){
            System.out.println(" "+temp.data);
            temp=temp.next;
            }
        if(isEmpty())
            System.out.println("Opperation not allowed : List Empty");
        }
    public static void main(String[] args) {
       
        Genre obj=new Genre();
        obj.ListCreate("Action|Adventure|Fantasy|Sci-Fi");
        //obj.printList();
        System.out.println(obj.Genresstart);
       
    }
}




