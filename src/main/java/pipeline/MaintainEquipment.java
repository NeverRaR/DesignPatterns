package pipeline;

class MaintainEquipment implements Handler<Equipment,Equipment>{
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        /**
         * try to fix all problems with the equipment.
         */
        for (Equipment.Problem pr:input.getProblems()
             ) {
            pr.fix();
        }
        System.out.println("\t"+this+":\n\tMaintain: "+input.toString());
        return input;
    }
}
