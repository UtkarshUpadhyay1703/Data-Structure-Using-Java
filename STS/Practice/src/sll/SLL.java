package sll;

public class SLL {
	static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
	public static int countString(String S) {
		int ans=0;
		int small=0;
		int big=0;
//		System.out.println(S.charAt(3));
//		System.out.println(S.substring(0,3));
		for(int i=0;i<S.length()-1;i++) {
			for(int j=i;j<S.length();j++) {
				small=0;
				big=0;
				String subStr=S.substring(i,j+1);
//				System.out.println(subStr);
				for(int k=0;k<subStr.length();k++) {
					if(subStr.charAt(k)>='a' && subStr.charAt(k)<='z') {
//						System.out.println(subStr.charAt(k)+"  k = "+k);
//						System.out.println(subStr);
						small++;
					}else {
//						System.out.println(subStr.charAt(k)+"  k = "+k);
						big++;
					}
				}
//				System.out.println(small+"   Big = "+big);
				if(small==big) {
					ans++;
//					System.out.println(small+"  "+big);
				}
			}
		}
		return ans;
	}
	
	public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
	 if(llist==null && position!=1){
	        return null;
	    }
	    SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
	    if(position==1){
	        newNode.next=llist;
	        return newNode;
	    }
	    if(llist==null && position==2){
	        return null;
	    }
	    
	    if(position==2){
	        newNode.next=llist.next;
	        llist.next=newNode;
	        return llist;
	    }
	    
	    int pos=2;
	    SinglyLinkedListNode temp=llist;
	    while(pos<position && temp.next!=null){
	        temp=temp.next;
	        pos++;
	    }
	if(pos==position){
	            newNode.next=temp.next;
	            temp.next=newNode;
	            return llist;
	        }else{
	            return null;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL s=new SLL();
//		System.out.println(s.insertNodeAtPosition(null, 0, 0));
		System.out.println(s.countString("WomensDAY"));
	}

}
