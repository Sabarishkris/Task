package arraylist.circularbuffer;

import java.util.ArrayList;

public class CircularBuffer {
        int max;
        ArrayList<String> arr;
        int curIndex;
        CircularBuffer(int maxSize){
            this.max=maxSize;
            arr=new ArrayList<>(maxSize);
            curIndex=0;
        }

        public void addMessage(String s) {
            if(arr.size()>=max){
                arr.set(curIndex,s);
            }
            else
                arr.add(s);
            curIndex=(curIndex+1)%max;
        }

        public void printMessage() {
            for(String temp:arr){
                System.out.println(temp);
            }
        }
    }
    class CircularDemo{
        public static void main(String[] args) {
            CircularBuffer circularBuffer=new CircularBuffer(5);

            circularBuffer.addMessage("Message 1");
            circularBuffer.addMessage("Message 2");
            circularBuffer.addMessage("Message 3");
            circularBuffer.addMessage("Message 4");
            circularBuffer.addMessage("Message 5");
            circularBuffer.addMessage("Message 6");
            circularBuffer.addMessage("Message 7");
            circularBuffer.printMessage();
        }
    }
