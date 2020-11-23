package pipeline;

class ProhibitEquipment implements Handler<Equipment, Equipment>{
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        /**
         * set the equipment not in use to examine and repair.
         */
        if(input.isInUse()){
            input.setIsInUse(false);
        }
        System.out.println("\t"+this+":\n\tProhibit: "+input.toString());
        return input;
    }
}
