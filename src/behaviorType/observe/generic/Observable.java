package behaviorType.observe.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @param <S> subject
 * @param <O> object
 * @param <A> argument
 */
public class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
    private List<O> observers;

    public Observable() {
        observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        observers.add(observer);
    }

    public void removeObserver(O observer) {
        observers.remove(observer);
    }

    @SuppressWarnings("unchecked")
    public void notifyObservers(A argument) {
        for (Observer o : observers) {
            o.update((S) this, argument);
        }
    }
}
