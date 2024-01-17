class Node{
    int data;
    Node next;
    Node(int newdata){data=newdata;}
    class QueuePtr1{
        Node front,rear;
        QueuePtr1(){rear=front=null;}
        
        Boolean isEmpty(){if(front==null)return true;
        else return false;
        }
        void ENQUEUE(int x){Node N=new Node(x);
        if(rear !=null){rear.next=N;
        rear =N;
        }
        else{front=rear=N;}
        }
        int FRONT(){if (!isEmpty())return front.data;else{System.out.println("error queue is Empty");
        return -1111;
        
        }
    }
        void DEQUEUE(){if(isEmpty())System.out.println("error queue is empty");
        else front =front.next;
        }
}
    class PointerlmOfQueue{

    public static void main(String[] args) {
    QueuePtr1 Q = new QueuePtr1();
    Q.ENQUEUE(45);
    Q.ENQUEUE(55);
      Q.ENQUEUE(43);
       Q.ENQUEUE(22);
       while(!Q.isEmpty()){
           System.out.println(Q.FRONT());
       }
      
    }
    
}
}
