package pipeline;

class ProhibitEquipment implements Handler<Equipment, Equipment>{
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        if(input.isInUse()){
            input.setIsInUse(false);
        }
        System.out.println("Prohibit: "+input.toString());
        return input;
    }
}
