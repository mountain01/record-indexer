package server.models;

/**
 * Created by Matt on 10/14/2014.
 */
public class Record {
    int recordid;
    int batchid;

    /**
     * get batches associated record id
     * @return
     */
    public int getRecordid() {
        return recordid;
    }

    /**
     * set batches associated record id
     * @param recordid
     */
    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    /**
     * get batch id for batch
     * @return
     */
    public int getBatchid() {
        return batchid;
    }

    /**
     * set batch id number for batch
     * @param batchid
     */
    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }
}
