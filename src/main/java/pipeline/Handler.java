package pipeline;

interface Handler<I, O> {
    O process(I input);
}
