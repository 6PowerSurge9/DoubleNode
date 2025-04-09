public class test_of_DoubleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleNode head = new DoubleNode (7.77, null);
		head.addNodeAfter(36);
		head.addNodeAfter(88);
		head.addNodeAfter(69.8);
		

		
		
		System.out.print("Make list: \t");
		printList(head);

		System.out.print("\nListCopyPart :\t");
        DoubleNode[] copyNodes = DoubleNode.listCopyPart(head,  DoubleNode.listSearch(head,36));
        printList(copyNodes[0]);	
        
        System.out.print("\nList Copy: \t");
        DoubleNode fullCopy = DoubleNode.listCopy(head);
        printList(fullCopy);
        
		System.out.print("\t" + head + "\t" + fullCopy + "\t" + (head == fullCopy));

		System.out.print("\nList Length: \t" + DoubleNode.listLength(head));

		System.out.print("\nList Search: \t" + DoubleNode.listSearch(head, 69.8).getData());

		
		
		
	}
	
	
	public static void printList(DoubleNode head) {
		   if (head == null) {
			   System.out.println("This line is empty.");
		   }
		                                    //******** this might need fixing ********* 
		   while (head != null) {
			   
			   System.out.println(head.getData());
			   head = head.getLink();
		   }
		   System.out.print(" ");
		   
	}

}

