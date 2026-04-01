class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev,next;

    Movie(String t,String d,int y,double r){
        title=t; director=d; year=y; rating=r;
    }
}

class MovieDLL {
    Movie head;

    void add(String t,String d,int y,double r){
        Movie m=new Movie(t,d,y,r);
        if(head==null){ head=m; return;}
        Movie temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=m; m.prev=temp;
    }

    void display(){
        Movie temp=head;
        while(temp!=null){
            System.out.println(temp.title+" "+temp.rating);
            temp=temp.next;
        }
    }
}