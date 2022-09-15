package MDEL_Calculator;

/**
 * the class to do MoneyExchange
 */
public class MoneyExchange {
    /**
     * the method to change the money of riel to dola
     * @param riel value of money for the changing
     * @return do changing by 4000 rate
     */
    public float rielTo_dola(int  riel){
        return ((float) riel/4000);
    }

    /**
     * the method to change the money of riel to euro
     * @param riel value of money for the changing
     * @return do changing by 6000 rate
     */
    public float rielTo_euro(int  riel){
        return ((float) riel/6000);
    }

    /**
     * the method to change the money of riel to france
     * @param riel value of money for the changing
     * @return do changing by 4500 rate
     */
    public float rielTo_france(int riel){
        return ((float) riel/4500);
    }

    /**
     * the method to change the money of riel to thai
     * @param riel value of money for the changing
     * @return do changing by 100 rate
     */
    public float rielTo_thai(int  riel){
        return ((float) riel/100);
    }

    /**
     * the method to change the money of dola to riel
     * @param dola value of money for the changing
     * @return do changing by 4000 rate
     */
    public int dolaTo_riel(int dola){
        return (dola*4000);
    }

    /**
     * the method to change the money of euro to riel
     * @param euro value of money for the changing
     * @return do changing by 6000 rate
     */
    public int euroTo_riel(int euro){
        return (euro*6000);
    }

    /**
     * the method to change the money of france to riel
     * @param france value of money for the changing
     * @return do changing by 4500 rate
     */
    public int franceTo_riel(int france){
        return (france*4500);
    }

    /**
     * the method to change the money of thai to riel
     * @param thai value of money for the changing
     * @return do changing by 100 rate
     */
    public int thaiTo_riel(int thai){
        return (thai*100);
    }
}