package specification.selector;

import java.util.Arrays;
import java.util.List;

/**
 * A Selector defined as the conjunction (AND) of other (leaf) selectors.
 */
public class ConjunctionSelector<T> extends AbstractSelector<T> {

    private final List<AbstractSelector<T>> leafComponents;

    @SafeVarargs
    ConjunctionSelector(AbstractSelector<T>... selectors) {
        this.leafComponents = Arrays.asList(selectors);
    }

    /**
     * Tests if *all* selectors pass the test.
     */
    @Override
    public boolean test(T t) {
        return leafComponents.stream().allMatch(comp -> (comp.test(t)));
    }
}