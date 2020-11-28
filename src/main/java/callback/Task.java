package callback;

import java.util.Optional;

/**
 * @Title: goToTheBathroom.java
 * 
 * @Package callback
 * 
 * @Description: Template-method class for callback hook execution.
 * 
 * @author Jiajie
 * 
 * @date 2020/11/28
 */
public abstract class Task {

    /**
     *
     * @Description: Execute with callback.
     *
     * @param callback
     */
    final void executeWith(Callback callback) {
        execute();
        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    public abstract void execute();
}
