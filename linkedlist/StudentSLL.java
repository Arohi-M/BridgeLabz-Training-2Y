class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;

    Student(int r, String n, int a, String g){
        roll=r; name=n; age=a; grade=g;
    }
}

class StudentSLL {
    Student head;

    void add(int r,String n,int a,String g){
        Student s=new Student(r,n,a,g);
        s.next=head;
        head=s;
    }

    void delete(int roll){
        if(head==null) return;
        if(head.roll==roll){ head=head.next; return;}
        Student curr=head;
        while(curr.next!=null && curr.next.roll!=roll) curr=curr.next;
        if(curr.next!=null) curr.next=curr.next.next;
    }

    Student search(int roll){
        Student temp=head;
        while(temp!=null){
            if(temp.roll==roll) return temp;
            temp=temp.next;
        }
        return null;
    }

    void display(){
        Student temp=head;
        while(temp!=null){
            System.out.println(temp.roll+" "+temp.name);
            temp=temp.next;
        }
    }
}