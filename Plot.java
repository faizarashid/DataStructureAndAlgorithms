package ProjectBST;

import java.util.StringTokenizer;


public class Plot {
    public PlotSinglyList Plotstart;
    public class PlotSinglyList{
        String data;
       PlotSinglyList next;
        
    }
    public PlotSinglyList ListCreate(String token) {
         StringTokenizer stk=new StringTokenizer(token,"|");
         System.out.println("The total tokens ="+stk.countTokens());
         String t;
        while(stk.hasMoreTokens())
        {  
         
           this.insert(stk.nextToken());
            
            
        }
        return Plotstart;
        
    }
    public boolean isEmpty() {
        return Plotstart==null;
    }
    public void insert(String t) {
        PlotSinglyList newnode=new PlotSinglyList();
        newnode.data=t;
        PlotSinglyList temp=Plotstart;   
        if(isEmpty())
            {newnode.next=null;
            Plotstart=newnode;
            }
        else
        {while(temp.next!=null)
            temp=temp.next;
        temp.next=newnode;
        newnode.next=null;}
       
    }
   
    public void printList(){
        PlotSinglyList temp=Plotstart;
        while(temp!=null){
            System.out.println(" "+temp.data);
            temp=temp.next;
            }
        if(isEmpty())
            System.out.println("Opperation not allowed : List Empty");
        }
    public static void main(String[] args) {
       

    }

}