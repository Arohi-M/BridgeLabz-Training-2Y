class User{
    int id;
    String name;
    User next;
    User(int i,String n){id=i;name=n;}
}

class SocialMediaSLL{
    User head;

    void addUser(int i,String n){
        User u=new User(i,n);
        u.next=head; head=u;
    }
}