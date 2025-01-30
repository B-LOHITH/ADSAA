class Node{
    int value;
    Node next;
    public Node(int value) {
        this.value=value;
    }
    
}
class L {
    Node head;
    Node tail;
    Node n;
    int size=0;
    public void insert(int val){
        n=new Node(val);
        n.next=head;
        head=n;
        size++;

    }
    public void display(){
        Node temp;
        temp=head;
        while(temp!=null){
            if(temp.next==null){
                tail=temp;
            }
            System.err.print(temp.value+"->");
            temp=temp.next;
        }
        System.err.println("end");
    }
}
class LL{
    public static void main(String[] args) {
        L l=new L();
        l.insert(1);
        l.insert(2);
        l.insert(99);
        l.insert(69);
        l.display();
        System.err.println(l.tail.value);

    }
}