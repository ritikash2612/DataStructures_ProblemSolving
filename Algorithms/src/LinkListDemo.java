
public class LinkListDemo {

	static class Node {
		Node next = null;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public class LinkedList {
		Node head;

		public void addNode(int data) {

			Node newNode = new Node(data);

			if (this.head == null) {
				this.head = newNode;
			}

//			Node current = this;
			while (newNode.next != null) {
				newNode = newNode.next;
			}
			newNode.next = new Node(data);
		}

		public void prepend(int data) {
			Node newHead = new Node(data);
			newHead.next = head;
			head = newHead;

		}

		public void deleteNode(int data) {
			if (head == null)
				return;

			if (head.data == data) {
				head = head.next;
				return;
			}

			Node current = head;
			while (current.next != null) {
				if (current.next.data == data) {
					current.next = current.next.next;
					return;
				}
				current = current.next;
			}
		}

		public void printList(Node head) {
			if (head != null) {
				Node currNode = head;

				System.out.print("LinkedList: ");

				// Traverse through the LinkedList
				while (currNode != null) {
					// Print the data at current node
					System.out.print(currNode.data + " ");

					// Go to next node
					currNode = currNode.next;
				}
			}
		}
	}
}
