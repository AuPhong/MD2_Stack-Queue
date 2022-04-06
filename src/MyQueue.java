public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail =-1;
    private int currentSize;

    public MyQueue(int size) {
        this.capacity = size;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        if (currentSize <= 0)
            return true;
        else
            return false;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue!");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow");
        }
        else {
            head++;
            if (head == capacity-1){
                System.out.println("Pop operation done ! removed: "+queueArr[head-1]);
                head = 0;
            }
            else {
                System.out.println("Pop operation done ! removed: "+queueArr[head-1]);
            }
        }
    }

    public void display(){
        for (int element:queueArr) {
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);

        queue.display();
    }
}
