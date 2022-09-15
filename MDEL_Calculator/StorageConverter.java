/**
 * the class to convert the value of storage
 */
public class StorageConverter {
    /**
     * the method to convert value of bytes to KB
     * @param bytes the value of bytes
     * @return do converting
     */
    public double bytesToKB(int bytes){
        return ((double) bytes/1024);
    }

    /**
     * the method to convert the value of bytes to MB
     * @param bytes the value of bytes
     * @return do converting
     */
    public double bytesToMB(int bytes){
        return ((double) bytesToKB(bytes)/1024);
    }

    /**
     * the method to convert of the value bytes to GB
     * @param bytes the value of bytes
     * @return do converting
     */
    public double bytesToGB(int bytes){
        return( bytesToMB(bytes)/1024);
    }

    /**
     * the method to convert the value of bytes t oTB
     * @param bytes the value of bytes
     * @return do converting
     */
    public double bytesToTB(int bytes){
        return( bytesToGB(bytes)/1024);
    }

    /**
     * the method to convert the value of bytes to PB
     * @param bytes the value of bytes
     * @return do converting
     */
    public double bytesToPB(int bytes){
        return( bytesToTB(bytes)/1024);
    }

    /**
     * the method to convert the value of the kb to bytes
     * @param kb the value of kb
     * @return do converting
     */
    public long kbToBY(int kb){
        return((long) kb*1024);
    }

    /**
     * the method to convert of the value of kb to mb
     * @param kb the value of tkb
     * @return do converting
     */
    public double kbToMB(int kb){
        return((double) kb/1024);
    }

    /**
     * the method to convert the value of the kb to gb
     * @param kb the value of kb
     * @return do converting
     */
    public double kbToGB(int kb){
        return ( kbToMB(kb)/1024);
    }

    /**
     * the method to convert the value of kb to tb
     * @param kb the value of kb
     * @return do converting
     */
    public double kbToTB(int kb){
        return( kbToGB(kb)/1024);
    }

    /**
     * the method to convert the value of kb to pb
     * @param kb the value of kb
     * @return do converting
     */
    public double kbToPB(int kb){
        return( kbToTB(kb)/1024);
    }

    /**
     * the method to convert the value of mb to by
     * @param mb the value of mb
     * @return do converting
     */
    public double mbToBY(int mb){
        return((double) kbToBY(mb)*1024);
    }

    /**
     * the method to convert the value of the mb to kb
     * @param mb the value of mb
     * @return do converting
     */
    public double mbToKb(int mb){
        return((double) mb*1024);
    }

    /**
     * the method to convert the value of mb to gb
     * @param mb the value of mb
     * @return do converting
     */
    public double mbToGB(int mb){
        return((double) mb/1024);
    }

    /**
     * the method to convert the value of mb to tb
     * @param mb the value of mb
     * @return do converting
     */
    public double mbToTB(int mb){
        return(mbToGB(mb)/1024);
    }

    /**
     * the method to convert the value of mb to pb
     * @param mb the value of mb
     * @return do converting
     */
    public double mbToPB(int mb){
        return(mbToTB(mb)/1024);
    }

    /**
     * the method to convert the value of gb to by
     * @param gb the value of gb
     * @return do converting
     */
    public double gbToBY(int gb){
        return(mbToBY(gb)*1024);
    }

    /**
     * the method to convert the value of gb to kb
     * @param gb the value of gb
     * @return do converting
     */
    public double gbToKB(int gb){
        return(mbToKb(gb)*1024);
    }

    /**
     * the method to convert the value of gb to mb
     * @param gb the value of gb
     * @return do converting
     */
    public double gbToMB(int gb){
        return((double) gb*1024);
    }

    /**
     * the method to convert the value of gb to tb
     * @param gb the value of gb
     * @return do converting
     */
    public double gbToTB(int gb){
        return((double) gb/1024);
    }

    /**
     * the method to convert the value of gb to pb
     * @param gb the value of pb
     * @return do converting
     */
    public double gbToPB(int gb){
        return(gbToTB(gb)/1024);
    }

    /**
     * the method to convert the value of tb to by
     * @param tb the value of tb
     * @return do converting
     */
    public double tbToBY(int tb){
        return(gbToBY(tb)*1024);
    }

    /**
     * the method to convert the value of tb to kb
     * @param tb the value of tb
     * @return do converting
     */
    public double tbToKB(int tb){
        return(gbToKB(tb)*1024);
    }

    /**
     * the method to convert the value of tb to mb
     * @param tb the value of tb
     * @return do converting
     */
    public double tbToMB(int tb){
        return(gbToMB(tb)*1024);
    }

    /**
     * the method to convert the value of tb to gb
     * @param tb the value of tb
     * @return do converting
     */
    public double tbToGB(int tb){
        return((double) tb*1024);
    }

    /**
     * the method to convert the value of tb to pb
     * @param tb the value of tb
     * @return do converting
     */
    public double tbToPB(int tb){
        return((double) tb/1024);
    }

    /**
     * the method to convert the value of pb to by
     * @param pb the value of pb
     * @return do converting
     */
    public double pbToBY(int pb){
        return(tbToBY(pb)*1024);
    }

    /**
     * the method to convert the value of pb to kb
     * @param pb the value of pb
     * @return do converting
     */
    public double pbToKB(int pb){
        return(tbToKB(pb)*1024);
    }

    /**
     * the method to convert the value of pb to mb
     * @param pb the value of pb
     * @return do converting
     */
    public double pbToMB(int pb){
        return(tbToMB(pb)*1024);
    }

    /**
     * the method to convert the value of pb to gb
     * @param pb the value of pb
     * @return do converting
     */
    public double pbToGB(int pb){
        return(tbToGB(pb)*1024);
    }

    /**
     * the method to convert the value of pb to tb
     * @param pb the value of pb
     * @return do converting
     */
    public double pbToTB(int pb){
        return((double) pb*1024);
    }
}
