package databean;

import java.io.Serializable;

public class PositionPrimaryKeys implements Serializable {
	private static final long serialVersionUID = 1L;
	protected int customerId;
    protected int fundId;

    public PositionPrimaryKeys() {
    }

    public PositionPrimaryKeys(int customerId, int fundId) {
        this.setCustomerId(customerId);
        this.setFundId(fundId);
    }

    public boolean equals(PositionPrimaryKeys primaryKeys) {
        return this.customerId == primaryKeys.getCustomerId() && this.fundId == primaryKeys.getFundId();
    }

    public int hashCode() {
        return (31 * this.customerId) ^ (37 * this.fundId);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }
}
