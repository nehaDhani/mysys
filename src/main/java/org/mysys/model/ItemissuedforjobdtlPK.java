package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itemissuedforjobdtl database table.
 * 
 */
@Embeddable
public class ItemissuedforjobdtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="itj_id", insertable=false, updatable=false)
	private long itjId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ItemissuedforjobdtlPK() {
	}
	public long getItjId() {
		return this.itjId;
	}
	public void setItjId(long itjId) {
		this.itjId = itjId;
	}
	public long getItemid() {
		return this.itemid;
	}
	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemissuedforjobdtlPK)) {
			return false;
		}
		ItemissuedforjobdtlPK castOther = (ItemissuedforjobdtlPK)other;
		return 
			(this.itjId == castOther.itjId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itjId ^ (this.itjId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}