package com.ct.Loan.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Docs {
	@Id
	private Long docId;
	private String  docName;
	private String docPath;
	public Long getDocId() {
		return docId;
	}
	public void setDocId(Long docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocPath() {
		return docPath;
	}
	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}
	public Docs(Long docId, String docName, String docPath) {
		super();
		this.docId = docId;
		this.docName = docName;
		this.docPath = docPath;
	}
	@Override
	public String toString() {
		return "Docs [docId=" + docId + ", docName=" + docName + ", docPath=" + docPath + "]";
	}
	
public Docs() {
	// TODO Auto-generated constructor stub
}
	
	

}
