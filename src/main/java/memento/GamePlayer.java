package memento;
/**
 * @author 1851594王思桐
 */
class GamePlayer {

    private int[][] board = {
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,1,1,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,2,2,2,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0,0,0,0,0,2,2,2,0},
            {0,0,0,0,0,0,0,0,0,0,0,0}
    };
    GameMemento initialMemento;

    public GamePlayer(){
        initialMemento = getGameMemento();
    }

    public void play(){
        //...
        board[4][4] = 0;
        board[5][5] = 1;

    }

    /**
     * Outer interface to show current Map of the GamePlayer.
     * @return a String with information and current Map.
     */
    public String showBoard() {
        String a = "";
        for(int i = 0;i<12;i++){
            a+="\t\t";
            for(int j = 0;j<12;j++){
                a+= board[i][j]+" ";
            }
            a+="\n";
        }
        return this+":"+"showMap():\n"+a;
    }

    /**
     * Outer interface to restart the GamePlayer instead of new another one.
     */
    public void restart(){
        loadGameMemento();
    }

    /**
     * generate a Memento for the initial state of GamePlayer
     * @return state:the Memento itself.
     */
    GameMemento getGameMemento(){
        GameMemento state = new GameMemento();
        state.setBoard(board);
        return state;
    }

    /**
     * Copy the board from initialMemento.
     */
    void loadGameMemento(){
        for(int i =0;i<12;i++)
            for(int j = 0;j<12;j++)
                board[i][j] = initialMemento.board[i][j];
    }


    private static class GameMemento{
        private int[][] board;

        public int[][] getBoard() {
            return board;
        }

        public GameMemento(){
            board = new int[12][12];
        }

        /**
         * copy the GamePlayer's initial map to memento map
         * @param board:initial map from GamePlayer
         */
        public void setBoard(int[][] board) {
            for(int i =0;i < 12;i++)
                for(int j = 0;j < 12;j++)
                    this.board[i][j] = board[i][j];
        }
    }
}
