package structureType.composite;

import java.util.List;

public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        for (Letter letter : letters) {
            add(letter);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
