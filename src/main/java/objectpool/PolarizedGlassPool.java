package objectpool;

/**
 * @author nemo
 * PolarizedGlass object pool.
 */
public class PolarizedGlassPool extends ObjectPool<PolarizedGlass> {

    @Override
    protected PolarizedGlass create() {
        return new PolarizedGlass();
    }
}
