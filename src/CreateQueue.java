import java.util.LinkedList;

public class CreateQueue {
    private Node front;
    private Node rear;
    private LinkedList<Node> list;

    public CreateQueue() {
        list = new LinkedList<>();
        list.add(this.front);
        list.add(this.rear);
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if (list.isEmpty()){
            this.front=this.rear=node;
        }
        else {
            this.rear = node;
            this.rear.next = this.front;
        }
    }

    public Node dequeue(){
        if (list.isEmpty()){
            return null;
        }
        else if (this.front==this.rear){
            this.front = this.rear = null;
            return this.front;
        }
        else {
            this.front = this.front.next;
            rear.next = front;
            return front;
        }
    }

    public void display(){
        Node temp = front;
        while (this.rear.next != temp){
            System.out.println(temp.key);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        CreateQueue createQueue = new CreateQueue();
        createQueue.enqueue(1);
        createQueue.enqueue(2);
        createQueue.enqueue(3);
        createQueue.enqueue(4);
        createQueue.enqueue(5);

        createQueue.display();
    }
}
