package pipeline;

class CommitEquipment implements Handler<Equipment,Equipment>{
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        /**
         * if an equipment has no problem commit and restart it.
         */
        if(input.getProblems().size() == 0){
            input.setIsInUse(true);
        }
        System.out.println("\t"+this+":\n\tCommit: "+input.toString());
        return input;
    }
}
