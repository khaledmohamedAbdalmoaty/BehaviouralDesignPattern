package com.basePackage_khaled.TemplatePattern;

public abstract class Task {
private AuditTrail auditTrail;
public Task(){
    this.auditTrail=new AuditTrail();
}
public void execute(){
    auditTrail.record();
    doExcute();
}
protected abstract void doExcute();
}
