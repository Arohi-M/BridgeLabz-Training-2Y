class Process{
    int id,burst;
    Process next;
    Process(int i,int b){id=i;burst=b;}
}

class RoundRobin{
    Process head;

    void add(int i,int b){
        Process p=new Process(i,b);
        if(head==null){
            head=p; p.next=head;
            return;
        }
        Process temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=p; p.next=head;
    }
}