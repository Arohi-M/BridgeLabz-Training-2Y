class Book{
    int id;
    String title,author;
    boolean available;
    Book prev,next;

    Book(int i,String t,String a){
        id=i; title=t; author=a; available=true;
    }
}

class LibraryDLL{
    Book head;

    void add(int i,String t,String a){
        Book b=new Book(i,t,a);
        if(head==null){head=b;return;}
        Book temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=b; b.prev=temp;
    }

    void display(){
        Book temp=head;
        while(temp!=null){
            System.out.println(temp.title);
            temp=temp.next;
        }
    }
}