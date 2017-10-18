package structureType.composite;

public class CompositeTest {
    public static void main(String[] args) {
        System.out.println("message from the orcs");
        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        System.out.println("------------------");
        System.out.println("message from the elves");

        LetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
