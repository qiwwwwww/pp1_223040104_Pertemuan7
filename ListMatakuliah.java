package Tugas7;

public class ListMatakuliah {

	 private Node HEAD;

	    // Konstruktor
	    public ListMatakuliah() {
	        this.HEAD = null; // Menginisialisasi HEAD dengan null menandakan list kosong
	    }

	    // Method untuk memeriksa apakah list kosong
	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	    // Method untuk menambahkan node di awal list
	    public void addHead(Matakuliah data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            newNode.setNext(HEAD);
	            HEAD = newNode;
	        }
	    }
	    
	    
	    public void addMiddle(Matakuliah data, int position) {
	    // Membuat node baru dengan data Matakuliah
	    Node newNode = new Node(data);
	    
	    // Jika linked list kosong atau posisi adalah 1, node menjadi head
	    if (HEAD == null || position == 1) {
	        newNode.setNext(HEAD);
	        HEAD = newNode;
	    } else {
	        Node curNode = HEAD;
	        Node posNode = null;
	        int i = 1;
	        while (curNode != null && i < position) {
	            posNode = curNode;
	            curNode = curNode.getNext();
	            i++;
	        }
	        
	        // Jika posisi ditemukan, sisipkan node baru di antara posNode dan curNode
	        if (curNode != null) {
	            posNode.setNext(newNode);
	            newNode.setNext(curNode);
	        } else {
	            posNode.setNext(newNode);
	        }
	    }
	}

	    
	    public void addTail(Matakuliah data) {
	    // Membuat Node baru dengan data Matakuliah
	    Node newNode = new Node(data);
	    
	    // Jika linked list kosong, node baru menjadi HEAD
	    if (isEmpty()) {
	        HEAD = newNode;
	    } else {
	        Node curNode = HEAD;
	        while (curNode.getNext() != null) {
	            curNode = curNode.getNext();
	        }
	        curNode.setNext(newNode);
	    }
    }

		public void displayElement() {
		}
}
