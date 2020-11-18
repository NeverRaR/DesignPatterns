package pipeline;

class EquipmentMaintenancePipeline<I,O> {

    private final Handler<I,O> currentHandler;

    EquipmentMaintenancePipeline(Handler<I,O> currentHandler){
        this.currentHandler = currentHandler;
    }
    <K> EquipmentMaintenancePipeline<I,K> addHandler(Handler<O,K> newHandler){
        return new EquipmentMaintenancePipeline<>(
                input -> newHandler.process
                        (currentHandler.process((input))));
    }
    O execute(I input){
        return currentHandler.process(input);
    }
}
