package queue;

public class QueueUsingArray {
    int data[];
    int front;
    int rear;
    int size;

    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0 ;
    }

    public QueueUsingArray(int elem){
        data = new int[elem];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int elem) throws QueueFullException {
        if(size==data.length){
            throw new QueueFullException();
        }
        if(size==0){
            front = 0;
        }else{
            rear++;
            data[rear] = elem;
            size++;
        }

    }

    public int front() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException {
        if (size==0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        size--;
        if(size==0){
            front=-1;
            rear = -1;
        }
        return temp;
    }
}
