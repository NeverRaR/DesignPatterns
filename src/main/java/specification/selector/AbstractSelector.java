package specification.selector;

import java.util.function.Predicate;

public abstract class AbstractSelector<T> implements Predicate<T> {

    public AbstractSelector<T> and(AbstractSelector<T> other) {
        return new ConjunctionSelector<>(this, other);
    }

    public AbstractSelector<T> or(AbstractSelector<T> other) {
        return new DisjunctionSelector<>(this, other);
    }

    public AbstractSelector<T> not() {
        return new NegationSelector<>(this);
    }
}
