package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prodrecdafterjobdtl database table.
 * 
 */
@Embeddable
public class ProdrecdafterjobdtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="prj_id", insertable=false, updatable=false)
	private long prjId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ProdrecdafterjobdtlPK() {
	}
	public long getPrjId() {
		return this.prjId;
	}
	public void setPrjId(long prjId) {
		this.prjId = prjId;
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
		if (!(other instanceof ProdrecdafterjobdtlPK)) {
			return false;
		}
		ProdrecdafterjobdtlPK castOther = (ProdrecdafterjobdtlPK)other;
		return 
			(this.prjId == castOther.prjId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.prjId ^ (this.prjId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}