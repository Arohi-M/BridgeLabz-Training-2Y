class Item{
    int id,qty;
    String name;
    double price;
    Item next;
    Item(int i,String n,int q,double p){
        id=i; name=n; qty=q; price=p;
    }
}

class InventorySLL{
    Item head;

    void add(int i,String n,int q,double p){
        Item it=new Item(i,n,q,p);
        it.next=head; head=it;
    }

    double total(){
        double sum=0;
        Item temp=head;
        while(temp!=null){
            sum+=temp.qty*temp.price;
            temp=temp.next;
        }
        return sum;
    }
}