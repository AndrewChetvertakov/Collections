package collections.LinkedListPractice;

public class LinkedScrubList {
    public static void main(String[] args) {
        LinkedScrubList linkedScrubList = new LinkedScrubList();
        ScrubNode first = linkedScrubList.new ScrubNode(10);


    }

    class ScrubNode{
        int data;
        ScrubNode next;

        ScrubNode(int data){
            this.data = data;
            next = null;
        }
    }

}
