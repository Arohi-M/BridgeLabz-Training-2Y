class Ticket{
    int id;
    String name;
    Ticket next;
    Ticket(int i,String n){id=i;name=n;}
}

class TicketSystem{
    Ticket head;

    void add(int i,String n){
        Ticket t=new Ticket(i,n);
        if(head==null){
            head=t; t.next=head;
            return;
        }
        Ticket temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=t; t.next=head;
    }
}