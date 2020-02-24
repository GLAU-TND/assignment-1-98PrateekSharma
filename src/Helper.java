public class Helper {
    private PersonNode head;
    private PersonNode tail;
    private int size;

    public void add(PersonNode person) {
        if (isEmpty() || person.getPerson().getFirst().toLowerCase().compareTo(head.getPerson().getFirst().toLowerCase()) <= 0) {
            person.setNext(head);
            head = person;
            size++;
        } else {
            PersonNode current = head;
            PersonNode previous = null;
            while (current != null && person.getPerson().getFirst().toLowerCase().compareTo(current.getPerson().getFirst().toLowerCase()) >= 0) {
                previous = current;
                current = current.getNext();
            }
            person.setNext(previous.getNext());
            previous.setNext(person);
            size++;
        }
    }


    public boolean isEmpty() {
        return head == null;
    }

}
