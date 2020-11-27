package objectpool;

/**
 * Oliphaunt object pool.
 */
public class PolarizedGlassPool extends ObjectPool<PolarizedGlass> {

    @Override
    protected PolarizedGlass create() {
        return new PolarizedGlass();
    }
}

